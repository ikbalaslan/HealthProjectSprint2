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

  Scenario: TC10 Admin verify all physicians using API
    When Admin get count of physicians
    And Admin send get request to API
    And Admin get physicians count from API
    Then Admin verify physicians count from UI equals with count from API