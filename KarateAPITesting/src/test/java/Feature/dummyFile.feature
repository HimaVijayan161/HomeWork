Feature: Test Dummy website using Karate REST 

Scenario: get list of employees

Given url 'http://reqres.in/api/users/2'
When method GET
Then status 200



