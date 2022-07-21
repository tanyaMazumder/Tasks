package HomeTaskRestAutomation;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PetStore {
    @Test
    public void GetDetailsForPets() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2/pet/12345";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "");
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.getContentType(), "application/json");
        assertEquals(response.jsonPath().get("category.name"), "dog");
        assertEquals(response.jsonPath().get("name"), "snoopie");
        assertEquals(response.jsonPath().get("status"), "pending");
    }


    @Test
    public void GetDetailsForUsers() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "");
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
        List<String> resId= response.jsonPath().get("id");
        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.getContentType(), "application/json; charset=utf-8");
        assertNotEquals(resId.size(),3);
        assertEquals(response.jsonPath().get("name[1]"), "Ervin Howell");
    }
}

