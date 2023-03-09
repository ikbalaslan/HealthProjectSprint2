package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AppointmentStatusPage;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class AppointmentStatusStepDefs {

    AppointmentStatusPage appointmentStatusPage=new AppointmentStatusPage();
    Select select;

    @When("clicks on status and changes {string}")
    public void clicks_on_status_and_changes(String status) {

        select = new Select(appointmentStatusPage.appointmentStatus);
        select.selectByValue("PENDING");
        //JSUtils.clickElementByJS(appointmentStatusPage.saveButton);
    }

    @Then("verify that status is changed")
    public void verify_that_status_is_changed() {
        ReusableMethods.waitFor(3);
        assertTrue(appointmentStatusPage.statusMessage.isDisplayed());
    }
}
