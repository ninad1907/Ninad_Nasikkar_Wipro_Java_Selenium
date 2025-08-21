Feature: check user is able to login with valid credetials
Scenario: Validate login
Given login page should open in default browser
When click on username button and enter valid username
And click on continue button
And add password 
And click on submit button
Then open home page
