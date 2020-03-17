$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/DataDrivenLogin.feature");
formatter.feature({
  "name": "Login",
  "description": "  Testing login function with different set of data",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login negative test with different set of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Navigate to website",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should get the \"\u003ctextMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "textMessage"
      ]
    },
    {
      "cells": [
        "tomsmith",
        "SuperSecretPassword!",
        "You logged into a secure area!"
      ]
    },
    {
      "cells": [
        "xosemi",
        "passcode",
        "Your username is invalid!"
      ]
    },
    {
      "cells": [
        "amador",
        "password",
        "Your username is invalid!"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login negative test with different set of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to website",
  "keyword": "Given "
});
formatter.match({
  "location": "DataDrivenLogin.navigate_to_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"tomsmith\" and \"SuperSecretPassword!\"",
  "keyword": "When "
});
formatter.match({
  "location": "DataDrivenLogin.i_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the \"You logged into a secure area!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DataDrivenLogin.i_should_get_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login negative test with different set of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to website",
  "keyword": "Given "
});
formatter.match({
  "location": "DataDrivenLogin.navigate_to_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"xosemi\" and \"passcode\"",
  "keyword": "When "
});
formatter.match({
  "location": "DataDrivenLogin.i_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the \"Your username is invalid!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DataDrivenLogin.i_should_get_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login negative test with different set of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to website",
  "keyword": "Given "
});
formatter.match({
  "location": "DataDrivenLogin.navigate_to_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"amador\" and \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "DataDrivenLogin.i_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the \"Your username is invalid!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DataDrivenLogin.i_should_get_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Etsy_par1.feature");
formatter.feature({
  "name": "Etsy product search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Etsy search for an item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Etcy homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Etsy_steps.user_is_on_Etcy_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for \"wooden spoon\"",
  "keyword": "When "
});
formatter.match({
  "location": "Etsy_steps.user_searches_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search result should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Etsy_steps.search_result_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Mapdetails.feature");
formatter.feature({
  "name": "Map page details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Light side rooms ping pong room",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Mapdetails_steps.user_is_in_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs in with username \"ucharlot7y@nbcnews.com\" and password \"archibaldmelloy\"",
  "keyword": "When "
});
formatter.match({
  "location": "Mapdetails_steps.user_logs_in_with_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to see \"ping pong\" room",
  "keyword": "Then "
});
formatter.match({
  "location": "Mapdetails_steps.user_should_be_able_to_see_room(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In DB I should see the \"ping pong\" room",
  "keyword": "Then "
});
formatter.match({
  "location": "Mapdetails_steps.in_DB_I_should_see_the_room(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});