package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class StaffPage {

    public StaffPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Create a new user']")
    public WebElement createNewStaffButton;

// @FindBy(partialLinkText = "Create a new user")
// public WebElement createNewStaffButtonLinktext;



    @FindBy(xpath = "//span[.='Items&Titles']")
    public WebElement itemsAndTitlesLink;

    @FindBy(xpath = "//span[.='Staff']")
    public WebElement staffLink;

    // useSSNSearch  searchSSN  //button[.='Search User']   Create a new user

    @FindBy(id = "useSSNSearch")
    public WebElement userSearchCheckbox;


    @FindBy(id = "searchSSN")
    public WebElement userSearchBox;

    @FindBy(xpath = "//button[.='Search User']")
    public WebElement searchUserButton;



    // STAFF SEARCH by SSN
//  ***********************************************************
//    @FindBy(id = "staff-firstName")
//    public WebElement firstNameField;
    @FindBy(xpath = "//input[@id=‘staff-firstName’]")
    public WebElement firstNameField;


    @FindBy(id = "staff-lastName")
    public WebElement lastNameField;

    @FindBy(id = "staff-birthDate")
    public WebElement staffBDayField;

    @FindBy(id = "staff-phone")
    public WebElement staffPhoneField;

    @FindBy(id = "staff-gender")
    public WebElement staffGenderField;

    @FindBy(id = "staff-bloodGroup")
    public WebElement staffBloodGroupField;

    @FindBy(id = "staff-adress")
    public WebElement staffAddressField;

    @FindBy(id = "staff-description")
    public WebElement staffDescriptionField;

    @FindBy(id = "staff-user")
    public WebElement staffUserField;

    @FindBy(id = "staff-country")
    public WebElement staffCountryField;

    @FindBy(id = "staff-cstate")
    public WebElement staffCstateField;

    @FindBy(id = "save-entity")
    public WebElement saveSubmitButton;

    @FindBy(xpath = "//span[.='Created date']")
    public WebElement createdDateUserMan;


    @FindBy(xpath= "//tbody/tr/td[3]")
    public WebElement ssnListInUserManagment;   /// *** USER MANAGEMENT PAGE

    @FindBy(xpath = "//div[.='User found with search SSN']")
    public WebElement toesterContainerMessageSearch;

    @FindBy(xpath = "//div[.='A user is updated with identifier emmateam02']")
    public WebElement toesterContainerMessageEdit;


// @FindBy(xpath = "//*[contains(text(),'Adele01-staff')]")
// public WebElement firstNameValue;



    @FindBy(xpath = "(//div[@class='form-group'])[4]//input[@value='Adele01-staff']")
    public WebElement firstNameValue;

    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> loginlist ;



    @FindBy(xpath = "(//tbody//td[11]//span[.='View'])[1]")
    public WebElement firstRowViewInUserManagment;


    //   //div[.='A new Staff is created with identifier 4386']


// @FindBy(xpath = "//div[.='User found with search SSN']")
// public WebElement toesterContainerMessageCreation;


    //   (//tbody//td[3])[1]   Adele
    //   (//tbody//td[4])[1]   Watson


    //   //div[@class='Toastify__toast-body']




    // ********************* CREATE OR EDIT USER ====> User management


    @FindBy(id = "login")
    public WebElement loginField;

    @FindBy(id = "firstName")
    public WebElement firstnameField;

    @FindBy(id = "lastName")
    public WebElement lastnameField;

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "ssn")
    public WebElement ssnField;

    @FindBy(id = "langKey")  //select
    public WebElement langKeyField;

    @FindBy(id = "authorities")  // select
    public WebElement authoritiesField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveSubmitButtonUserMan;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement toesterContMssgCreation;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement toesterContMssgUpdate;

    ////span[.='Confirm delete operation']

    /// **************************** DELETE
    @FindBy(xpath = "//span[.='Confirm delete operation']")
    public WebElement confirmDeleteMssg;

    @FindBy(xpath = "(//span[.='Delete'])[7]")
    public WebElement deleteRedButton;

    // (//*[contains(text(),'Delete')])[21]    (//span[.='Delete'])[10]

    @FindBy(xpath = "(//*[contains(text(),'Delete')])[21]")
    public WebElement deleteButtonPopUp;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement toesterContMssgDelete;

    @FindBy(xpath = "(//span[.='Delete'])[10]")
    public WebElement deleteRedButton1;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement toesterContMssgEdit;

}
