$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featurefiles/DataTable_Examples.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Mercury Tours with Examples",
  "description": "",
  "id": "verify-mercury-tours-with-examples",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Verify Mercury Tours with Examples",
  "description": "",
  "id": "verify-mercury-tours-with-examples;verify-mercury-tours-with-examples",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user enter Mercury URL",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user click login button with example credential",
  "keyword": "Then "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "verify-mercury-tours-with-examples;verify-mercury-tours-with-examples;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 8,
      "id": "verify-mercury-tours-with-examples;verify-mercury-tours-with-examples;;1"
    },
    {
      "cells": [
        "vinoalphaq@gmail.com",
        "Puspam@3118"
      ],
      "line": 9,
      "id": "verify-mercury-tours-with-examples;verify-mercury-tours-with-examples;;2"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 10,
      "id": "verify-mercury-tours-with-examples;verify-mercury-tours-with-examples;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "Verify Mercury Tours with Examples",
  "description": "",
  "id": "verify-mercury-tours-with-examples;verify-mercury-tours-with-examples;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user enter Mercury URL",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter \"vinoalphaq@gmail.com\" and \"Puspam@3118\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user click login button with example credential",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTable_Examples.user_enter_Mercury_URL()"
});
formatter.result({
  "duration": 9715182589,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vinoalphaq@gmail.com",
      "offset": 12
    },
    {
      "val": "Puspam@3118",
      "offset": 39
    }
  ],
  "location": "DataTable_Examples.user_enter_and(String,String)"
});
formatter.result({
  "duration": 52743785675,
  "status": "passed"
});
formatter.match({
  "location": "DataTable_Examples.user_click_login_button_with_example_credential()"
});
formatter.result({
  "duration": 1567769160,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify Mercury Tours with Examples",
  "description": "",
  "id": "verify-mercury-tours-with-examples;verify-mercury-tours-with-examples;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user enter Mercury URL",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter \"Admin\" and \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user click login button with example credential",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTable_Examples.user_enter_Mercury_URL()"
});
formatter.result({
  "duration": 6680013529,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 12
    },
    {
      "val": "admin123",
      "offset": 24
    }
  ],
  "location": "DataTable_Examples.user_enter_and(String,String)"
});
formatter.result({
  "duration": 2351963983,
  "status": "passed"
});
formatter.match({
  "location": "DataTable_Examples.user_click_login_button_with_example_credential()"
});
formatter.result({
  "duration": 68653938,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"SIGN-OFF\"}\n  (Session info: chrome\u003d80.0.3987.163)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027BLR1-LTBPKSX52\u0027, ip: \u0027172.27.7.23\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.163, chrome: {chromedriverVersion: 79.0.3945.16 (93fcc21110c10..., userDataDir: C:\\Users\\e3027405\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:59675}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 15a12565898dc0f217624091dd87abe5\n*** Element info: {Using\u003dlink text, value\u003dSIGN-OFF}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat StepDefinition.DataTable_Examples.user_click_login_button_with_example_credential(DataTable_Examples.java:36)\r\n\tat ✽.Then user click login button with example credential(Featurefiles/DataTable_Examples.feature:5)\r\n",
  "status": "failed"
});
});