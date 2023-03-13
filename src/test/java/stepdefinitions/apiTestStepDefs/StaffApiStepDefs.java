package stepdefinitions.apiTestStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.io.IOException;
import static base_url.AppBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;

public class StaffApiStepDefs {

    Response response;

//    @Given("user sends post request to create a staff")
//    public void user_sends_post_request_to_create_a_staff() {
//
//       spec.pathParams("first","api","second","staff");
//    //   String endpoint = "https://medunna.com/api/staff";
//
//        StaffInnerPojo user = new StaffInnerPojo(true,"dzejna-staff02","212-98-2452");
//        StaffOuterPojo expectedData = new StaffOuterPojo("Dzejna","Balic","1234543234","212-98-2452",user);
//
//        response = given().
//                headers("Authorization", "Bearer " + generateToken(),
//                        "Content-Type", ContentType.JSON,
//                        "Accept", ContentType.JSON).
//                contentType(ContentType.JSON).
//                body(expectedData).spec(spec).body(expectedData).when().
//                post("/{first}/{second}");
//        response.prettyPrint();
//    }
//
//    @Then("Verify that HTTP Status Code is {int}")
//    public void verifyThatHTTPStatusCodeIs(int arg0) {
//        assertEquals(201,response.statusCode());
//    }

    @Given("user sends get request to get staff's data")
    public void user_sends_get_request_to_get_staff_s_data() throws IOException {
        spec.pathParams("first","api","second","staff").queryParams("firstname","Lana","lastname","Watson");

        response = given().
                headers("Authorization", "Bearer " + generateToken(),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).
                contentType(ContentType.JSON).spec(spec).when().
                get("/{first}/{second}");
        response.prettyPrint();

    }
    @Then("verify that HTTP Status Code is {int}")
    public void verify_that_http_status_code_is(Integer int1) {
        assertEquals(200,response.statusCode());
    }
    @And("verify that created staffs exists")
    public void verifyThatCreatedStaffsExists() {

//        assertTrue(response.asString().contains("pudar.watson1"));
//        assertTrue(response.asString().contains("sara.watson1"));
//        assertTrue(response.asString().contains("erna.watson1"));
//        assertTrue(response.asString().contains("345-56-9378"));
//        assertTrue(response.asString().contains("345-98-9378"));
//        assertTrue(response.asString().contains("345-23-9378"));

        response.then().assertThat().body("user.login",hasItems("pudar.watson1","sara.watson1","erna.watson1"))
                .body("user.ssn",hasItems("345-56-9378","345-98-9378","345-23-9378"));
    }
}

