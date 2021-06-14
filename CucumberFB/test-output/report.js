$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Hima/Automation_Hima/CucumberFB/src/main/java/com/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook page",
  "description": "",
  "id": "facebook-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Facebook login page test scenario",
  "description": "",
  "id": "facebook-page;facebook-login-page-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of the page is Facebook",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters username",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enter password",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 14662314018,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_the_page_is_Facebook()"
});
formatter.result({
  "duration": 13821097,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username()"
});
formatter.result({
  "duration": 91190347,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enter_password()"
});
formatter.result({
  "duration": 115895329,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 100241018,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 23448220824,
  "status": "passed"
});
});