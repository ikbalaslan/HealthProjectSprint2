package stepdefinitions.databaseTestStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class CountryDBStepDefs {
    List<Object> columnList;
    @Given("user connects to database")
    public void user_connects_to_database() {
        DBUtils.createConnection();
    }
    @When("get all {string} as a list")
    public void get_all_as_a_list(String string) {
        String query = "SELECT * FROM " + "country";
        columnList = DBUtils.getColumnData(query,"name");
        System.out.println("columnList = " + columnList);

    }
    @Then("verify Country list contains {string}")
    public void verify_country_list_contains(String string) {
        Assert.assertTrue(columnList.contains("Middle Earth"));
    }
    @Then("close the connection")
    public void close_the_connection() {
        DBUtils.closeConnection();
    }

}
