Feature: HotelApp Login
Description: This test is to check the login functionality of the HotelApp

#DataDriven Testing using cucumber

Scenario:  Login Successful
Given User is on HotelApp homepage 
When user enters username as "vasuvespag"
And User enters password as "vasu1234"
And user clicks on LoginButton
#Then Login is Successful

