package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.StaffPage;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class StaffPageStepDefs {

    StaffPage staffPage = new StaffPage();


    @Then("Admin clicks on Items&Titles dropdown")
    public void admin_clicks_on_items_titles_dropdown() {
        ReusableMethods.waitFor(2);
        staffPage.itemsAndTitlesLink.click();

    }

    @Then("Admin clicks on Staff from the dropdown")
    public void admin_clicks_on_staff_from_the_dropdown() {
        ReusableMethods.waitFor(2);
        staffPage.staffLink.click();

    }

    @Then("Admin clicks on Create A New Staff Button")
    public void admin_clicks_on_create_a_new_staff_button() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(staffPage.createNewStaffButton);
    }

    @Then("Admin clicks on User Search checkbox")
    public void admin_clicks_on_user_search_checkbox() {
        ReusableMethods.waitFor(2);
        staffPage.userSearchCheckbox.click();
    }

    @Then("Admin clicks on Search User button")
    public void admin_clicks_on_search_user_button() {
        ReusableMethods.waitFor(2);
        staffPage.searchUserButton.click();
    }

    @And("Admin sorts page by created date")
    public void adminSortsPageByCreatedDate() {
        staffPage.createdDateUserMan.click();
    }

    @And("Admin types {string} into SSN field")
    public void adminTypesIntoSSNField(String ssn) {
        ReusableMethods.waitFor(2);
        staffPage.userSearchBox.sendKeys(ssn);
    }

    @Then("Verify that message User found with search SSN pops up")
    public void verifyThatMessageUserFoundWithSearchSSNPopsUp() {
        ReusableMethods.waitFor(2);
        assertTrue(staffPage.toesterContainerMessageSearch.isDisplayed());

    }

//    @And("Admin searches for a login of registered users")
//    public void adminSearchesForAOfRegisteredUsers() {
//        List<WebElement> listOfLogin = staffPage.loginlist;
//        while(!listOfLogin.isEmpty()){
//            if(listOfLogin.equals("emina-team02")){
//                listOfLogin.get(listOfLogin.indexOf());
//
//            }
//
//        }
//       WebElement index1 = listOfLogin.get(listOfLogin.indexOf(login));
//        System.out.println(index1.getText());
//        int index=0;
//        for(WebElement eachElement : staffPage.loginlist){
//            if(eachElement.getText().equals(login)){
//                index = staffPage.loginlist.indexOf(login);
//                System.out.println("index = " + index);
//                break;
//
//
//
//            }
//
//        }


//


    //tbody/tr/td[3]   //tbody/tr[i]/td[3]
//    @Then("Admin selects {ssn} of registered user")
//    public void admin_selects_registered_user_from_the_list(String selectedSsn) {
////
//        for (int i = 0; i < 21; i++) {
//           // WebElement ssnList = Driver.getDriver().findElement(By.xpath("//tr[" + i + "]//td[3]"));
//
//            if (ssnList.getText().equals(selectedSsn)) {
//                int indexOfElement = ssnList.toString().indexOf(selectedSsn);
//                System.out.println(indexOfElement);
//
//
//            }
//////        }
//       List<WebElement> loginList = staffPage.loginlist;
//
//        for(WebElement eachElement : staffPage.loginlist){
//          if(eachElement.getText().equals(login)){
//          index = staffPage.loginlist.indexOf(login);
//               System.out.println("index = " + index);
//               break;
//    }





    ////  *********************************************************************************************

//    @Then("Verify that firstname field is populated")
//    public void verify_that_firstname_field_is_populated() {
//        ReusableMethods.waitFor(5);
//        String valueName = staffPage.firstNameValue.getText();
//        System.out.println("valueName = " + valueName);
//
//        ////div[@id='myCountryautocomplete-list']//div[.='United Kingdom']
//
//
//    }
//
//    @Then("Verify that lastname field is populated")
//    public void verify_that_lastname_field_is_populated() {
//
//    }
//
//    @Then("Verify that birth date field is populated")
//    public void verify_that_birth_date_field_is_populated() {
//
//    }
//
//    @Then("Verify that phone field is populated")
//    public void verify_that_phone_field_is_populated() {
//
//    }
//
//    @Then("Verify that gender field is populated")
//    public void verify_that_gender_field_is_populated() {
//
//    }
//
//    @Then("Verify that blood group field is populated")
//    public void verify_that_blood_group_field_is_populated() {
//
//    }
//
//    @Then("Verify that address field is populated")
//    public void verify_that_address_field_is_populated() {
//
//
//    }
//
//    @Then("Verify that description field is populated")
//    public void verify_that_description_field_is_populated() {
//
//    }
//
//    @Then("Verify that created date field is populated")
//    public void verify_that_created_date_field_is_populated() {
//
//    }
//
//    @Then("Verify that user field is populated")
//    public void verify_that_user_field_is_populated() {
//
//    }
//
//    @Then("Verify that country field is populated")
//    public void verify_that_country_field_is_populated() {
//
//    }
//
//    @Then("Verify that state\\/city field is populated")
//    public void verify_that_state_city_field_is_populated() {
//
//    }
//


