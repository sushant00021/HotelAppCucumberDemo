Feature: HotelApp Login
Description: This test is to check the login functionality of the HotelApp

Scenario Outline:  Login Successful
Given User is on HotelApp homepage 
When user enters username as <"<username>">
And User enters Password as <"<password>">
And user clicks on LoginButton
#Then Login is Successful

Examples:
| username | password |
| vasuvespag | vasu1234 |
|  aryan1207 | Aryan@120799 |
