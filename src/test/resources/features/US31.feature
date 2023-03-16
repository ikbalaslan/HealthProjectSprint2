@Api_Test
Feature: Doctors List Validation

 @US31

 Scenario: Validate_Physicians_using_API_and_DB

   When user send post request "https://medunna.com/api/authenticate" for get token with username "AdminTeam01" and password "Team01+"
   And user sends GET request to "https://medunna.com/api/physicians" with token
   Then HTTP status code 200
   Then verify physicians ids in database
















#  Scenario: TC01_Doctors_List_should_Validate
#    Given "Admin" sends GET request for physicians list
#    Then HTTP status code must be 200
#    Then Assert that "Admin" can see all physicians list




