Feature: Multiple scenarios


	* def output1 = read('result1.json')

	
Scenario: request user details 2
	Given url 'http://reqres.in/api/users/2'
	When method get
	Then status 200
	Then print response
	And match response == output1[0]


Scenario: request user details 3
		* def output1 = read('result1.json')
	Given url 'http://reqres.in/api/users/3'
	When method get
	Then status 200
	Then print response
	And match response == output1[1]

