Feature: HotelApp Login
Description: This test is to check the login functionality of the HotelApp

Scenario:  Login Successful
Given User is on HotelApp homepage 
When user enters username and password
| username | password |
| vasuvespag | vasu1234 |
|  aryan1207 | Aryan@120799 |
And user clicks on LoginButton
#Then Login is Successful
