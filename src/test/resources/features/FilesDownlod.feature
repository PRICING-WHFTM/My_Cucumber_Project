Feature: Downloading multiple files

  Scenario:
    Given I am in HomePage
    When I click file download
    Then I should be able to see 45 elements in the page
    When I click "log.txt"
    Then "log.txt" file should be downloaded to my computer

