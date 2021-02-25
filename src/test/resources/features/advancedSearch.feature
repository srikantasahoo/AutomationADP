@AdvancedSearch
Feature: Acceptance testing for Advanced serch page
@AdvancedSearch-Positive
Scenario: Enter value into the fields
Given Navigate to home page "https://www.autotrader.com/" of AutoTrading website
When Click on the Advanced Search Button link and page navigate to "Search for Cars For Sale Online - Find a Car at Autotrader"
Then Enter the ZipCode in text box
Then Select the Certified Check Box under Condition
Then Select the Convertible check box under Style
Then Update the Year drop down menus as follows: select "2017" as From year and select "2020" as To year
Then Select Make as BMW under Make, Model & Trim section
Then Click on the Search button
Then Page Navigate to "Certified BMW Convertibles for Sale in Alpharetta, GA 30004 - Autotrader" Page
Then Assert that you see only BMW cars in the results page
