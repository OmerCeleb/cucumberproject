@scenario_outline_2 @regression
Feature: data_tables_feature

  Background:
    Given user navigates to "https://editor.datatables.net/"

  Scenario Outline: TC_user_creation
    And user clicks on new button
    And user enters first name as "<first_name>"
    And user enters last name as "<last_name>"
    And user enters position as "<position>"
    And user enters office as "<office>"
    And user enters extension as "<extension>"
    And user enters start date as "<start_date>"
    And user enters salary as "<salary>"
    And user clicks on create button
    And user search for "<first_name>"
    Then verify that the name field contains "<first_name>"
    And close the application

    Examples:
      | first_name |  | last_name |  | position |  | office   |  | extension |  | start_date |  | salary |
      | Ayse       |  | Can       |  | QA       |  | NY       |  | 546       |  | 2023-12-22 |  | 50000  |
      | Fatma      |  | Can       |  | Dev      |  | Istanbul |  | 546       |  | 2023-12-22 |  | 50000  |
      | Mike       |  | Kine      |  | QA       |  | TXT      |  | 546       |  | 2023-12-22 |  | 50000  |
      | Chris      |  | Love      |  | QA       |  | NY       |  | 546       |  | 2023-12-22 |  | 50000  |
      | Ali        |  | Can       |  | QA       |  | NY       |  | 546       |  | 2023-12-22 |  | 50000  |