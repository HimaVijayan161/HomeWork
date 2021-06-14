Feature: Login and search for company or Symbol

Scenario: Login to NSE site & search based on Company or Symbol name 
Given user enters the "url"
When title of the page is "title"
Then user searches for company name read from excel sheet "ReadName.xlsx"
Then user is able to see the tab "Corporate Information" & click on it



