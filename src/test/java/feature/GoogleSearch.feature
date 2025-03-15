Feature: Feature is to test Google search functionality

Scenario: Validate google search is working
Given Browser is open
And user is on google search page
And user enters a text in search box
Then hits enter
Then user is navigated to search results page
Then close the browser