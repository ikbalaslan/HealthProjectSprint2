package stepdefinitions.UITestStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CreatePatientByAdminPage;
import utilities.ConfigReader;
import utilities.Driver;

public class CreatePatientByAdminStepDefs {


    HomePageStepDefs homePage = new HomePageStepDefs();
    LoginPageStepDefs loginPage = new LoginPageStepDefs();

    CreatePatientByAdminPage createPatientPage = new CreatePatientByAdminPage();


    String fakeFirstName = Faker.instance().name().firstName();
    String fakeLastName = Faker.instance().name().lastName();
    String fakeEmail = Faker.instance().internet().emailAddress();
    String fakePhone = Faker.instance().number().digits(10);


    @Given("Go to medunna home page")
    public void go_to_medunna_home_page() {Driver.getDriver().get(ConfigReader.getProperty("app_url"));}


    @When("Admin click Sing in Link")
    public void admin_click_sing_in_link() throws InterruptedException {createPatientPage.signInLogo.click();
        Thread.sleep(2000);
        createPatientPage.signIn.click();
    }
    @Then("Admin fills the username {string}")
    public void admin_fills_the_username(String username) {
       Driver.waitAndSendText(createPatientPage.username,username);
    }

    @Then("Admin fills the password {string}")
    public void admin_fills_the_password(String password) {
        Driver.waitAndSendText(createPatientPage.password,password);
    }

    @Then("Admin clicks the Sing in button")
    public void admin_clicks_the_sing_in_button() {
      Driver.waitAndClick(createPatientPage.loginButton);
    }

    @Then("Admin clicks the Items&Titles dropdown")
    public void admin_clicks_the_items_titles_dropdown() {
        Driver.waitAndClick(createPatientPage.itemsTitles);
    }

    @Then("Admin clicks Patient link")
    public void admin_clicks_patient_link() throws InterruptedException {
       Thread.sleep(2000);
       Driver.waitAndClick(createPatientPage.patient);
    }
    @Then("Admin clicks the Create a new Patient Button")
    public void admin_clicks_the_create_a_new_patient_button() {
       Driver.waitAndClick(createPatientPage.createNewPatientButton,2);
    }

    @Then("Admin fills the {string},{string},{string},{string},{string},{string},{string},{string}")
    public void admin_fills_the(String birdDate, String gender, String bloodGroup, String address, String description, String user, String country, String state) throws InterruptedException {
        Thread.sleep(1000);


        Driver.waitAndSendText(createPatientPage.firstName,fakeFirstName);
        Thread.sleep(1000);
        Driver.waitAndSendText(createPatientPage.lastName,fakeLastName);
        Thread.sleep(1000);

        Driver.waitAndSendText(createPatientPage.birthDate,birdDate);
        Thread.sleep(1000);

        Driver.waitAndSendText(createPatientPage.email,fakeEmail);
        Driver.waitAndSendText(createPatientPage.phone,fakePhone);
        Driver.waitAndSendText(createPatientPage.gender,gender);
        Driver.waitAndSendText(createPatientPage.bloodGroup,bloodGroup);
        Driver.waitAndSendText(createPatientPage.address,address);
        Driver.waitAndSendText(createPatientPage.description,description);
        Driver.waitAndSendText(createPatientPage.userId,user);
        Thread.sleep(1000);
        Driver.waitAndSendText(createPatientPage.countryId,country);
        Thread.sleep(1000);
        Driver.waitAndSendText(createPatientPage.stateId,state);
    }

    @Then("Admin clicks Save Button")
    public void admin_clicks_save_button() throws InterruptedException {
       Driver.waitAndClick(createPatientPage.saveButton);
       Thread.sleep(3000);
    }

