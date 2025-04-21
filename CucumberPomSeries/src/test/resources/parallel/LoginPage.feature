@Login
Feature: Login page feature

@Smoke
Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Shop"

@Smoke
Scenario: Forgot password link
Given user is on login page
Then forgot your password link should be displayed

@Regression @skip_scenario
Scenario: Login with correct credentials
Given user is on login page
When user enters Username "sweta.357@gmail.com"
And user enters Password "Selenium1993"
And user clicks on Login button
Then user gets the title of the page
And page title should be "My account - My Shop"