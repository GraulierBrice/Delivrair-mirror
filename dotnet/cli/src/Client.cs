// <Client.cs>
using System.ServiceModel;
using System;

// les interfaces client et serveur doivent
// avoir le même nom et les mêmes méthodes
// avec les mêmes types d'arguments et de retour.
[ServiceContract]
public interface DeliveryWebService
{
    [OperationContract]
    string SampleMethod(string msg);
}

public class Client {

    public static void Main(string[] args)
    {
        const string base_url = "http://localhost:9090";

        var binding = new BasicHttpBinding();
        var endpoint = new EndpointAddress(new Uri(base_url));

        // IService doit être ici aussi remplacé par la bonne interface
        var channelFactory = new ChannelFactory<DeliveryWebService>(binding, endpoint);
        var serviceClient = channelFactory.CreateChannel();
        
        // c'est ici qu'on fait la requète.
        string response = serviceClient.SampleMethod("Hello");

        // On écrit la réponse dans la console
        Console.WriteLine(response);

        channelFactory.Close();
    }
}