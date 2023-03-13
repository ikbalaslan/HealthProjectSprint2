@US16
Feature: Create Edit Patient By Admin

  @TC01_Create_Patient_By_Admin
  Scenario Outline: Create New Patient
    Given Go to medunna home page
    When Admin click Sing in Link
    Then Admin fills the username "<username>"
    And Admin fills the password "<password>"
    And Admin clicks the Sing in button
    And Admin clicks the Items&Titles dropdown
    And Admin clicks Patient link
    And Admin clicks the Create a new Patient Button
    And Admin fills the "<Birth Date>","<Gender>","<Blood Group>","<Address>","<Description>","<User>","<Country>","<State>"
    And Admin clicks Save Button
    Then Verify the A new patient is created message
    And Closes the browser

    Examples: Test Data
    |username     |password|Birth Date         |Gender|Blood Group|Address |Description|User   |Country|State     |
    |AdminTeam02  |Team02+ |04/05/1980 05:30 AM|MALE  |A+         |B street|Home       |ben.den|USA    |NEWYORK   |



  @TC02_New_Patient_Can_Not_By_Created_By_Staff
  Scenario Outline: Create New Patient By Staff Negative Scenario
    Given Go to medunna home page
    When Staff clicks Sign in link
    Then Staff fills the username "<username>"
    And Staff fills the password "<password>"
    And Staff clicks the Sign in button
    Then Verify the Mypages link is displayed instead of Items&Titles link
    And Closes the browser

    Examples:
    |username|password|
    |Mat02   |Mat02@? |


  @TC03_New_Patient_Can_Not_Be_Created_By_Doctor
  Scenario Outline: Created New Patient By Doctor Negative Scenario
    Given Go to medunna home page
    When Doctor clicks Sign in link
    Then Doctor fills the username "<username>"
    And Doctor fills the password "<password>"
    And Doctor clicks the Sign in button
    Then Verify the Mypages link is displayed instead of Items&Titles link
    And Closes the browser

    Examples:
    |username    |password|
    |team02doctor|Qwerty02|


  @TC04_New_Patient_Can_Not_Be_Created_By_Patient
  Scenario Outline: Created New Patient By Patient Negative Scenario
    Given Go to medunna home page
    When Patient clicks Sign in link
    Then Patient fills the username "<username>"
    And Patient fills the password "<password>"
    And Patient clicks the Sign in button
    Then Verify the Mypages(Patient) link is displayed instead of Items&Titles link
    And Closes the browser

    Examples:
      |username|password|
      |Tom02   |Tom02@? |


  @TC05_Admin_Can_See_All_Patient_Information
  Scenario Outline: See Patient Info
    Given Go to medunna home page
    When Admin click Sing in Link
    Then Admin fills the username "<username>"
    And Admin fills the password "<password>"
    And Admin clicks the Sing in button
    And Admin clicks the Items&Titles dropdown
    And Admin clicks Patient link
    Then Verify all patient information
    And Closes the browser

    Examples:
      |username      |password|
      |AdminTeam02   |Team02+ |



  @TC06_Admin_Can_See_Patient_ID
  Scenario Outline: See Patient ID
    Given Go to medunna home page
    When Admin click Sing in Link
    Then Admin fills the username "<username>"
    And Admin fills the password "<password>"
    And Admin clicks the Sing in button
    And Admin clicks the Items&Titles dropdown
    And Admin clicks Patient link
    And Admin clicks Edit button
    Then Verify patient ID information is shown
    And Closes the browser

    Examples:
      |username      |password|
      |AdminTeam02   |Team02+ |



  @TC07_State_Should_be_Provided_Can_Not_Be_Blank
  Scenario Outline: Create New Patient Provide State Positive Scenario
    Given Go to medunna home page
    When Admin click Sing in Link
    Then Admin fills the username "<username>"
    And Admin fills the password "<password>"
    And Admin clicks the Sing in button
    And Admin clicks the Items&Titles dropdown
    And Admin clicks Patient link
    And Admin clicks the Create a new Patient Button
    And Admin fills the "<Birth Date>","<Gender>","<Blood Group>","<Address>","<Description>","<User>","<Country>","<State>"
    And Admin clicks Save Button
    Then Verify the A new patient is created message
    And Closes the browser

    Examples: Test Data
      |username     |password|Birth Date         |Gender|Blood Group|Address |Description|User   |Country|State     |
      |AdminTeam02  |Team02+ |04/05/1980 05:30 AM|MALE  |A+         |B street|Home       |ben.den|USA    |FLORIDA   |



  @TC08_State_Should_be_Provided_Can_Not_Be_Blank_Negative
  Scenario Outline: Create New Patient Provide State Negative Scenario
    Given Go to medunna home page
    When Admin click Sing in Link
    Then Admin fills the username "<username>"
    And Admin fills the password "<password>"
    And Admin clicks the Sing in button
    And Admin clicks the Items&Titles dropdown
    And Admin clicks Patient link
    And Admin clicks the Create a new Patient Button
    And Admin fills the "<Birth Date>","<Gender>","<Blood Group>","<Address>","<Description>","<User>","<Country>",
    And Admin clicks Save Button
    Then Verify the A new patient is not created successfully
    And Closes the browser

    Examples: Test Data
      |username     |password|Birth Date         |Gender|Blood Group|Address |Description|User   |Country|
      |AdminTeam02  |Team02+ |04/05/1980 05:30 AM|MALE  |A+         |B street|Home       |ben.den|USA    |



  @TC09_Admin_Can_Delete_Any_Patient
  Scenario Outline: Admin Delete Patient
    Given Go to medunna home page
    When Admin click Sing in Link
    Then Admin fills the username "<username>"
    And Admin fills the password "<password>"
    And Admin clicks the Sing in button
    And Admin clicks the Items&Titles dropdown
    And Admin clicks Patient link
    And Admin clicks the Delete button next to the patient "<First Name>","<Last Name>","<Email>","<Phone>"
    And Admin clicks on the Delete button on the delete message window
    Then verify the user is deleted message
    And Closes the browser

  Examples:

    |username     |password|First Name      |Last Name|Email            |Phone     |
    |AdminTeam02  |Team02+ |Temprory Patient|Delete   |temprory@team.com|3685944586|


















