package stepdefinitions.apiTestStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import pojos.Physicians;
import utilities.MedunnaAuthentication;


import java.io.IOException;
import java.util.List;


import static io.restassured.RestAssured.given;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

public class PhysiciansApiStepDefs_US31 {

    Physicians physicians = new Physicians();
    Response response;

    @Given("{string} sends GET request for physicians list")
    public void sendsGETRequestForPhysiciansList(String string) {

        // set the url
//        spec.pathParams("first","api","second","physicians");
        String url= "https://medunna.com/api/physicians";

        // send request and get response
   response = given().headers("Authorization","Bearer "+MedunnaAuthentication.generateToken(),"Accept",ContentType.JSON,
      "Content-Type",ContentType.JSON).contentType(ContentType.JSON).when().get(url);
       response.prettyPrint();
    }
    @Then("HTTP status code must be {int}")
    public void http_status_code_must_be(Integer statusCode) {
        response.then().assertThat().statusCode(statusCode);

    }

    @Then("Assert that {string} can see all physicians list")
    public void assertThatCanSeeAllPhysiciansList(String arg0) throws IOException {

        // De-serialization
    ObjectMapper objectMapper = new ObjectMapper();
    Physicians[] physiciansDetails = objectMapper.readValue(response.asString(), Physicians[].class);

        // Assertion

        JsonPath jsonPath = response.jsonPath();
        List<Integer> id = jsonPath.getList("id");
        System.out.println("id = " + id);
        int numberOfId = id.size();
        System.out.println("numberOfId = " + numberOfId);

       response.then().assertThat().body("id",hasSize(20));
    }


}
/*

   Actual: <[1304, 1305, 5223, 1303, 1309, 1310, 1311, 1312, 1313, 1319, 1318, 1324, 1325, 1326, 1334, 1328, 1327, 5201, 5202, 5203]>
 */