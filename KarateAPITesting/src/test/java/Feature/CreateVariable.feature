Feature: Test Dummy website using Karate REST 

Scenario: get list of employees

* def expectedOutput = read('result.json')

Given url 'http://reqres.in/api/users/2'
When method GET
Then status 200
Then print response
And match expectedOutput == response
And match response.data.id == 2
#And match job_code == null



#1:14​ "response" keyword and "print" feature
#3:05​ Validate API response (Full JSON comparison) 
#5:18​ How to define variables in feature file 
#6:50​ How to read external file 
#9:14​ How to check the value of a field in the response 
#11:03​ How to compare the full Json except a single filed/ few fields or 'ignore' feature 
#13:18​ Presence or absence of a field in the response / how to store the value of a field from response in a variable.
