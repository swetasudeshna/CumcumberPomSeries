Feature: Account Page Feature

Background:
Given user has already logged in to application
|Username|Password|
|sweta.357@gmail.com|Selenium1993|

Scenario: Accounts page title
Given user is on Accounts page
When user gets the title of the page
And page title should be "My account - My Shop"

Scenario: Accounts section count 
Given user is on Accounts page
Then user gets accounts section
| ADD MY FIRST ADDRESS |
| ORDER HISTORY AND DETAILS |
| MY CREDIT SLIPS  |
|MY ADDRESSES |
|My PERSONAL INFORMATION|
|Home|
And accounts section count should be 6


