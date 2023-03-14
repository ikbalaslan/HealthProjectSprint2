
@Physicians_DB
  Feature: Physicians Validation
      @Physician_valid
      Scenario: Validate_physicians_data
      Given user connects to database
      And user send requests to gets the column "id" from table "physician"
      Then user verify table id list has "1303"
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





