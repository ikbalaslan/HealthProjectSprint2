package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Country_CityPages {
    public Country_CityPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//a[@href='/country'])[1]")
    public WebElement countryItem;

@FindBy(xpath = "(//a[@href='/c-state'])[1]")
    public WebElement cityStateItem;

@FindBy(xpath = "//span[.='Create a new Country']")
    public WebElement createNewCountryButton;

@FindBy(id = "country-name")
public WebElement countryNameTextBox;

@FindBy(id = "save-entity")
    public WebElement saveCountryButton;

@FindBy(id = "jh-create-entity")
    public WebElement createNewCityButton;

@FindBy(id = "c-state-name")
    public WebElement cityNameTextBox;

@FindBy(id = "c-state-state")
    public WebElement countryListDropdown;

@FindBy(linkText = "Middle Earth")
    public WebElement countryICreated;



}
