Feature: As a User I should be able to click to Radio Buttons

  Scenario: Radio Button
    Given User clicks Elements button
    When User clicks to the Radio Button
    And User clicks to Yes button
    Then User should see "You have selected Yes" message