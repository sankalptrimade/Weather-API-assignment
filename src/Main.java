import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {

        String url = "https://api.weatherbit.io/v2.0/current?lat=35.7796&lon=-78.6382&key=5af18bbff90141ad831c82df742729c2&include=minutely";
        //Building a request
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        //Getting the HttpClient object
        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpResponse<String> httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        //status code and body
        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
    }
}