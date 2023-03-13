
@DB_Test
  Feature: DataBase_Test
@db_validation_physicians
    Scenario: read_physicians_list
      Given Admin connects to database
        And user gets the column "*" from table "physician"
         And user reads all table data
          Then user verify table "physician" contains data







