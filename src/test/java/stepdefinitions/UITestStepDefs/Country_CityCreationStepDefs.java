package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Country_CityPages;
import utilities.Driver;

import static utilities.ReusableMethods.*;

public class Country_CityCreationStepDefs {
    Country_CityPages country_cityPages=new Country_CityPages();


    @Then("User clicks to Country at dropdown")
    public void user_clicks_to_country_at_dropdown() {
country_cityPages.countryItem.click();
waitFor(2);
    }

    @Then("User clicks to Create a new Country button")
    public void user_clicks_to_create_a_new_country_button() {
     country_cityPages.createNewCountryButton.click();
     waitFor(2);
    }

    @Then("User enters a country nane to name textbox")
    public void user_enters_a_country_nane_to_name_textbox() {
        country_cityPages.countryNameTextBox.sendKeys("Middle Earth");
        waitFor(1);
    }

    @Then("User clicks to save button")
    public void user_clicks_to_save_button() {
       country_cityPages.saveCountryButton.click();
       waitFor(3);
    }

    @Then("User verify to entered country name is exist")
    public void user_verify_to_entered_country_name_is_exist() {
        String pageSource= Driver.getDriver().getPageSource();
        Boolean verify=pageSource.contains("Middle Earth");
        Assert.assertTrue(verify);
    }

    @Then("User clicks to State dropdown")
    public void user_clicks_to_state_city_dropdown() {
        country_cityPages.cityStateItem.click();
        waitFor(2);
    }

    @Then("User clicks to Create a new State button")
    public void user_clicks_to_create_a_new_state_city_button() {
        country_cityPages.createNewCityButton.click();
        waitFor(2);
    }

    @Then("User enters a city name to name textbox")
    public void user_enters_a_city_name_to_name_textbox() {
       country_cityPages.cityNameTextBox.sendKeys("Mordor");
       waitFor(1);
    }

    @Then("User clicks to Country dropdown")
    public void user_clicks_to_country_dropdown() {
        country_cityPages.countryListDropdown.click();
        waitFor(1);

    }

    @Then("User clicks to Country that created before")
    public void user_clicks_to_country_that_created_before() {
        country_cityPages.countryListDropdown.sendKeys("Middle Earth");
        waitFor(1);
    }



    @Then("User verify to created city is exist at list")
    public void user_verify_to_created_city_is_exist_at_list() {
        String cityPageSource=Driver.getDriver().getPageSource();
        Boolean verify=cityPageSource.contains("Mordor");
        Assert.assertTrue(verify);
    }
}
