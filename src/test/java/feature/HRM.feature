Feature: Login to HRM Application
 
Scenario Outline: Login with credentials
Given User is on HRMLogin page
When User enters username as "<username>" and "<password>"
Then User should be able to login if valid credentials are provided
 
Examples:
|username|password|
|test|test123|
|Admin|admin123|
|Karthik|Karthik123|