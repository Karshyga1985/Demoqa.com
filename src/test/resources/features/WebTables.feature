@smoke @regression
Feature: Web Tables functionality

  Background:
    Given User is on the Elements page
    When User selects the Web Tables option

  Scenario: Verify that Add button is clickable and Registration Form displays on the screen
    And User clicks the Add button
    Then User see that Registration Form modal window displays on the screen
    And The Registration Form has list of the fields below
      | First Name |
      | Last Name  |
      | Email      |
      | Age        |
      | Salary     |
      | Department |


  Scenario: Verify that the user can submit registration form successfully
    And User clicks the Add button
    And User enters "Sandra" in the form's first name placeholder
    And User enters "Bullok" in the form's last name placeholder
    And User enters "sandra@gmail.com" in the form's email placeholder
    And User enters 35 in the form's age placeholder
    And User enters 65000 in the form's salary placeholder
    And User enters "Sales" in the form's department placeholder
    And User clicks the forms Submit button
    Then User sees the new record on the table as below
      | Sandra           |
      | Bullok           |
      | sandra@gmail.com |
      | 35               |
      | 65000            |
      | Sales            |


  Scenario: Verify that the close button on the Registration form works as expected
    And User clicks the Add button
    And User clicks the close button on the registration form
    Then The registration form disappears on the screen


  Scenario: Verify that user can search and retrieve info by the first name successfully
    And User enters "Alden" first name in the search box
    Then User sees searched info info in the table as below
      | First Name | Alden             |
      | Last Name  | Cantrell          |
      | Age        | 45                |
      | Email      | alden@example.com |
      | Salary     | 12000             |
      | Department | Compliance        |





