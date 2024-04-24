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