package stepdefinitions.apiTestStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.RoomCreationPojo;

//import static base_url.MedunnaBaseUrl.spec;
import static base_url.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static utilities.AuthenticationMedunna.generateToken;

public class RoomCreationStepDefinitions {
    RoomCreationPojo expectedData = new RoomCreationPojo();
    Response response;
    int roomNumber;
    @When("User makes POST request")
    public void user_makes_post_request() {

        spec.pathParams("first","api","second", "rooms");
        roomNumber = Faker.instance().number().numberBetween(1000,1000000);
        expectedData.setStatus(true);
        expectedData.setRoomType("PREMIUM_DELUXE");
        expectedData.setRoomNumber(roomNumber);
        expectedData.setPrice(1907);
        System.out.println(expectedData);

        response = given().headers("Authorization", "Bearer " + generateToken(),
               "Content-Type", ContentType.JSON, "Accept",ContentType.JSON).
               spec(spec).
               contentType(ContentType.JSON).
               body(expectedData).
               when().
               post("/{first}/{second}");

        response.prettyPrint();

    }
    @Then("Validate room creation by using API")
    public void validateRoomCreationByUsingAPI() {

        assertEquals(201,response.statusCode());
        response.then().assertThat().body(    "price",equalTo(1907),
                                         "roomType",equalTo("PREMIUM_DELUXE"),
                                                 "roomNumber", equalTo(roomNumber),
                                                 "status",equalTo(true));

        RoomCreationPojo actualData = response.as(RoomCreationPojo.class);
        assertEquals(expectedData.getRoomNumber(),actualData.getRoomNumber());
        assertEquals(expectedData.getRoomType(),actualData.getRoomType());
        assertEquals(expectedData.getPrice(),actualData.getPrice());
        assertEquals(expectedData.getStatus(),actualData.getStatus());
    }

    @When("User makes GET request")
    public void user_makes_get_request() {

        spec.pathParams("first", "api", "second", "rooms", "third", 19916);

        response = given().headers("Authorization", "Bearer " + generateToken(),
                "Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                spec(spec).
                when().get("/{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("Validate room reading by using API")
    public void validate_room_reading_by_using_api() {

        assertEquals(200,response.statusCode());
        JsonPath jsonPath = response.jsonPath();
        assertEquals("adminteam02",jsonPath.getString("createdBy"));
        assertEquals("2023-03-11T14:33:41.521702Z",jsonPath.getString("createdDate"));
        assertEquals(19916,jsonPath.getInt("id"));
        assertEquals(795108,jsonPath.getInt("roomNumber"));
        assertEquals("PREMIUM_DELUXE",jsonPath.getString("roomType"));
        assertTrue(jsonPath.getBoolean("status"));
        assertNull(jsonPath.getString("description"));

    }
}
