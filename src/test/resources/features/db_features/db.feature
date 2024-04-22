Feature: jdbc_feature

  @user_login
  Scenario: TC01_read_user_login
    Given user connects to application database
    And user gets the column "*" from the table "jhi_user"


    #   And close the database

    