Feature: Login Page Automation of Sauce Demo Website.

Scenario Outline: Check Login is successful with valid Credentials
Given User is on Login Page of Sauce demo.
When User enters valid "<username>" and "<password>"
Then User clicks on login button
Then User is navigated to Home Page
And Close the browser 

Examples: 

| username | password |
| standard_user | secret_sauce |

Scenario Outline: Check Login is unsuccessful with invalid username credential and valid password credntial
Given User is on Login Page of Sauce demo.
When User enters invalid "<username>" and valid "<password>"
Then User clicks on login button
Then User shows pop up msg
And Close the browser 

Examples: 

| username | password |
| standard | secret_sauce |

Scenario Outline: Check Login is unsuccessful with valid username credential and invalid password credntial
Given User is on Login Page of Sauce demo.
When User enters valid "<username>" and invalid "<password>"
Then User clicks on login button
Then User shows pop up msg
And Close the browser 


Examples: 

| username | password |
| standard_user | secret_ |

Scenario Outline: Check Login is unsuccessful with invalid username and invalid password credntial
Given User is on Login Page of Sauce demo.
When User enters invalid "<username>" and invalid "<password>"
Then User clicks on login button
Then User shows pop up msg
And Close the browser 


Examples: 

| username | password |
| standard_ | secret_ |