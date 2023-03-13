package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePageStepDefs {
    HomePage homePage = new HomePage();

    @When("{string} goes home pagee")
    public void goes_home_pagee(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }
    @When("{string} clicks account menu dropdown")
    public void clicks_account_menu_dropdown(String string) {

        homePage.userIcon.click();

    }
    @When("{string} clicks sign in button")
    public void clicks_sign_in_button(String string) {

        homePage.signInOption.click();

    }

    @Given("{string} goes home page")
    public void goes_home_page(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }
    @When("{string} clicks account menu")
    public void clicks_account_menu(String string) {
        homePage.userIcon.click();

    }
    @When("{string} clicks sign in")
    public void clicks_sign_in(String string) {
        homePage.signInOption.click();

    }

    @When("{string} clicks items&titiles menu")
    public void clicks_items_titiles_menu(String string) {
        homePage.itemsAndTitles.click();
    }

    @When("{string} clicks room")
    public void clicks_room(String string) {
        homePage.roomOption.click();
    }


    @Then("Admin close the app")
    public void admin_close_the_app() throws InterruptedException {
        Driver.closeDriver();
    }

}
