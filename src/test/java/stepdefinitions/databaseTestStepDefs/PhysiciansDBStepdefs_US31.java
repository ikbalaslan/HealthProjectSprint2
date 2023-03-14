package stepdefinitions.databaseTestStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class PhysiciansDBStepdefs_US31 {

    List<Object> columnList;

    @Given("user connect to database")
    public void userConnectToDatabase() {
        DBUtils.createConnection();

    }

    @And("user send requests to gets the column {string} from table {string}")
    public void userSendRequestsToGetsTheColumnFromTable(String column, String table ) {

        String query = "SELECT"+column+"FROM"+table;
        columnList = DBUtils.getColumnData(query,column);
        System.out.println("columnList = " +columnList );
    }



    @Then("user verify table id list has {string}")
    public void userVerifyTableIdListHas(String id) {

        assertTrue(columnList.contains("id"));

    }
}
