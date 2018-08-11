$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Lenovo/Desktop/Appiumworkspace/BDD_TestNG/FeatureFiles/First.feature");
formatter.feature({
  "line": 1,
  "name": "Filling enquiry form with multiple scenario",
  "description": "",
  "id": "filling-enquiry-form-with-multiple-scenario",
  "keyword": "Feature"
});
formatter.write("Testcase started ,Website opened");
formatter.before({
  "duration": 8310898171,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Fill all the txtbox with dummy data",
  "description": "",
  "id": "filling-enquiry-form-with-multiple-scenario;fill-all-the-txtbox-with-dummy-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "As a user i fill up all textboxes",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I can fill car dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_001.as_a_user_i_fill_up_all_textboxes()"
});
});