@US19
Feature: US19

  Background:Doctor_goes_homepage_and_signin
    Given "Admin" goes home page
    When "Admin" clicks account menu
    And "Admin" clicks sign in
    And "Admin" enters "admin_username" in username field
    And "Admin" enters "admin_password" in password field
    And "Admin" clicks sign in submit button
    And "Admin" clicks items&titiles menu
    And "Admin" clicks Physician

#  Scenario: TC01 Admin can choose/search an existing registered person by SSN id
#    And "Admin" clicks create a new Physician button
#    And Admin clicks Use Search check box
#    And Admin enters "757-89-1986" into SSN field
#    And Admin clicks Search User button
#    Then Admin verify physicians name is "Doctor"
#    And Admin enters "Team02" into firstname field
#    And Admin enters "Sprint2" into lastname field
#    And Admin enters "01.01.1986" into birthday field
#    And Admin enters "555-5555555" into phone number field
#    And Admin select "Dermatology" from speciality field
#    And Admin upload photo image field
#    And Admin enters exam fee
#    And Admin select "doctorstrange:757-89-1986" from user field
#    And "Admin" clicks save button
#    And Admin close the app
#
#  Scenario: TC02 Their info should be populated firstname, lastname birth date etc..
#    And "Admin" clicks ID for sort list
#    Then Admin verify firstname is "Team02"
#    Then Admin verify lastname is "Sprint2"
#    Then Admin verify birthdate is "01/01/86 00:00"
#    And Admin close the app
#
#  Scenario: TC03 Admin should provide a specialty for the Doctor
#    And "Admin" clicks ID for sort list
#    Then Admin verify speciality is "DERMATOLOGY"
#    And Admin close the app
#
#  Scenario: TC04 Admin can provide a profile picture of the doctor
#    And "Admin" clicks ID for sort list
#    Then Admin verify pictures is uploaded
#    And Admin close the app
#
#  Scenario: TC05 Admin should choose the doctor among existing users
#    And "Admin" clicks ID for sort list
#    Then Admin verify existing user is "doctorstrange"
#    And Admin close the app
#
#  Scenario: TC06 Admin should provide the Exam fee of the doctor (earning amount)
#    And "Admin" clicks ID for sort list
#    Then Admin verify exam fee
#    And Admin close the app
#
#  Scenario: TC07 Admin can view all Physicians' info populated on view portal
#    And "Admin" clicks ID for sort list
#    And Admin clicks first physicians view button
#    Then Admin verify ssn header is visible
#    Then Admin verify firstName header is visible
#    Then Admin verify lastName header is visible
#    Then Admin verify birthDate header is visible
#    Then Admin verify phone header is visible
#    Then Admin verify speciality header is visible
#    And Admin close the app
#
#  Scenario: TC08 Admin can edit existing Physicians' info using new data
#    When "Admin" clicks ID for sort list
#    And Admin clicks first physicians edit button
#    And Admin change firstname with "Doctor"
#    Then Admin verify firstname is "Doctor"
#    And Admin close the app
#
#  Scenario: TC09 Admin can delete existing Physicians
#    When "Admin" clicks ID for sort list
#    When Admin clicks delete button
#    And Admin confirm deletion
#    Then Admin verify deletion
#    And Admin close the app

  Scenario: TC10 Admin verify all physicians using API
    When Admin get count of physicians
    And Admin send get request to API
    And Admin get physicians count from API
    Then Admin verify physicians count from UI equals with count from API
