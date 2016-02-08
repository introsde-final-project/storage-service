package storage.server.endpoint;

/**
 * Created by bishruti on 1/13/16.
 */

import org.glassfish.jersey.client.ClientConfig;
import org.json.JSONArray;
import org.json.JSONObject;
import storage.server.model.FoodSuggestion;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.ArrayList;

public class FoodRecommendation {

    FoodRecommendation foodRecommendation = new FoodRecommendation();
    private static WebTarget service;
    private static Response response;

    private static URI getBaseURI(String foodType) {
        return UriBuilder.fromUri(
                //Change here for passing params like low-fat,low-sugar, No-oil-added
                "http://external-adapter-service.herokuapp.com/adapter/foodrecomm?foodType=" + foodType).build();
    }

      /*  Request to obtain Food Recommendation.
       Expected Input: FoodType
       Expected Output: Food Recommendation (Object) */

    public static FoodSuggestion getFoodRecomm(String foodType) {
        ClientConfig clientConfig = new ClientConfig();
        Client client = ClientBuilder.newClient(clientConfig);
        service = client.target(getBaseURI(foodType));
        response = service.request().accept(MediaType.APPLICATION_JSON).get();
        String foodRecomm = response.readEntity(String.class);

        JSONObject jsonObj = new JSONObject(foodRecomm);
        JSONArray name = (JSONArray) jsonObj.get("hits");
        JSONObject namestr = (JSONObject) name.get(0);
        JSONObject namest = (JSONObject) namestr.get("recipe");
        FoodSuggestion food = new FoodSuggestion();

        food.setLabel(namest.getString("label"));

        ArrayList<String> ingredientLines = new ArrayList<String>();
        JSONArray jsonIngredientLines = (JSONArray) namest.get("ingredientLines");
        for(int i = 0; i < jsonIngredientLines.length(); i++)
            ingredientLines.add(jsonIngredientLines.getString(i));

        food.setIngredientLines(ingredientLines);

        ArrayList<String> healthLabels = new ArrayList<String>();
        JSONArray jsonHealthLabels = (JSONArray) namest.get("healthLabels");
        for(int i = 0; i < jsonHealthLabels.length(); i++)
            healthLabels.add(jsonHealthLabels.getString(i));
        food.setHealthLabels(healthLabels);
        return food;
    }
}