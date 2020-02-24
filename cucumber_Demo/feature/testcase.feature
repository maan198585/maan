Feature: Google Homepage
This feature verifies the functionality on Google Homepage

Scenario: Check that main elements on Google text box
    Given I launch Chrome browser
    When I open Google Homepage
    And I verify that the page displays search text box
    Then I verify that text is entered and searched
    And Clicks the submit button
    