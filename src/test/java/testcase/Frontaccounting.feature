Feature: Login

@valid @smoke @testcase_login_001
Scenario: Verify the functionality of Login by valid data
Given User Launch an Chrome Browser
And user should be laded on frontaccounting site
When First clear and then Enter "demouser" in username field.
And First clear and then Enter "password" in password field.
And click on login button.
Then validate login by tutle of the page.
And Close the browser.


@valid @smoke @testcase_login_002
Scenario: Verify the functionality of Login by invalid data
Given User Launch an Chrome Browser
And user should be laded on frontaccounting site
When First clear and then Enter "userdemo" in username field.
And First clear and then Enter "password" in password field.
And click on login button.
Then validate login by tutle of the page.
And Close the browser