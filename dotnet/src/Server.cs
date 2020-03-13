using System;
using System.Linq;
using System.IO;
using System.Threading;
using System.ServiceModel;
using System.ServiceModel.Web;

using Partner.Service;

/**
 * References:
 * http://badger.developpez.com/tutoriels/dotnet/web-service-rest-avec-wcf-3-5/#LII-B
 *  - mono server.exe /standalone  => start the server in standalone mode
 *  - mono server.exe /port 9191   => starts the server on port 9191
 * Default is interactive mode on port 9090. Options can obviously be combined
 **/
public class Server
{
  // Attirbutes to support port selection and standalone mode
  private bool Standalone = false;
  private string HostName = "localhost";
  private string Port = "9090";
  private string Locker = "server.LOCK";
  private string url => string.Format("http://{0}:{1}", HostName, Port);

  // Web Server used to host services
  private WebServiceHost Host;

  /**
   * Start the web server on the given port, and host the expected service
   */
  public void Start() {
    Console.WriteLine("Starting a WCF self-hosted .Net server... ");

    WebHttpBinding b = new WebHttpBinding();
    Host = new WebServiceHost(typeof(ParcelService), new Uri (url));

    // Adding the service to the host
    Host.AddServiceEndpoint(typeof(IParcelService), b, "");

    // Staring the Host server
    Host.Open();
    Console.WriteLine(string.Format("\nListening to {0}:{1}", HostName, Port));

    if ( Standalone ) { LockServer(); } else { Interactive(); }

  }

  /**
   * Stop the already started web server
   */
  private void Stop() {
    Host.Close ();
    Console.WriteLine("Server shutdown complete!");
  }

  /**
   * Read options fron the command line. Does not support inconsistent commands
   */
  public void Configure(string[] args) {
    this.Standalone = args.Contains("/standalone");

    int portIndex = Array.FindLastIndex(args, key => key == "/port");
    if (portIndex >= 0) { this.Port = args[portIndex + 1]; }
    
    int hostIndex = Array.FindLastIndex(args, key => key == "/host");
    if (hostIndex >= 0) { this.HostName = args[hostIndex + 1]; }
  }

  /**
   * Start the server in interactive mode, waiting for Return to
   */
  private void Interactive() {
    Console.WriteLine("Hit Return to shutdown the server.");
    Console.ReadLine();
    Stop();
  }

  /**
   * Lock the server in standalone mode using a given file
   */
  private void LockServer() {
    File.Create(Locker);
    Console.WriteLine("Delete the lock file (" + Locker + ") to stop the server");
    WatchForLockRemoval();
  }

  /**
   * Active polling of the file system (ugly) to check the existence of the lock file
   */
  private void WatchForLockRemoval() {
    do {
      Thread.Sleep(1000);
    } while(!File.Exists(Locker));
    Stop();
  }

  /**
   * Main method, called with `mono server.exe`
   */
  public static void Main(string[] args)
  {
    var server = new Server();
    server.Configure(args);
    server.Start();
  }

}
