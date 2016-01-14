package storage.server.resources;

import storage.server.endpoint.Quote;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by bishruti on 1/13/16.
 */
@Stateless // Used only if the the application is deployed in a Java EE container
@LocalBean // Used only if the the application is deployed in a Java EE container

@Path("/quote")
public class QuoteResource {
    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public Response getQuote() {
        String quote = Quote.getQuote();
        if (quote != null) {
            return Response.ok(quote).build();
        }
        else {
            return Response.status(404).build();
        }
    }
}