//
//
//
//    }
//
//
//    @And("Admin clicks on the view to see user's account")
//    public void adminClicksOnTheViewToSeeUserSAccount() {
//    }
//}
//
//    // public void printColumns(){
////         driver.get("https://the-internet.herokuapp.com/tables ");
////         List<WebElement> col5Data = driver.findElements(By.xpath("//table[@id='table1']//tr//td[5]"));
////         int colNum = 1;
////         for (WebElement eachData : col5Data){
////
////             System.out.println("Row "+colNum+"Column 5 => "+eachData.getText());
////             colNum++;
////         }
////
////
////     }
//
////
////
////    @Then("assert that room is created via {string}")
////    public void assert_that_room_is_created_via(String roomNumber) {
////        ReusableMethods.waitFor(3);
////        int counter=0;
////        for(WebElement w : medunnaRoomPage.roomNumberlist){
////
////            if(w.getText().equals(roomNumber)){
////                counter++;
////                assertTrue(true);
////                break;
////
////            }
////
////
////        }
////
////        if(counter==0){
////            assertTrue(false);
////
////        }
//

//       // List<WebElement> builtYears = driver.findElements(By.xpath("(//tbody)[2]//tr//td[4]"));
//        List<WebElement> loginList = staffPage.loginlist;
////
////
//        List<String> ssnListString = new ArrayList<>();
////
//        for(int i=0; i<loginList.s; i++){
//            builtYearsString.add( builtYears.get(i).getText());
//
//        }
//        System.out.println("builtYearsString = " + builtYearsString);
//
//        int minYear = Integer.parseInt(builtYears.get(0).getText());

    // ********************* Creating a new staff by admin
    @And("Admin enters login {string}")
    public void adminEntersLogin(String string) {
        //  ReusableMethods.waitFor(2);
        staffPage.loginField.sendKeys(string);
    }

    @And("Admin enters the firstname {string}")
    public void adminEntersTheFirstname(String string) {
        //  ReusableMethods.waitFor(2);
        staffPage.firstnameField.sendKeys(string);
    }

    @And("Admin enters the lastname {string}")
    public void adminEntersTheLastname(String string) {
        //  ReusableMethods.waitFor(2);
        staffPage.lastnameField.sendKeys(string + Keys.ENTER);
    }

    @And("Admin enters the email  {string}")
    public void adminEntersTheEmail(String string) {
        ReusableMethods.waitFor(2);
        staffPage.emailField.sendKeys(string);
    }

    @And("Admin enters the SSN {string}")
    public void adminEntersTheSSN(String string) {
        // ReusableMethods.waitFor(2);
        staffPage.ssnField.sendKeys(string);
    }

    @And("Admin selects the language from the drop down")
    public void adminSelectsTheLanguageFromTheDropDown() {
        //  ReusableMethods.waitFor(2);
        WebElement language = staffPage.langKeyField;
        Select select = new Select(language);
        select.selectByVisibleText("English");
    }

    @And("Admin clicks on the Save Button")
    public void adminClicksOnTheSaveButton() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(staffPage.saveSubmitButtonUserMan);
    }

    @Then("Verify that success message New User is Created pops up")
    public void verifyThatSuccessMessageNewUserIsCreatedPopsUp() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(staffPage.toesterContMssgCreation.isDisplayed());
    }


    ///  ************ DELETING the Staff by Admin


    //********************

    @Then("Admin clicks on delete button")
    public void admin_clicks_on_delete_button() {
        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(staffPage.deleteRedButton1);
    }
    @Then("Admin clicks on delete pop up button")
    public void admin_clicks_on_delete_pop_up_button() {
        ReusableMethods.waitFor(3);
        staffPage.deleteButtonPopUp.click();
    }

    @Then("Verify that message delete is successful appears")
    public void verifyThatMessageDeleteIsSuccessfulAppears() {
        ReusableMethods.waitFor(3);
        assertTrue(staffPage.toesterContMssgDelete.isDisplayed());
    }

    @And("Verify that firstname field is populated")
    public void verifyThatFirstnameFieldIsPopulated() {

        System.out.println(staffPage.firstNameField.getAttribute("value"));
    }

    @And("Verify that confirm delete opp pop up appears")
    public void verifyThatConfirmDeleteOppPopUpAppears() {
        ReusableMethods.waitFor(3);
        assertTrue(staffPage.confirmDeleteMssg.isDisplayed());
    }


////        Calculate min year
//        for(WebElement w : builtYears){
//            if(Integer.valueOf(w.getText())<minYear){
//                minYear=Integer.valueOf(w.getText());//2004  ====> 509m
//
//            }
//        }
//
//
//        System.out.println("minYear = " + minYear);
//        System.out.println("==========================");
//        System.out.println();
//
//
////        Find index of min year

//        int idxOfMinYear = 0;
//        for (int i = 0; i < builtYears.size(); i++) {
//
//            if (Integer.parseInt(builtYears.get(i).getText()) == minYear) {
//                idxOfMinYear = i;
//            }
//        }
//        System.out.println("idxOfMinYear = " + idxOfMinYear);

}


