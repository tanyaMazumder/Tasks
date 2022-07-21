package HomeTaskRestFunctional.RestAssured;

import io.cucumber.gherkin.internal.com.eclipsesource.json.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RestAssuredExample {

    @Test
    public void GetDetailsForPosts() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "");
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
        List<String> resId= response.jsonPath().get("id");
        System.out.println("Size of records => " + resId.size());
        assertEquals(resId.size(), 100);

    }

    @Test
    public void GetDetailsForComments() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/comments";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "");
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
        List<String> resId= response.jsonPath().get("id");
        System.out.println("Size of records => " + resId.size());
        assertEquals(resId.size(), 500);

    }

    @Test
    public void GetDetailsForAlbums() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/albums";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "");
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
        List<String> resId= response.jsonPath().get("id");
        System.out.println("Size of records => " + resId.size());
        assertEquals(resId.size(), 100);

    }

    @Test
    public void GetDetailsForPhotos() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/photos";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "");
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
        List<String> resId= response.jsonPath().get("id");
        System.out.println("Size of records => " + resId.size());
        assertEquals(resId.size(), 5000);

    }

    @Test
    public void GetDetailsForTodos() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/todos";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "");
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
        List<String> resId= response.jsonPath().get("id");
        System.out.println("Size of records => " + resId.size());
        assertEquals(resId.size(), 200);

    }

    @Test
    public void GetDetailsForUsers() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "");
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
        List<String> resId= response.jsonPath().get("id");
        System.out.println("Size of records => " + resId.size());
        assertEquals(resId.size(), 10);

    }
    @Test
    public void AddingPost()
    {
        RestAssured.baseURI ="https://jsonplaceholder.typicode.com/posts";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("userId", "1");
        requestParams.put("id", "1");
        requestParams.put("title", "foo");
        requestParams.put("body", "bar");
        request.header("Content-Type", "application/json");
        request.body(requestParams.toString());
        Response response = request.post();
        ResponseBody body = response.getBody();
        System.out.println(response.getStatusLine());
        System.out.println(body.asString());
        Assert.assertEquals(response.getStatusCode(),201);

    }

    @Test
    public void deletePost() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RequestSpecification httpRequest = RestAssured.given()
                .header("Content-Type", "application/json");
        Response res = httpRequest.body("").delete("/posts/1");
        System.out.println("The response code is - " +res.getStatusCode());
        Assert.assertEquals(res.getStatusCode(),200);
    }

    @Test
    public void UpdatingPost()
    {
        RestAssured.baseURI ="https://jsonplaceholder.typicode.com/posts/1";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("userId", "1");
        requestParams.put("id", "1");
        requestParams.put("title", "foo");
        requestParams.put("body", "bar");
        request.header("Content-Type", "application/json");
        request.body(requestParams.toString());
        Response response = request.put();
        ResponseBody body = response.getBody();
        System.out.println(response.getStatusLine());
        System.out.println(body.asString());
        Assert.assertEquals(response.getStatusCode(),200);

    }


}
