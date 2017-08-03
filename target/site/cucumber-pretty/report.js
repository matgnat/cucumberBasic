$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "Successfully login to the page",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4412629936,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login with correct username and password",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I naviate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "See how ccucmber-java8 looks like",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter the following value for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "admin",
        "adminpassword"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#      | admin_DT_2 | adminpassword_DT_2 |"
    }
  ],
  "line": 11,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should see the userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.iNaviateToLoginPage()"
});
formatter.result({
  "duration": 141804434,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 21
    }
  ],
  "location": "StepDef.seeHowCcucmberJavaLooksLike(int)"
});
formatter.result({
  "duration": 2379521,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.iEnterTheFollowingValueForLogin(DataTable)"
});
formatter.result({
  "duration": 289863377,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.iClickLoginButton()"
});
formatter.result({
  "duration": 403534679,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.iShouldSeeTheUserformPage()"
});
formatter.result({
  "duration": 91697106,
  "status": "passed"
});
formatter.after({
  "duration": 250703040,
  "status": "passed"
});
});