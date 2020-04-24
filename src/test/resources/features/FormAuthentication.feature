Feature: Form Authentication -> Data Table testing

  @IH-10
  Scenario: Entering Data from data table;
    Given I am in HomePage
    When I click form authentication
    Then I should land to "Login Page"
    When I enter the following data for login
      | username | password             |
      | tomsmith | SuperSecretPassword! |
    And click login button
    Then I "You logged into a secure area!" should display in the page
    When I click logout
    Then I should land back to "Login Page"

