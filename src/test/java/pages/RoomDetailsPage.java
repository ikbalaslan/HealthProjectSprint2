package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RoomDetailsPage {
    public RoomDetailsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "roomNumber")
    public WebElement roomNumber;

    @FindBy(id = "roomType")
    public WebElement roomType;

    @FindBy(id = "status")
    public WebElement status;

    @FindBy(id = "price")
    public WebElement price;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(id = "createdDate")
    public WebElement createdDate;

    @FindBy(xpath = "//span[.='Back']")
    public WebElement backButton;

    @FindBy(xpath = "//span[.='Test Results']")
    public WebElement TestResultsTitle;

    @FindBy(xpath = "//span[.='ID']")
    public WebElement TestResultsID;

    @FindBy(xpath = "//span[.='Result']")
    public WebElement TestResultsResult;

    @FindBy(xpath = "//span[.='Default Min. Value']")
    public WebElement TestResultsDefaultMinValue;

    @FindBy(xpath = "//span[.='Default Max. Value']")
    public WebElement TestResultsDefaultMaxValue;

    @FindBy(xpath = "//span[.='Test']")
    public WebElement TestResultsTest;

    @FindBy(xpath = "//span[.='Description']")
    public WebElement TestResultsDescription;


    @FindBy(xpath = "//span[.='Date']")
    public WebElement TestResultsDate;

    @FindBy(xpath = "//th[.='Date:']")
    public WebElement InvoiceDate;


    @FindBy(xpath = "//th[.='SSN:']")
    public WebElement InvoiceSSN;

    @FindBy(xpath = "//th[.='Name:']")
    public WebElement InvoiceNameOfPatient;

    @FindBy(xpath = "//th[.='Payment Method:']")
    public WebElement InvoicePaymentMethod;

    @FindBy(xpath = "//th[.='Total Cost:']")
    public WebElement InvoiceTotalCost;

    @FindBy(xpath = "//th[.='INVOICE']")
    public WebElement InvoiceINVOICE;



}
