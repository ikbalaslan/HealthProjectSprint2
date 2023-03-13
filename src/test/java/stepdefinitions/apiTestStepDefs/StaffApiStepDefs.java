package stepdefinitions.apiTestStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StaffApiStepDefs {
    public static RequestSpecification spec;
    Response response;

    @Given("Admin sends get request for staff's data")
    public void adminSendsGetRequestForStaffSData() {

      //  spec.pathParams();



    }

    @Then("Admin gets the staff's data and validates")
    public void adminGetsTheStaffSDataAndValidates() {
    }
}
