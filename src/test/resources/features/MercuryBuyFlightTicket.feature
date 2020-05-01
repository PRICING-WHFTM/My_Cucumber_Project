Feature: Buy new Flight ticket

  Scenario: Buying nef Flight ticket step by step
    Given I am in mercury homepage
    And I logged in the account
    When I select trip type
    And I select passengers count
    And I select departing location
    And I select departing month and date
    And I select arriving location
    And I select returning month and date
    And I select service class
    And I select airline
    When I click continue button in the page
    Then I should see "DEPART" text in the page

