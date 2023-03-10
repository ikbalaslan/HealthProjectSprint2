package stepdefinitions.apiTestStepDefs;

import base_url.AppBaseUrl;
import base_url.MedunnaBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import pojos.Physicians;
import utilities.AuthenticationMedunna;


import java.io.IOException;


import static io.restassured.RestAssured.given;

public class PhysiciansApiStepDefs extends AppBaseUrl{


    Response response;

    @Given("user sends GET request for physicians list")
    public void userSendsGETRequestForPhysiciansList() {
        // set the url
        spec.pathParams("first","api","second","physicians");

        // send request and get response
     given().headers("Authorization","Bearer"+ AuthenticationMedunna.generateToken(),"Accept",ContentType.JSON,
      "ContentType",ContentType.JSON).contentType(ContentType.JSON).spec(spec).when().get("/{first}/{second}");
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
    Physicians physiciansDetails = objectMapper.readValue(response.asString(), Physicians.class);

        // Assertion
    Assert.assertTrue(physiciansDetails!=null);

    }


}
