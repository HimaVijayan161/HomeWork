Feature: Perform actions on the Corporate Information Tab

Scenario: Check the shareholder patterns
Given User can see the Corporate Information Tab
When User select's "Shareholding Patterns"
Then User can see whether a table is visible or not
Then User verifies the promoters holdings is more than 50%
 


