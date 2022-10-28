Feature:  HotelApp search Hotel 
Description: This test is to check the login functionality of the HotelApp


Background:
Given User is on HotelApp homepage 
When user enters username
And User enters Password
And user clicks on LoginButton 

Scenario:  Search Hotel
When user Selects location
And user clicks on search Button
Then list of Hotels is displayed

Scenario: Select Hotel
When user Selects location
And user clicks on search Button
And user selects a radio button
And user clicks continue
Then Book a hotel page is displayed