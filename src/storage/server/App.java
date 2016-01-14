package storage.server;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by bishruti on 1/13/16.
 */

public class App {
    public static void main(String[] args) throws IllegalArgumentException, IOException, URISyntaxException
    {
        String protocol = "http://";
        String port_value = "8004";
        if (String.valueOf(System.getenv("PORT")) != "null"){
            port_value=String.valueOf(System.getenv("PORT"));
        }
        String port = ":"+port_value+"/";
        String hostname = InetAddress.getLocalHost().getHostAddress();
        if (hostname.equals("127.0.0.1"))
        {
            hostname = "localhost";
        }

        URI BASE_URI = new URI(protocol + hostname + port +"storage/");

        JdkHttpServerFactory.createHttpServer(BASE_URI, createApp());
        System.out.println("Server started on " + BASE_URI + "\n[kill the process to exit]");
    }

    public static ResourceConfig createApp() {
        System.out.println("Starting storage service...");
        return new ApplicationConfig();
    }
}
