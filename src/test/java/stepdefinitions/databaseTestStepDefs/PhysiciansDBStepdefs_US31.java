package stepdefinitions.databaseTestStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PhysicianPage;
import stepdefinitions.apiTestStepDefs.PhysicianApiStepDefs;

import utilities.JdbcUtils;

import java.util.List;



public class PhysiciansDBStepdefs_US31 {

    PhysicianApiStepDefs physicianApiStepDefs = new PhysicianApiStepDefs();
    PhysicianPage physicianPage = new PhysicianPage();
    public static String expectedData = "";
    List<Object> columnList;

    @When("user gets counts of physicians")
    public void userGetsCountsOfPhysicians() {

        String countOfPhysicians = physicianPage.physicianCount.getText();
        System.out.println(countOfPhysicians);
        String[] listOfString = countOfPhysicians.split(" ");
        expectedData = listOfString[5];
        System.out.println("expectedData = " + expectedData);
    }

//    @Given("user connects to database")
//    public void userConnectsToDatabase() {
//
//   JdbcUtils.connectToDatabase("157.230.48.97","medunna_db_v2","select_user","Medunna_pass_@6");
//
//    }

    @And("user sends the requests")
    public void userSendsTheRequests() {
        columnList = JdbcUtils.getColumnList("id","\"public\".physician");
    }

    @Then("user verifies count of physicians with count of DataBase")
    public void userVerifiesCountOfPhysiciansWithCountOfDataBase() {

        String actualData = String.valueOf(columnList.size());
        System.out.println("actualData = " + actualData);
        System.out.println(PhysicianApiStepDefs.getExpectedData());
        Assert.assertEquals(PhysicianApiStepDefs.expectedData, actualData);
    }


}
