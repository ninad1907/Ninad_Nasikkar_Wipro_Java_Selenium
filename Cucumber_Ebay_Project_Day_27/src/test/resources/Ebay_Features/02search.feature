Feature: check user is able to search for multiple products using the search box
Scenario Outline: Succcessfully searched for product
Given Search page should open in default browser
When search for multiple <products> 
Then open the searched product

Examples:
|products|
|Sports|
|Electronics|
|Books|