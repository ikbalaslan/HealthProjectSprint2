@US25
Feature: Test Results and payment view


  Background: Patient_goes_homepage_and_sign_in_and_view_My_Appointments_option
    Given "Patient" goes home page
    When "Patient" clicks account menu
    And "Patient" clicks sign in
    And "Patient" enters "patient_username1" in username field
    And "Patient" enters "patient_password1" in password field
    And "Patient" click on RememberMe checkbox
    And "Patient" clicks sign in submit button
    And "Patient" click on My Pages(Patient)
    And "Patient" click on My Appointments option


    @US_TC01
  Scenario: TC01 Patient see their test results
    When "Patient" click on Show Test button
    When "Patient" click on View Result button
      And "Patient" verify Test Result Page which page contains id, name for test, default max and min value, test date and description
      And Patient close the app

  @US_TC02
  Scenario: TC02 Patient see their test results
    When "Patient" click on Show Invoice button
    Then Patient verify Invoice Page which page contains Date,SSN,Name of Patient, Payment Method and Total Cost
    And Patient close the app

