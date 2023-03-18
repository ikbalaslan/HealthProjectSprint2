package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreatePatientByAdminPage {

    public CreatePatientByAdminPage(){PageFactory.initElements(Driver.getDriver(), this);}

    //----------Login Page Elements------------

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;


    //---------Home Page Elements--------------

    @FindBy(id = "account-menu")
    public WebElement signInLogo;

    @FindBy(id = "login-item")
    public WebElement signIn;

    @FindBy(xpath = "//span[normalize-space()='Items&Titles']")
    public WebElement itemsTitles;

    @FindBy(xpath = "//span[normalize-space()='Patient']")
    public WebElement patient;

    @FindBy(xpath = "//span[normalize-space()='MY PAGES']")
    public WebElement myPages;


   @FindBy(xpath = "//span[normalize-space()='MY PAGES(PATIENT)']")
   public WebElement myPagesPatient;



    @FindBy(xpath = "//span[normalize-space()='Create a new Patient']")
    public WebElement createNewPatientButton;

    @FindBy(xpath = "//input[@id='patient-firstName']")
    public  WebElement firstName;

    @FindBy(xpath = "//input[@id='patient-lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='patient-birthDate']")
    public WebElement birthDate;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='patient-phone']")
    public WebElement phone;

    @FindBy(xpath = "//select[@id='patient-gender']")
    public WebElement gender;

    @FindBy(xpath = "//select[@id='patient-bloodGroup']")
    public WebElement bloodGroup;

    @FindBy(xpath = "//input[@id='patient-adress']")
    public WebElement address;

    @FindBy(xpath = "//textarea[@id='patient-description']")
    public WebElement description;

    @FindBy(xpath = "//select[@id='patient-user']")
    public WebElement userId;

    @FindBy(xpath = "//select[@id='patient-country']")
    public WebElement countryId;

    @FindBy(xpath = "//select[@id='patient-cstate']")
    public WebElement stateId;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[contains(text(),'new Patient is created')]")
    public WebElement saveSuccessfullMessage;

    //-----------All Patient Information Title------------

    @FindBy(xpath = "//span[normalize-space()='ID']")
    public WebElement idTitle;

    @FindBy(xpath = "//span[normalize-space()='SSN']")
    public WebElement SSNTitle;

    @FindBy(xpath = "//span[normalize-space()='First Name']")
    public WebElement firstNameTitle;

    @FindBy(xpath = "//span[normalize-space()='Last Name']")
    public WebElement lastNameTitle;

    @FindBy(xpath = "//span[normalize-space()='Birth Date']")
    public WebElement birthDateTitle;

    @FindBy(xpath = "//span[normalize-space()='Phone']")
    public WebElement phoneTitle;

    @FindBy(xpath = "//span[normalize-space()='Email']")
    public WebElement emailTitle;

    @FindBy(xpath = "//span[normalize-space()='Gender']")
    public WebElement genderTittle;

    @FindBy(xpath = "//span[normalize-space()='Blood Group']")
    public WebElement bloodGroupTitle;

    @FindBy(xpath = "//span[normalize-space()='Address']")
    public WebElement addressTittle;

    @FindBy(xpath = "//span[normalize-space()='Description']")
    public WebElement descriptionTitle;

    @FindBy(xpath = "//span[normalize-space()='Created Date']")
    public WebElement createDateTitle;

    @FindBy(xpath = "//span[normalize-space()='User']")
    public WebElement userTitle;

    @FindBy(xpath = "//table[@class='table']//thead//tr//th//span[contains(text(),'Country')]")
    public WebElement countryTitle;

    @FindBy(xpath = "//table[@class='table']//thead//tr//th//span[contains(text(),'State/City')]")
    public WebElement stateTitle;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[16]/div[1]/a[2]")
    public WebElement editButton;

    @FindBy(xpath = "//span[normalize-space()='ID']")
    public WebElement editPatientIdTitle;

    //--------------Delete Patient---------

    @FindBy(xpath = "//a[normalize-space()='12']")
    public WebElement lastPageIcon;

    @FindBy(xpath = "//table/tbody/tr[last()]/td[last()]/div/a[3]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-patient']")
    public WebElement deleteButtonMessage;

    @FindBy(xpath = "//*[contains(text(),'Patient is deleted')]")
    public WebElement patientDeletedMessage;





















}
