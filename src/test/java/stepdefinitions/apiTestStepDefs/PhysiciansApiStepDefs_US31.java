package stepdefinitions.apiTestStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import pojos.Physicians;
import utilities.JdbcUtils;
import utilities.MedunnaAuthentication;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static io.restassured.RestAssured.given;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

public class PhysiciansApiStepDefs_US31 {
    static Response response;
    static String token = "";
    static JsonPath json;
    static List<Integer> physicianList;
    static List<Object> databaseList;

    @When("user send post request {string} for get token with username {string} and password {string}")
    public void userSendPostRequestForGetTokenWithUsernameAndPassword(String url, String username, String password) {
        Map<String, Object> body = new HashMap<>();
        body.put("password", password);
        body.put("rememberMe", true);
        body.put("username", username);

        response = given().contentType(ContentType.JSON).body(body).post(url);
        token = response.jsonPath().get("id_token");
    }

    @When("user sends GET request to {string} with token")
    public void user_sends_get_request_to_with_token(String url) throws JsonProcessingException {
        response = given().headers("Authorization","Bearer "+token).contentType(ContentType.JSON).get(url);

        json = response.jsonPath();
        physicianList = json.getList("id");
//        System.out.println(physicianList);
    }
    @Then("HTTP status code {int}")
    public void httpStatusCode(int arg0) {
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Then("verify physicians ids in database")
    public void verifyPhysiciansIdsInDatabase() {
        JdbcUtils.connectToDatabase("157.230.48.97", "medunna_db_v2", "select_user", "Medunna_pass_@6");
        JdbcUtils.createStatement();

        databaseList = JdbcUtils.getColumnList("id", "public.physician");

        System.out.println(databaseList);
        List<Integer> newDBList = new ArrayList<>();
        for (Object w : databaseList) {
            String t = String.valueOf(w);
            newDBList.add(Integer.valueOf(t));
        }

        for (int i = 0; i < physicianList.size(); i++) {
            System.out.println("ids in API --> " + physicianList.get(i));
            System.out.println("ids in DB --> " + newDBList.get(i));
            Assert.assertTrue(newDBList.contains(physicianList.get(i)));
        }
    }

}
//   public class PhysiciansApiStepDefs_US31 {
//    Physicians physicians = new Physicians();
//    Response response;
//    @Given("{string} sends GET request for physicians list")
//    public void sendsGETRequestForPhysiciansList(String string) {
//        // set the url
////        spec.pathParams("first","api","second","physicians");
//        String url= "https://medunna.com/api/physicians";
//
//        // send request and get response
//   response = given().headers("Authorization","Bearer "+MedunnaAuthentication.generateToken(),"Accept",ContentType.JSON,
//      "Content-Type",ContentType.JSON).contentType(ContentType.JSON).when().get(url);
//       response.prettyPrint();
//    }
//    @Then("HTTP status code must be {int}")
//    public void http_status_code_must_be(Integer statusCode) {
//        response.then().assertThat().statusCode(statusCode);
//
//    }
//
//    @Then("Assert that {string} can see all physicians list")
//    public void assertThatCanSeeAllPhysiciansList(String arg0) throws IOException {
//
//        // De-serialization
//    ObjectMapper objectMapper = new ObjectMapper();
//    Physicians[] physiciansDetails = objectMapper.readValue(response.asString(), Physicians[].class);
//
//        // Assertion
//
//        JsonPath jsonPath = response.jsonPath();
//        List<Integer> id = jsonPath.getList("id");
//        System.out.println("id = " + id);
//        int numberOfId = id.size();
//        System.out.println("numberOfId = " + numberOfId);
//
//       response.then().assertThat().body("id",hasSize(20));
//    }
// }