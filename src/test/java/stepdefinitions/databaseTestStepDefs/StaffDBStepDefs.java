package stepdefinitions.databaseTestStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class StaffDBStepDefs {

    List<Object> columnList;

    @Given("user connects to database")
    public void user_connects_to_database() {

      DBUtils.createConnection();
    }
    @When("get all {string} as a list from {string}")
    public void get_all_as_a_list(String columnName,String tableName) {

        String query = "SELECT * FROM " + tableName;
        columnList = DBUtils.getColumnData(query,columnName);
        System.out.println("usernameList = " + columnList);
    }
    @Then("verify usernameList contains {string}")
    public void verify_username_list_contains(String username) {
        Assert.assertTrue(columnList.contains(username));  //----> for string
        //  Assert.assertTrue(columnList.contains(Integer.valueOf(username))); // ----> fot Integer ex room number
    }

    @Then("verify list contains {string}")
    public void verify_list_contains(String data) {
        Assert.assertTrue(columnList.contains((data)));
        // Assert.assertTrue(columnList.contains(Integer.valueOf(data))); // ----> fot Integer ex room number
    }
    @Then("close the connection")
    public void close_the_connection() {
        DBUtils.closeConnection();
    }


    @Given("user gets the column {string} from table {string}")
    public void user_gets_the_column_from_table(String column, String table) {
//        String query = "SELECT * FROM jhi_user";//HARD CODED
        String query = "SELECT "+column+" FROM "+table+" Order By Id";//DYNAMIC QUERY
//        Running the query using util class
        DBUtils.executeQuery(query);
    }

    @Then("verify table {string} and column {string} contains data {string}")
    public void verify_table_and_column_contains_data(String table, String column, String data) {
//        getting to the table
        String query ="SELECT "+column+" FROM "+table;
//        getting all of the column data and storing in a list
        List<Object> columnData = DBUtils.getColumnData(query,column);
        System.out.println(columnData);
        Assert.assertTrue(columnData.contains(data));
    }



}
