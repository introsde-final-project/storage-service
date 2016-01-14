package storage.server;

import org.glassfish.jersey.server.ResourceConfig;
import storage.ExceptionListener;

import javax.ws.rs.ApplicationPath;

/**
 * Created by bishruti on 1/13/16.
 */

@ApplicationPath("storage")
public class ApplicationConfig extends ResourceConfig {
    public ApplicationConfig () {
        packages("storage");
        register(ExceptionListener.class);
    }
}