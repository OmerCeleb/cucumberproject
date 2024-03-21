Feature: google_search

  Background: navigating_to_google
    Given user is on the google homepage

    @iPhone
  Scenario: TC_01_iPhone_search
  And user search for iPhone
  Then verify the result contains iPhone
  And close the application

    @teapot
  Scenario: TC_02_teapot_search
  And user search for porcelain teapot
  Then verify the result contains porcelain teapot
  And close the application

  @bmw
  Scenario: TC_03_bmw_search
  And user search bmw
  Then verify the result contains porcelain teapot
  And close the application









# ************************* FEATURE FILE ******************************
# All feature files should have , feature extension
# All feature files are written in Gherkin Language
# Feature files are used to write test scenarios / test steps
# All feature files must start with Feature keyword
# One feature file can have ONLY one feature keyword
# Scenario keyword is used toi create test cases
# One feature file can have MANY Scenario
# Each test step should be written in GHERKIN language => Given, When, Then, And, But,
# Background keyword is used to run repeated pre-conditions
# It will run BEFORE EACH scenario