package storage.server.resources;

import storage.server.endpoint.FoodRecommendation;

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

@Path("/foodrecomm")

public class FoodRecommResource {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getFoodRecomm() {
        String foodRecomm = FoodRecommendation.getFoodRecomm();
        if (foodRecomm != null) {
            return Response.ok(foodRecomm).build();
        }
        else {
            return Response.status(404).build();
        }
    }
}