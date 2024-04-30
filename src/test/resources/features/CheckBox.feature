Feature: As a User I am able to use check box and Radio button
  Scenario:
    Given User clicks Elements button
    Then User is able to see list of modules
      | Text Box              |
      | Check Box             |
      | Radio Button          |
      | Web Tables            |
      | Buttons               |
      | Links                 |
      | Broken Links - Images |
      | Upload and Download   |
      | Dynamic Properties    |
    And User clicks to the Check Box button
    And User clicks to the Document button
    And User clicks to the Workspace button
    And User clicks to the Angular button
    Then user should be able to see the "You have selected : angular" message

