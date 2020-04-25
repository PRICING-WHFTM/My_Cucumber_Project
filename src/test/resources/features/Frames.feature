Feature: Checking frames , simple frame

@IH-11
  Scenario: Simple frame in the page
    Given I am in HomePage
    When I click frame
    Then I should see "Nested Frames" and "iFrame" the page
    When I click iFrame
    Then only 1 frame should exist in the page
    Then I should be able to switch to frame and get current text "Your content goes here."
    When I clear the exicting text and write "Hello World"
    Then text should e changed to "Hello World"






