package storage.server.resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import storage.server.endpoint.Quote;
import storage.server.model.DailyQuote;

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

    /*  Request to obtain quote.
   Expected Input: -
   Expected Output: Quote (String) */

    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public Response getQuote() throws JsonProcessingException {
        DailyQuote quote = Quote.getQuote();
        if (quote != null) {
            return Response.ok(quote).build();
        }
        else {
            return Response.status(404).build();
        }
    }
}