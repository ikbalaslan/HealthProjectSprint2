
@US31_db
  Feature: Physicians Validation
      @Physician_valid
      Scenario: Validate_physicians_dat
      When user gets counts of physicians
      And user connect to database
      And user sends the requests
      Then user verifies count of physicians with count of DataBase
      And close the connection



#      @physician_validation_by_id
#      Scenario Outline: Validate_physicians_data
#          Given user connect to database
#          And user sends request get the column "*" from table "physicians"
#          Then user verify table "<table>" and column "<column>" contains data "<data>"
#          And close the connection
#          Examples:id
#              | table | column | data |
#              | table | column |1303 |
#              | table | column |1304 |
#              | table | column |1305 |

#
#      @physician_validation_by_last_name
#      Scenario Outline: Validate_physicians_data
#          Given user connects to database
#          And user gets the column "*" from table "physicians"
#          Then verify table "<table>" and column "<column>" contains data "<data>"
#          And close the connection
#          Examples: created_date
#              | table | column | data |
#              | table | column | Tom |
#              | table | column | Ahmet |
#              | table | column | Hanks |
#              | table | column | Berlin|





