/*
 Write a code using HttpClient API which sends a GET request
to https://httpbin.org/get, and print out the response header, status code, and
body for the given URL
 */

import java.io.IOException;
import java.net.URI;
import java.net.URLConnection;
import java.net.http.*;
import java.net.http.HttpClient.Version;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

import javax.print.DocFlavor.URL;

public class question6 {
	public static void main(String[] args) throws IOException, InterruptedException {
		String link = "https://httpbin.org/get";
		URL obj = new URL(link);
		URLConnection conn = obj.openConnection();
		Map<String, List<String>> map = conn.getHeaderFields();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(link)).GET().build();
		HttpClient client = HttpClient.newBuilder().build();
		try {
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println(response.statusCode());
			System.out.println(response.body());
		}  {
			System.out.println();
		}
	}

}