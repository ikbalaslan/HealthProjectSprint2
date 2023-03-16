package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ConfigReader;

public class LoginPageStepDefs {
    LoginPage loginPage = new LoginPage();

    @When("{string} enters {string} in username field")
    public void enters_in_username_field(String string, String username) {
        loginPage.username.sendKeys(ConfigReader.getProperty(username));
    }
    @When("{string} enters {string} in password field")
    public void enters_in_password_field(String string, String password) {
        loginPage.password.sendKeys(ConfigReader.getProperty(password));
    }
    @When("{string} clicks sign in submit button")
    public void clicks_sign_in_submit_button(String string) {
        loginPage.submitButton.click();
    }

    @And("{string} click on RememberMe checkbox")
    public void clickOnRememberMeCheckbox(String string) {

        loginPage.rememberMe.click();
    }

    @And("{string} click on My Pages\\(Patient)")
    public void clickOnMyPagesPatient(String ar0) {
        loginPage.MyPageOption.click();
    }

    @And("{string} click on My Appointments option")
    public void clickOnMyAppointmentsOption(String arg0) {
        loginPage.MyAppointmentOption.click();

    }

      @When("{string} click on Show Test button")
    public void clickOnShowTestButton(String arg0) {

        loginPage.ShowTestsButton.click();
    }


    @When("{string} click on View Result button")
    public void clickOnViewResultButton(String arg0) {
        loginPage.ViewResultsButton.click();

    }

    @When("{string} click on Show Invoice button")
    public void clickOnShowInvoiceButton(String arg0) {
        loginPage.ShowInvoiceButton.click();
    }


}
