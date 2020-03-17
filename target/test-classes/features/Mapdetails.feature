Feature: Map page details

  @regression
  Scenario: Light side rooms ping pong room
    Given User is in the login page
    When User logs in with username "ucharlot7y@nbcnews.com" and password "archibaldmelloy"
    Then User should be able to see "ping pong" room
    Then In DB I should see the "ping pong" room



