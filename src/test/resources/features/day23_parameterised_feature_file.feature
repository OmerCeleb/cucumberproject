@param_feature
Feature:
  Scenario: TC_01_iPhone_search
    Given user navigates to "https://www.google.se/"
    And user search for "iPhone" on google
    Then verify the result contains "iPhone"
    And close the application