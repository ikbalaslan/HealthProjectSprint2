package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.*;
import pages.StaffLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class StaffLoginStepDefs {

    StaffLoginPage staffLoginPage=new StaffLoginPage();

    @Given("staff is on {string} page")
    public void staff_is_on_page(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @When("click on user icon")
    public void click_on_user_icon() {
        staffLoginPage.userIcon.click();

    }
    @When("click on Sign In option")
    public void click_on_sign_in_option() {
        staffLoginPage.signInOption.click();
    }

    @When("enter {string} in Username input")
    public void enter_in_username_input(String username) {
        staffLoginPage.usernameInput.sendKeys(username);
    }

    @When("enter {string} in Password input")
    public void enter_in_password_input(String password) {
        staffLoginPage.passwordInput.sendKeys(password);
    }

    @When("click on Remember Me checkbox")
    public void click_on_remember_me_checkbox() {
        staffLoginPage.rememberMeCheckbox.click();
    }

    @When("click on Sign In submit button")
    public void click_on_sign_in_submit_button() {
        staffLoginPage.signInSubmitButton.click();
    }


}
