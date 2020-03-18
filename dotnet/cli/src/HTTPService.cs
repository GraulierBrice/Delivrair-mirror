using System.IO;
using System.Net;

public class HTTPService {
    private const string host = "localhost";
    private const string port = "9090";
    private string base_url = string.Format("http://{0}:{1}/", host, port);

    public string SendRequest(string route) {
        var request = WebRequest.Create(base_url + route);
        var response = request.GetResponse();
        var responseString = new StreamReader(response.GetResponseStream()).ReadToEnd();
        return responseString;
    }
}