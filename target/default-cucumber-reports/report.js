$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddRemove_Elements.feature");
formatter.feature({
  "name": "Adding and removing elements to HerokuApp",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@IH-01"
    }
  ]
});
formatter.scenario({
  "name": "Add Remove module should display in HomePage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@IH-01"
    },
    {
      "name": "@IH-01"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AddRemoveModule.user_navigates_to_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add/Remove Elements should display in homePage",
  "keyword": "Then "
});
formatter.match({
  "location": "AddRemoveModule.add_Remove_Elements_should_display_in_homePage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Initially, 1 button Add element  button should display in in Add Remove Elements module",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@IH-01"
    },
    {
      "name": "@IH-01"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "AddRemoveModule.i_am_in_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add/Remove Elements module",
  "keyword": "When "
});
formatter.match({
  "location": "AddRemoveModule.i_click_on_Add_Remove_Elements_module()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land to Add/Remove Elements page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddRemoveModule.i_should_land_to_Add_Remove_Elements_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Only Add Elements button should display at the pagee",
  "keyword": "And "
});
formatter.match({
  "location": "AddRemoveModule.only_Add_Elements_button_should_display_at_the_pagee()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "After clicking Add elements button , then Delete Elements button should display",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@IH-01"
    },
    {
      "name": "@IH-01"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "AddRemoveModule.i_am_in_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add/Remove Elements module",
  "keyword": "When "
});
formatter.match({
  "location": "AddRemoveModule.i_click_on_Add_Remove_Elements_module()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land to Add/Remove Elements page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddRemoveModule.i_should_land_to_Add_Remove_Elements_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Add/Elements button",
  "keyword": "When "
});
formatter.match({
  "location": "AddRemoveModule.i_click_Add_Elements_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete Elements button is displaying",
  "keyword": "Then "
});
formatter.match({
  "location": "AddRemoveModule.delete_Elements_button_is_displaying()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User clicks Delete element button , then the element should disappear.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@IH-01"
    },
    {
      "name": "@IH-01"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "AddRemoveModule.i_am_in_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add/Remove Elements module",
  "keyword": "When "
});
formatter.match({
  "location": "AddRemoveModule.i_click_on_Add_Remove_Elements_module()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land to Add/Remove Elements page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddRemoveModule.i_should_land_to_Add_Remove_Elements_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Add/Elements button",
  "keyword": "When "
});
formatter.match({
  "location": "AddRemoveModule.i_click_Add_Elements_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete Elements button is displaying",
  "keyword": "Then "
});
formatter.match({
  "location": "AddRemoveModule.delete_Elements_button_is_displaying()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click to Delete Elements",
  "keyword": "When "
});
formatter.match({
  "location": "AddRemoveModule.i_click_to_Delete_Elements()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The element is disappearing",
  "keyword": "Then "
});
formatter.match({
  "location": "AddRemoveModule.the_element_is_disappearing()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[@class\u003d\u0027added-manually\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.163)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ANARHOME-PC\u0027, ip: \u0027192.168.0.86\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.163, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\salma\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51499}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: ec17b7717a6961873310e209448a197e\n*** Element info: {Using\u003dxpath, value\u003d//button[@class\u003d\u0027added-manually\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.isDisplayed(Unknown Source)\r\n\tat com.company.step_definitions.AddRemoveModule.the_element_is_disappearing(AddRemoveModule.java:78)\r\n\tat ✽.The element is disappearing(file:src/test/resources/features/AddRemove_Elements.feature:33)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});