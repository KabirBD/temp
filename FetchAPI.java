import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class FetchAPI {

    public static void main(String[] args) throws IOException, URISyntaxException {
        var url = new URI("https://kabirbd.github.io/temp/demo.json").toURL(); // Convert URI to URL
        var connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            var response = new StringBuilder();
            var scanner = new Scanner(connection.getInputStream());
            while (scanner.hasNextLine()) {
                response.append("\n" + scanner.nextLine());
            }
            scanner.close();

            System.out.println(response.toString());
        } else {
            System.out.println("Error: HTTP response code " + connection.getResponseCode());
        }

        connection.disconnect(); // Close the connection (good practice)
    }
}
