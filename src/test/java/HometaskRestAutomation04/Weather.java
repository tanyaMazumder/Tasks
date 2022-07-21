package HometaskRestAutomation04;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Weather {
    String apiKey = "f8cc5162711dc1a4505899df5b05acac";
    @Test
    public void GetWeatherWithQueryParameters() {
        RestAssured.baseURI = "http://api.openweathermap.org/data/2.5/weather";
        RequestSpecification httpRequest = RestAssured.given();
        Response res = httpRequest.queryParam("q","hyderabad")
                                  .queryParam("appid", apiKey)
                                  .get();
        ResponseBody body = res.body();
        String rbdy = body.asString();
        System.out.println("Response Received => " +rbdy);
        assertEquals(res.getStatusCode(), 200);

        float longitude = res.jsonPath().get("coord.lon");
        float latitude = res.jsonPath().get("coord.lat");
        Response res1 = httpRequest.queryParam("lat",latitude)
                .queryParam("lon", longitude)
                .queryParam("appid",apiKey)
                .get();
        ResponseBody body1 = res1.body();
        String rbdy1 = body1.asString();
        System.out.println("Response Received with Longitude & Latitude => " +rbdy1);
        assertEquals(res1.getStatusCode(), 200);
        assertEquals(res1.jsonPath().get("name"), "Hyderabad");
        assertEquals(res1.jsonPath().get("sys.country"), "IN");
        Assert.assertNotEquals(res1.jsonPath().get("main.temp_min"), 0.0);
        Assert.assertNotEquals(res1.jsonPath().get("main.temp "), 0.0);
    }

}
