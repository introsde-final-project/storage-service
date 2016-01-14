package storage.server.resources;

import data.server.DataImplementation;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by bishruti on 1/14/16.
 */

@Stateless // Works only inside a Java EE application
@LocalBean // Works only inside a Java EE application
@Path("/goal")
public class GoalResource {
    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public Response getListOfUser() throws Exception {
        String quote = DataImplementation.getListOfUser();
        if (quote != null) {
            return Response.ok(quote).build();
        }
        else {
            return Response.status(404).build();
        }
    }
    @GET
    @Path("/1")
    public Response getUserDetail() throws Exception {
        String quote = DataImplementation.getUserDetail(1);
        if (quote != null) {
            return Response.ok(quote).build();
        }
        else {
            return Response.status(404).build();
        }

    }
}
