@staff_validation
Feature: Staff Validation

# ******** USERS TABLE
  @staff_validation_by_login
  Scenario Outline: TC01_verify_logins
    Given user connects to database
    And user gets the column "*" from table "jhi_user"
    Then verify table "<table>" and column "<column>" contains data "<data>"
    And close the connection

    Examples: logins
      | table    | column | data          |
      | jhi_user | login  | erna.watson1  |
      | jhi_user | login  | sara.watson1  |
      | jhi_user | login  | pudar.watson1 |

#      ******** STAFF TABLE

@staff_validation_by_first_names
  Scenario Outline: TC02_verify_firstnames
  Given user connects to database
    And user gets the column "*" from table "staff"
    Then verify table "<table>" and column "<column>" contains data "<data>"
     And close the connection

    Examples: first_names
      | table | column     | data    |
      | staff | first_name | Etna    |
      | staff | first_name | Sarahan |
      | staff | first_name | Lana    |

  @staff_validation_by_lastnames
  Scenario Outline: TC02_verify_lastnames
    Given user connects to database
    And user gets the column "*" from table "staff"
    Then verify table "<table>" and column "<column>" contains data "<data>"
    And close the connection

    Examples: last_names
      | table | column    | data   |
      | staff | last_name | Watson |
      | staff | last_name | Watson |
      | staff | last_name | Watson |

#  @staff_validation_by_id
#  Scenario Outline: TC02_verify_ids       -------> calismadi
#    Given user connects to database
#    And user gets the column "*" from table "staff"
#    Then verify table "<table>" and column "<column>" contains data "<data>"
#    And close the connection
#
#    Examples: ids
#      | table | column | data  |
#      | staff | id     | 21598 |
#      | staff | id     | 21596 |
#      | staff | id     | 21587 |