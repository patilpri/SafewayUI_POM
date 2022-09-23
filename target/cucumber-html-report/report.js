$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/SignInTests.feature");
formatter.feature({
  "name": "SignIn Teats",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "test Signin with correct credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sc1"
    }
  ]
});
formatter.step({
  "name": "I go to Safeway HomePage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "go to SignIn Page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter \"correct\" credentials",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should be redirected to HomePage",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User first name should be displayed on top",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});