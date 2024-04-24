Feature: jdbc_feature

  @user_login
  Scenario: TC01_read_user_login
    Given user connects to application database
    And user gets the column "*" from the table "jhi_user"
    And read all column "login" data
    Then verify table "jhi_user" and column "login" contains data "tom-ss"
#    And close the connection

  @user_email
  Scenario: TC02_user_email_test
    Given user connects to application database
    And user gets the column "*" from the table "jhi_user"
    And read all column "email" data
    Then verify table "jhi_user" and column "email" contains data "yuki1@gmail.com"
#    And close the connection


  @account_status
  Scenario: TC03_read_account_status
    Given user connects to application database
    And user gets the column "*" from the table "tp_account"
    And read all column "account_status_type" data
    Then verify table "tp_account" and column "account_status_type" contains data "SUESPENDED"
#    And close the connection


#    Verify if account_type contains following types: CHECKING, CREDIT CARD, SAVING, INVESTING

  @account_type
  Scenario Outline: TC04_read_account_type
    Given user connects to application database
    And user gets the column "*" from the table "tp_account"
    And read all column "account_status_type" data
    Then verify table "<table_name>" and column "<column_name>" contains data "<data_name>"
    Examples:
      | table_name | | column_name  | | data_name |
      | tp_account | | account_type | | CHECKING |
      | tp_account | | account_type | | CREDIT_CARD |
      | tp_account | | account_type | | SAVING |
      | tp_account | | account_type | | INVESTING |
