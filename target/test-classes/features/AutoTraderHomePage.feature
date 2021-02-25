@HomePage
Feature: Acceptance testing to validate elements are present.
In order to validate the home page elements are present 
we will do acceptance testing
Scenario: Validate element in the Page
Given Navigate to home page "https://www.autotrader.com/"
When Click on the Links and check links are enabled
|Links          |
|Browse by Make |
|Browse by Style|
|Advanced Search|
Then Check the Search button
Then Check the drop downs
