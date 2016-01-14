package storage.server.resources;

import data.server.DataImplementation;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

/**
 * Created by bishruti on 1/14/16.
 */

@Stateless // Used only if the the application is deployed in a Java EE container
@LocalBean // Used only if the the application is deployed in a Java EE container
@Path("/user")
public class UserResource {
    @Context
    UriInfo uriInfo;
    @Context
    Request request;

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

    //    @Path("{uId}")
    @Path("1")
    @GET
    @Produces({ MediaType.APPLICATION_JSON})
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
