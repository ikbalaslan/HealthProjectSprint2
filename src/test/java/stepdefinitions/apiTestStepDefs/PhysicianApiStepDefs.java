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

public class PhysicianApiStepDefs {

    PhysicianPage physicianPage = new PhysicianPage();

    @When("Admin get count of physicians")
    public void admin_get_count_of_physicians() {
        String countOfItems= physicianPage.physicianCount.getText();
        String[] listOfString = countOfItems.split("");
        System.out.println(listOfString);

    }
    @When("Admin send get request to API")
    public void admin_send_get_request_to_api() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Admin get physicians count from API")
    public void admin_get_physicians_count_from_api() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Admin verify physicians count from UI equals with count from API")
    public void admin_verify_physicians_count_from_ui_equals_with_count_from_api() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
