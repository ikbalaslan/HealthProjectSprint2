package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

public class LoginPage {


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "rememberMe")
    public WebElement rememberMe;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//span[.='MY PAGES(PATIENT)']")
    public WebElement MyPageOption;

    @FindBy(xpath = "//span[.='My Appointments']")
    public WebElement MyAppointmentOption;

    @FindBy(xpath = "//span[.='Show Tests']")
    public WebElement ShowTestsButton;

    @FindBy(xpath = "//span[.='View Results']")
    public WebElement ViewResultsButton;

    @FindBy(xpath = "//span[.='Show Invoice']")
    public WebElement ShowInvoiceButton;


}
