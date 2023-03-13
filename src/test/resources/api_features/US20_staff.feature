@ApiTest
Feature: Staff Validation

#  @Api_staff_post
#  Scenario:TC01_Post_Request
#    Given user sends post request to create a staff
#    Then Verify that HTTP Status Code is 201

  @Api_staff_get
  Scenario: TC02_Get_Request
    Given user sends get request to get staff's data
    Then verify that HTTP Status Code is 200
    And verify that created staffs exists