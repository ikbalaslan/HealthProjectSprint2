package stepdefinitions.apiTestStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;


import java.util.List;

import static base_url.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.AuthenticationMedunna.generateToken;
public class CountryCreationApiStepDef {
    static Response response;
    static String token = "";
    JsonPath actualData ;

    @Given("user sends GET request for country that created before")
    public void user_sends_get_request_for_country_that_created_before() {
        String endpoint = "https://medunna.com/api/countries";
            spec.pathParams("first","api","second","countries");

            response = given().
                    headers("Authorization", "Bearer " + generateToken(),
                            "Content-Type", ContentType.JSON,
                            "Accept", ContentType.JSON).
                    contentType(ContentType.JSON).spec(spec).when().
                    get("/{first}/{second}");


            response.prettyPrint();



        System.out.println("response.getStatusCode() = " + response.getStatusCode());
    }

    @Then("HTTP status code must be {int}")
    public void http_status_code_must_be(Integer int1) {
        //  Assertion

        assertEquals(200,response.statusCode());


    }

    @Then("Assert that user can see Middle Earth country")
    public void Assert_that_user_can_see_Middle_Earth_country() {
       // Assert.assertTrue(actualData.getString("id").contains("7770"));
       // assertTrue(response.asString().contains("Middle Earth"));

       // List<Integer> idList= response.jsonPath().getList("id");
        //System.out.println("idList = " + idList);

        List<String> nameList= response.jsonPath().getList("name");
        System.out.println("nameList = " + nameList);
        Assert.assertTrue(nameList.contains("Middle Earth"));

    }
}
