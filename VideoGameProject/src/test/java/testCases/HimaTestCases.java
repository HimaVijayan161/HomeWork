package testCases;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import  io.restassured.response.Response;

public class HimaTestCases 
{

	@Test
	public void getTest()
	{
		Response response=RestAssured.given().when().get("http://dummy.restapiexample.com/employees");
		
		
		given().auth().p
		
		System.out.println(response.getContentType());

		System.out.println(response.getCookies());
		
		
		
	}
	
}
