@US29
Feature: Health_Project US29

  Scenario: TC01_new_county_should_be_created
    Given "Admin" goes home page
    When "Admin" clicks account menu
    And "Admin" clicks sign in
    And "Admin" enters "admin_username" in username field
    And "Admin" enters "admin_password" in password field
    And "Admin" clicks sign in submit button
    And "Admin" clicks items&titiles menu
    Then User clicks to Country at dropdown
    Then User clicks to Create a new Country button
    Then User enters a country nane to name textbox
    And User clicks to save button
    Then User verify to entered country name is exist
    And Admin close the app

  Scenario: TC02_new_city_should_be_created
    Given "Admin" goes home page
    When "Admin" clicks account menu
    And "Admin" clicks sign in
    And "Admin" enters "admin_username" in username field
    And "Admin" enters "admin_password" in password field
    And "Admin" clicks sign in submit button
    And "Admin" clicks items&titiles menu
    Then User clicks to State dropdown
    Then User clicks to Create a new State button
    Then User enters a city name to name textbox
    Then User clicks to Country dropdown
    Then User clicks to Country that created before
    And User clicks to save button
    And "Admin" clicks items&titiles menu
    Then User clicks to State dropdown
    Then User verify to created city is exist at list
    And Admin close the app