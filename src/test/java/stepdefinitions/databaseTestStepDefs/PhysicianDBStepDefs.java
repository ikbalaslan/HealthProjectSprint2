package stepdefinitions.databaseTestStepDefs;

import io.cucumber.java.en.And;
import org.junit.Assert;
import stepdefinitions.apiTestStepDefs.PhysicianApiStepDefs;
import utilities.JdbcUtils;


import java.util.List;

public class PhysicianDBStepDefs {
    PhysicianApiStepDefs physicianApiStepDefs = new PhysicianApiStepDefs();
    static List<Object> databaseList;

    @And("Admin connect to the database")
    public void adminConnectToTheDatabase() {
        JdbcUtils.connectToDatabase("157.230.48.97","medunna_db_v2","select_user","Medunna_pass_@6");

    }

    @And("Admin send query")
    public void adminSendQuery() {
        databaseList= JdbcUtils.getColumnList("id","\"public\".physician");

    }

    @And("Admin verify physicians count from UI equals with count from database")
    public void adminVerifyPhysiciansCountFromUIEqualsWithCountFromDatabase() {
        String actualData = String.valueOf(databaseList.size());
        System.out.println("actualData = " + actualData);
        System.out.println(PhysicianApiStepDefs.getExpectedData());
        Assert.assertEquals(PhysicianApiStepDefs.expectedData,actualData);
    }
}
