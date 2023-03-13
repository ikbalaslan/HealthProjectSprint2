@Api_Test
Feature: Doctors List Validation

  @US31_Api
  Scenario: TC01_Doctors_List_should_Validate
    Given "Admin" sends GET request for physicians list
    Then HTTP status code must be 200
    Then Assert that "Admin" can see all physicians list




