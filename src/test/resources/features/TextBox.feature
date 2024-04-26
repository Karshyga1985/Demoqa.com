@wip
Feature: Text Box form functionality

  Background:
      Given User is on the Elements page
      When User selects Text Box option

  Scenario: Verify Text Box form headers display correctly
    Then User sees "Text Box" header
    And User sees the Text Box placeholders headers display correctly as below
      | Full Name         |
      | Email             |
      | Current Address   |
      | Permanent Address |

  Scenario Outline: Verify that the user can submit the Text Box form successfully
    When User enters "<Full Name>" in the Full Name placeholder
    And User enters "<Email>" in the Email placeholder
    And User enters "<Current Address>" in the Current Address placeholder
    And User enters "<Permanent Address>" in the Permanent Address placeholder
    And User clicks the Submit button
    Then User should see the output result
    Examples:
      | Full Name        | Email             | Current Address                   | Permanent Address                 |
      | Perizat Aztayeva | perizat@gmail.com | 2323 Runner Dr, Dulles, TX        | 2323 Runner Dr, Dulles, TX        |
      | Kara Bayatova    | kara@gmail.com    | 9411 Lee Hwy apt 413, Fairfax, VA | 9411 Lee Hwy apt 413, Fairfax, VA |
      | Burkhan Temirov  | burkhan@gmail.com | 852 Center Ln, Vienna, VA         | 9411 Lee Hwy apt 413, Fairfax, VA |
