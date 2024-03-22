Feature:
  Scenario: TC_01_iPhone_search
    Given user is on the google homepage
    And user search for iPhone
    Then verify the result contains iPhone
    And close the application