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

    /* Request to obtain all measure details about a measure of a user in the list.
        Expected Input: uId (Integer)
                       measureType (String)
       Expected Output: List of details of measure types. (String) */

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

    /*  Request to obtain measure details about a particular measure of a user in the list.
        Expected Input: uId (Integer)
                        measureType (String)
                        hmhId (Integer)
        Expected Output: Details of a particular measure. (String) */

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

    /* Request to create measure details about a measure of a user in the list.
       Expected Input: uId (Integer)
       measureType (String)
       MeasureDetails (Object)
       Expected Output:
       List of newly created measure. (String) */

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public void createMeasure(HealthMeasureHistory healthMeasureHistory) throws Exception {
        System.out.println("Creating new healthMeasureHistory...");
        UserImplementation.createUserMeasure(uId, healthMeasureHistory);
    }

    /*  Request to update measure details about a measure of a user in the list.
        Expected Input: uId (Integer)
        measureType (String)
        hmhId (Integer)
        MeasureDetails (Object)
        Expected Output:
        List of updated measure. (String) */

    @Path("/{hmhId}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public void updateMeasure(HealthMeasureHistory healthMeasureHistory, @PathParam("hmhId") int hmhId) throws Exception {
        System.out.println("Updating healthMeasureHistory...");
        UserImplementation.updateUserMeasure(uId, healthMeasureHistory, hmhId);
    }

    /*  Request to delete measure details about a measure of a user in the list.
        Expected Input: uId (Integer)
        hmhId (Integer)
        Expected Output: Response Message. */

    @Path("/{hmhId}")
    @DELETE
    public void deleteMeasure(@PathParam("hmhId") int hmhId) throws Exception {
        System.out.println("Deleting healthMeasureHistory...");
        UserImplementation.deleteUserMeasure(uId,hmhId);
    }
}
