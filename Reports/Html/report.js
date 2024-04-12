$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/User/eclipse-workspace/cumcumberflipkart/src/test/resources/featurefile/flipkart.feature");
formatter.feature({
  "name": "",
  "description": "  To validate add to cart function in flipkart",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "    To add a product to cart",
  "keyword": "Scenario"
});
formatter.step({
  "name": "open the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.open_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the product name",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_the_product_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose a product",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.choose_a_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "switch to another page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.switch_to_another_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add a product to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.add_a_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
});