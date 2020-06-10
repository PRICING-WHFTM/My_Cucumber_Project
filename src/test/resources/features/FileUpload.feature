Feature: Uploading file

  @ignore
  Scenario: Uploading file testing
    Given I am in HomePage
    When I click file upload
    And choose the file "log.txt"
    And click upload button
    Then I should get "File Uploaded!" confirmation text

