@US29
Feature: Health_Project US29

  Scenario: TC01_new_county_should_be_created
    Given User goes to medunna.com
    When User clicks to user icon
    Then User clicks to sign in button
    Then User enter to admin username to textbox
    And User enters to valid password to textbox
    And User clicks to Sign in Submit button
    Then User clicks to Items&Titles dropdown button
    Then User clicks to Country at dropdown
    Then User clicks to Create a new Country button
    Then User enters a country nane to name textbox
    And User clicks to save button
    Then User verify to entered country name is exist
    Then close to driver

  Scenario: TC02_new_city_should_be_created
    Given User goes to medunna.com
    When User clicks to user icon
    Then User clicks to sign in button
    Then User enter to admin username to textbox
    And User enters to valid password to textbox
    And User clicks to Sign in Submit button
    Then User clicks to Items&Titles dropdown button
    Then User clicks to State/City dropdown
    Then User clicks to Create a new State/City button
    Then User enters a city name to name textbox
    Then User clicks to Country dropdowngi
    Then User clicks to Country that created before
    And User clicks to save button
    Then User clicks to Items&Titles dropdown button
    Then User clicks to State/City dropdown
    Then User verify to created city is exist at list
    Then User close to driver