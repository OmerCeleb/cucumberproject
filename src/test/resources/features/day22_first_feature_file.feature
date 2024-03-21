Feature: google_search
  Scenario: TC_01_iPhone_search
  Given user is on google homepage
  And user search for iPhone
  Then verify the result contains iPhone
  And close the application











# ************************* FEATURE FILE ******************************
# All feature files should have , feature extension
# All feature files are written in Gherkin Language
# Feature files are used to write test scenarios / test steps
# All feature files must start with Feature keyword
# One feature file can have ONLY one feature keyword
# Scenario keyword is used toi create test cases
# One feature file can have MANY Scenario
# Each test step should be written in GHERKIN language => Given, When, Then, And, But, *