package stepdefinitions.databaseTestStepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DBUtils;

public class PhysiciansDbStepDefs {

    @Given("Admin connects to database")
    public void admin_connects_to_database() {
        DBUtils.createConnection();
    }
    @Given("user gets the column {string} from table {string}")
    public void user_gets_the_column_from_table(String column, String table) {
        //SELECT * FROM PHYSICIANS
        DBUtils.getResultset();
    }

    @Given("user reads all table data")
    public void user_reads_all_table_data() {

    }

    @Then("user verify table {string} contains data")
    public void user_verify_table_contains_data(String string) {


    }


}
