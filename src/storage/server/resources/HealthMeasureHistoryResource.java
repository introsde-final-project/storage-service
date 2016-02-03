package storage.server.resources;

import data.server.UserImplementation;
import data.server.ws.HealthMeasureHistory;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;

/**
 * Created by bishruti on 1/16/16.
 */
public class HealthMeasureHistoryResource {
    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    int uId;
    String measuretype;

    public HealthMeasureHistoryResource(UriInfo uriInfo, Request request, int uId, String measuretype) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.uId = uId;
        this.measuretype = measuretype;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getUserHistory() throws Exception {
        List<HealthMeasureHistory> userHisotryList = UserImplementation.getUserHistory(uId, measuretype);
        if (userHisotryList != null) {
            return Response.ok(userHisotryList).build();
        }
        else {
            return Response.status(404).build();
        }
    }

    @Path("/{hmhId}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getUserMeasure(@PathParam("hmhId") int hmhId) throws Exception {
        List<HealthMeasureHistory> userHisotry = UserImplementation.getUserMeasure(uId, measuretype, hmhId);
        if (userHisotry != null) {
            return Response.ok(userHisotry).build();
        }
        else {
            return Response.status(404).build();
        }
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public void createMeasure(HealthMeasureHistory healthMeasureHistory) throws Exception {
        System.out.println("Creating new healthMeasureHistory...");
        UserImplementation.createUserMeasure(uId, healthMeasureHistory);
    }

    @Path("/{hmhId}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public void updateMeasure(HealthMeasureHistory healthMeasureHistory, @PathParam("hmhId") int hmhId) throws Exception {
        System.out.println("Updating healthMeasureHistory...");
        UserImplementation.updateUserMeasure(uId, healthMeasureHistory, hmhId);
    }

    @Path("/{hmhId}")
    @DELETE
    public void deleteMeasure(@PathParam("hmhId") int hmhId) throws Exception {
        System.out.println("Deleting healthMeasureHistory...");
        UserImplementation.deleteUserMeasure(uId,hmhId);
    }
}
