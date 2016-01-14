package storage.server.endpoint;

/**
 * Created by bishruti on 1/13/16.
 */

import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class FoodRecommendation {

    FoodRecommendation foodRecommendation = new FoodRecommendation();
    private static WebTarget service;
    private static Response response;

    private static URI getBaseURI() {
        return UriBuilder.fromUri(
                //Change here for passing params like low-fat,low-sugar, No-oil-added
                "http://127.0.1.1:8006/adapter/foodrecomm").build();
    }

    public static String getFoodRecomm() {
        ClientConfig clientConfig = new ClientConfig();
        Client client = ClientBuilder.newClient(clientConfig);
        service = client.target(getBaseURI());
        response = service.request().accept(MediaType.APPLICATION_JSON).get();
        String foodRecomm = response.readEntity(String.class);

        /*JSONObject jsonObj = new JSONObject(foodRecomm);
        JSONArray name = (JSONArray) jsonObj.get("hits");
        JSONObject namestr = (JSONObject) name.get(0);
        JSONObject namest = (JSONObject) namestr.get("recipe");
        System.out.println(namest.get("label"));
        System.out.println(namest.get("totalNutrients"));
        System.out.println(namest.get("ingredients"));*/

        System.out.println(foodRecomm);
        return foodRecomm;
    }
}
