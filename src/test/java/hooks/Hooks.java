package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;



import static base_url.AppBaseUrl.medunnaSetUp;
import static base_url.MedunnaBaseUrl.medunnaSetUp2;


public class Hooks {
    /*
Hooks is used to run before and after each SCENARIO or SCENARIO OUTLINE
 */




    @Before //use cucumber library
    public void setUpScenario(){
        System.out.println("Before Method");
    }

    @After
    public void tearDownScenario(Scenario scenario){
//        System.out.println("After Method");
        if (scenario.isFailed()){
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenshot,"image/png","failed_scenario"+scenario.getName());
            Driver.closeDriver();
        }
    }


    //    This Before hooks ONLY RUNS for @smoke_test TAGGED SCENARIOS
//    @Before(value = "@smoke_tests")
    @Before("@smoke_tests")
    public void setUpSmokeScenarios(){
        System.out.println("RUN FOR ONLY SMOKE TEST SCENARIOS");
    }
    //This After hooks ONLY RUNS for @smoke_test TAGGED SCENARIOS


    @After("@smoke_tests")
    public void tearDownSmokeScenarios(){

        System.out.println("RUN FOR ONLY SMOKE TEST SCENARIOS");
    }
    @Before("@US08")
    public void beforeApi(){  // This method will run before Api Tests
        medunnaSetUp();

    }

    @Before("@US30_TC01")
    public void beforeApi2(){
        medunnaSetUp2();     // This method actually works If you use the new one you will get 500 error.

    }

}