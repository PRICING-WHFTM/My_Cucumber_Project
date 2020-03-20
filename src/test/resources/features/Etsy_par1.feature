Feature: Etsy product search


  Scenario: Etsy search for an item
    Given User is on Etcy homepage
    When User searches for "wooden spoon"
    Then Search result should be displayed


