Feature: Weight Watchers functionality test

Scenario Outline: Weight Watchers Multiple functionality test

Given User Open a dafault Browser
When User in home weightwatchers page
 
And Verify that the loaded page title Contains Weight Loss
When User click on Find a studio
And Verify that loaded page title contains Meetings Near You
When User enters zip code as "<Zipcode>" search for meetings In the search field
And Click on arrow Button
And Print the title of the first result and the distance
When User click on the first search result
And User Verify that displayed location name matches with the name of the first searched
And User Print TODAYs hours of operation from this location page
Then User cloes the browser
Examples:
|Zipcode|
|10011|