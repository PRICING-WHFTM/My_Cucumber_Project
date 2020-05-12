Feature: JQueryUI elements

  Scenario: JQueryUI elements
    Given I am in HomePage
    When I click jquery
    Then I should land to jquery age
    When I click enabled
    Then I should see 2 options there
    When I click downloads
    Then I should see 3 options
    When I click "PDF" in options
    Then It should be downloaded to my computer