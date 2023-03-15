@API_test
Feature: Room Creation by API

  @US30_TC01
  Scenario: User should create room with API
    When User makes POST request
    Then Validate room creation by using API

  @US30_TC02
  Scenario: User should read room details with API
    When User makes GET request
    Then Validate room reading by using API
