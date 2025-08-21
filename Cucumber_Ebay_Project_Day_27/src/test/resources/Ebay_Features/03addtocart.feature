Feature: check user is able to add product to cart and delete the product from cart
Scenario: Add to cart and delete from cart 
Given Add to cart page should open in default browser
When login
And add the product to cart and delete
Then product deleted successfully