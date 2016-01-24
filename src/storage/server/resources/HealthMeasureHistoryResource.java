package storage.server.resources;

import data.server.UserImplementation;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

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
        String userHisotryList = UserImplementation.getUserHistory(uId, measuretype);
        if (userHisotryList != null) {
            return Response.ok(userHisotryList).build();
        }
        else {
            return Response.status(404).build();
        }
    }
}
