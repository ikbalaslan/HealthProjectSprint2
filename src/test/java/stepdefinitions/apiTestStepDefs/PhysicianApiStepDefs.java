package stepdefinitions.apiTestStepDefs;

import base_url.AppBaseUrl;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.PhysicianPage;
import stepdefinitions.UITestStepDefs.RoomPageStepDefs;
import utilities.MedunnaAuthentication;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PhysicianApiStepDefs {

    PhysicianPage physicianPage = new PhysicianPage();
    static Response response;
    static JsonPath json;
    static List<Integer> doctorList;
    public static String expectedData = "";
    String url ="https://medunna.com/api/physicians?size=85";
    static int actualDataApi;

    public static String getExpectedData() {
        return expectedData;
    }

    @When("Admin get count of physicians")
    public void admin_get_count_of_physicians() {
        String countOfItems = physicianPage.physicianCount.getText();
        System.out.println(countOfItems);
        String[] listOfString = countOfItems.split(" ");
        expectedData = listOfString[5];
        System.out.println("expectedData = " + expectedData);

    }

    @When("Admin send get request to API")
    public void admin_send_get_request_to_api() {

        response = given().headers("Authorization","Bearer "+ MedunnaAuthentication.generateToken()).contentType(ContentType.JSON).get(url);
        json = response.jsonPath();
        doctorList = json.getList("id");

    }

    @When("Admin get physicians count from API")
    public void admin_get_physicians_count_from_api() {
        actualDataApi = doctorList.size();
        System.out.println("actualDataApi = " + actualDataApi);
    }

    @Then("Admin verify physicians count from UI equals with count from API")
    public void admin_verify_physicians_count_from_ui_equals_with_count_from_api() {
        String actualData = String.valueOf(actualDataApi);
        Assert.assertEquals(expectedData,actualData);
    }

}
