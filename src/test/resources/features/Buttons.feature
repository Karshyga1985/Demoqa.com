@wip
Feature: As a User I should be able to click Buttons

  Scenario:
    Given User clicks Elements button
    And User clicks to the Buttons
    And user clicks to  Double Click Me
    Then user sees "You have done a double click"


  Scenario:
    Given User clicks Elements button
    And User clicks to the Buttons
    And user clicks to  Right Click Me button
    Then user should be able to see "You have done a right click"


  Scenario:
    Given User clicks Elements button
    And User clicks to the Buttons
    And user clicks to the  Click Me
    Then user sees another "You have done a dynamic click"