    @Then("Verify the A new patient is created message")
    public void verify_the_a_new_patient_is_created_message() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(createPatientPage.saveSuccessfullMessage.isDisplayed());
    }

    @When("Staff clicks Sign in link")
    public void staff_clicks_sign_in_link() throws InterruptedException {
        Driver.waitAndClick(createPatientPage.signInLogo);
        Thread.sleep(1000);
        Driver.waitAndClick(createPatientPage.signIn);
    }


    @Then("Staff fills the username {string}")
    public void staff_fills_the_username(String username) {
       Driver.waitAndSendText(createPatientPage.username,username);

    }
    @Then("Staff fills the password {string}")
    public void staff_fills_the_password(String password) {
       Driver.waitAndSendText(createPatientPage.password,password);
    }
    @Then("Staff clicks the Sign in button")
    public void staff_clicks_the_sign_in_button() {
        Driver.waitAndClick(createPatientPage.loginButton);

    }
    @Then("Verify the Mypages link is displayed instead of Items&Titles link")
    public void verify_the_mypages_link_is_displayed_instead_of_items_titles_link() {
     Assert.assertTrue(createPatientPage.myPages.isDisplayed());
    }
    @Then("Closes the browser")
    public void closes_the_browser() {
       Driver.closeDriver();
    }

    @When("Doctor clicks Sign in link")
    public void doctor_clicks_sign_in_link() throws InterruptedException {
        Driver.waitAndClick(createPatientPage.signInLogo);
        Thread.sleep(1000);
        Driver.waitAndClick(createPatientPage.signIn);
    }
    @Then("Doctor fills the username {string}")
    public void doctor_fills_the_username(String username) {
        Driver.waitAndSendText(createPatientPage.username,username);
    }
    @Then("Doctor fills the password {string}")
    public void doctor_fills_the_password(String password) {
        Driver.waitAndSendText(createPatientPage.password,password);
    }
    @Then("Doctor clicks the Sign in button")
    public void doctor_clicks_the_sign_in_button() {
        Driver.waitAndClick(createPatientPage.loginButton);
    }

    @When("Patient clicks Sign in link")
    public void patient_clicks_sign_in_link() throws InterruptedException {
        Driver.waitAndClick(createPatientPage.signInLogo);
        Thread.sleep(1000);
        Driver.waitAndClick(createPatientPage.signIn);
    }
    @Then("Patient fills the username {string}")
    public void patient_fills_the_username(String username) {
        Driver.waitAndSendText(createPatientPage.username,username);
    }
    @Then("Patient fills the password {string}")
    public void patient_fills_the_password(String password) {
        Driver.waitAndSendText(createPatientPage.password,password);
    }
    @Then("Patient clicks the Sign in button")
    public void patient_clicks_the_sign_in_button() {
        Driver.waitAndClick(createPatientPage.loginButton);
    }

    @Then("Verify the Mypages\\(Patient) link is displayed instead of Items&Titles link")
    public void verify_the_mypages_patient_link_is_displayed_instead_of_items_titles_link() {
        Assert.assertTrue(createPatientPage.myPagesPatient.isDisplayed());
    }

    @Then("Verify all patient information")
    public void verify_all_patient_information() {
        Assert.assertTrue(createPatientPage.idTitle.isDisplayed());
        Assert.assertTrue(createPatientPage.SSNTitle.isDisplayed());
        Assert.assertTrue(createPatientPage.firstNameTitle.isDisplayed());
        Assert.assertTrue(createPatientPage.lastNameTitle.isDisplayed());
        Assert.assertTrue(createPatientPage.birthDateTitle.isDisplayed());
        Assert.assertTrue(createPatientPage.phoneTitle.isDisplayed());
        Assert.assertTrue(createPatientPage.emailTitle.isDisplayed());
        Assert.assertTrue(createPatientPage.genderTittle.isDisplayed());
        Assert.assertTrue(createPatientPage.bloodGroupTitle.isDisplayed());
        Assert.assertTrue(createPatientPage.addressTittle.isDisplayed());
        Assert.assertTrue(createPatientPage.descriptionTitle.isDisplayed());
        Assert.assertTrue(createPatientPage.createDateTitle.isDisplayed());
        Assert.assertTrue(createPatientPage.userTitle.isDisplayed());
        Assert.assertTrue(createPatientPage.countryTitle.isDisplayed());
        Assert.assertTrue(createPatientPage.stateTitle.isDisplayed());

    }



    @Then("Admin clicks Edit button")
    public void admin_clicks_edit_button() throws InterruptedException {
        Thread.sleep(3000);

        Driver.waitAndClick(createPatientPage.editButton);
    }

    @Then("Verify patient ID information is shown")
    public void verify_patient_id_information_is_shown() throws InterruptedException {
        Thread.sleep(3000);

       Assert.assertTrue(createPatientPage.editPatientIdTitle.isDisplayed());
    }

    @Then("Admin fills the {string},{string},{string},{string},{string},{string},{string},")
    public void admin_fills_the(String birdDate, String gender, String bloodGroup, String address, String description, String user, String country) throws InterruptedException {
        Thread.sleep(1000);


        Driver.waitAndSendText(createPatientPage.firstName,fakeFirstName);
        Thread.sleep(1000);
        Driver.waitAndSendText(createPatientPage.lastName,fakeLastName);
        Thread.sleep(1000);

        Driver.waitAndSendText(createPatientPage.birthDate,birdDate);
        Thread.sleep(1000);

        Driver.waitAndSendText(createPatientPage.email,fakeEmail);
        Driver.waitAndSendText(createPatientPage.phone,fakePhone);
        Driver.waitAndSendText(createPatientPage.gender,gender);
        Driver.waitAndSendText(createPatientPage.bloodGroup,bloodGroup);
        Driver.waitAndSendText(createPatientPage.address,address);
        Driver.waitAndSendText(createPatientPage.description,description);
        Driver.waitAndSendText(createPatientPage.userId,user);
        Thread.sleep(1000);
        Driver.waitAndSendText(createPatientPage.countryId,country);
    }
    @Then("Verify the A new patient is not created successfully")
    public void verify_the_a_new_patient_is_not_created_successfully() throws InterruptedException {
      Thread.sleep(2000);
      Assert.assertFalse(createPatientPage.saveSuccessfullMessage.isDisplayed());
    }


    @Then("Admin clicks the Delete button next to the patient {string},{string},{string},{string}")
    public void admin_clicks_the_delete_button_next_to_the_patient(String firstName, String lastName, String email, String phone) {

        Driver.waitAndClick(createPatientPage.createNewPatientButton);

        Driver.waitAndSendText(createPatientPage.firstName,firstName);
        Driver.waitAndSendText(createPatientPage.lastName,lastName);
        Driver.waitAndSendText(createPatientPage.email,email);
        Driver.waitAndSendText(createPatientPage.phone,phone);
        Driver.waitAndClick(createPatientPage.saveButton);
        Driver.wait2(2);
        Driver.waitAndClick(createPatientPage.lastPageIcon);
        Driver.wait2(1);
        Driver.waitAndClick(createPatientPage.deleteButton);


    }
    @Then("Admin clicks on the Delete button on the delete message window")
    public void admin_clicks_on_the_delete_button_on_the_delete_message_window() {
       Driver.waitAndClick(createPatientPage.deleteButtonMessage);
    }
    @Then("verify the user is deleted message")
    public void verify_the_user_is_deleted_message() throws InterruptedException {
       Thread.sleep(1000);
       Assert.assertTrue(createPatientPage.patientDeletedMessage.isDisplayed());
    }




















    }
