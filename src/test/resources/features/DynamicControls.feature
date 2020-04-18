Feature: Dynamic Control

  @IH-7
  Scenario: Enable and Disable edit-box
    Given I am in HomePage
    And "Dynamic Controls" module should exists in homepage
    When I click dynamic controls
    Then I should land t dynamic controls page
    And editBox in the page should be disabled by default
    And "Enable" button should exist in the page
    When I click enable button
    Then editBox should be enabled
    And I should see "It's enabled!" text displayed

