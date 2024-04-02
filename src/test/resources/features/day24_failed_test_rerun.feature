@failed
Feature: failed_test
  Scenario: TC_01_admin_login
    Given user navigates to "https://www.bluerentalcars.com/login"
    When user enters admin email and password
      | admin_email     | password |
      | wrong@gmail.com | 12345    |
    And user clicks on login button
    Then verify login is successful
    And close the application
