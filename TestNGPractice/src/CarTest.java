import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CarTest 
{

	private Car car = new Car();
	
	//private String partName="Engine";
	
	@BeforeMethod
	public void createCar()
	{
		/*car.setBrake(true);
		car.setClutch(true);
		car.setEngine(true);
		car.setGear(true);
		car.setSteering(true);
		car.setSuspension(true);*/
		
		car.setBrake(true);
		car.setClutch(false);
		car.setEngine(true);
		car.setGear(true);
		car.setSteering(true);
		car.setSuspension(true);
		
		
	/*	car.setBrake(false);
		car.setClutch(false);
		car.setEngine(false);
		car.setGear(false);
		car.setSteering(false);
		car.setSuspension(false);*/
		
	}
	
	@Test
	public void checkBrokenStatus()
	{
		testBrokenCarBasedOnTheParts("Engine");
		
		testBrokenCarBasedOnTheParts("Clutch");
		
		testBrokenCarBasedOnTheParts("Gear");

		testBrokenCarBasedOnTheParts("Steering");

		testBrokenCarBasedOnTheParts("Suspension");

	}
	
	public void testBrokenCarBasedOnTheParts(String partName)
	{
		switch (partName)
		{
		
		case "Engine" :
			
			Assert.assertEquals(car.isEngineWorking(), true, "Car is Broken ,engine is not working");
			break;
			
		case "Clutch" :
			
			Assert.assertEquals(car.isClutchWorking(), true, "Car is broken, clutch is not working");
			break;
			
		case "Gear" :
			
			Assert.assertEquals(car.isGearWorking(), true, "Car is broken, Gear is not working");
			break;
			
		case "Steering" :
			
			Assert.assertEquals(car.isSteeringWorking(), true, "Car is broken, Steering is not working");
			break;
			
		case "Suspension" :
			
			Assert.assertEquals(car.isSuspensionWorking(), true, "Car is broken, Suspension is not working");
			break;
			
		}
		
		
	}
	
/*	@Test
	public void testBrokenCarBasedOnEngine()
	{
	}
	
	@Test
	public void testBrokenCarBasedOnClutch()
	{
	}
	
	@Test
	public void testBrokenCarBasedOnGear()
	{
		Assert.assertEquals(car.isGearWorking(), true, "Gear is working fine");
	}
	
	@Test
	public void testBrokenCarBasedOnBrake()
	{
		Assert.assertEquals(car.isBrakeWorking(), true, "Brake is working fine");
	}
	
	@Test
	public void testBrokenCarBasedOnSteering()
	{
		Assert.assertEquals(car.isSteeringWorking(), true, "Steering is working fine");
	}
	
	@Test
	public void testBrokenCarBasedOnSuspension()
	{
		Assert.assertEquals(car.isSuspensionWorking(), true, "Suspension is working fine");
	}*/

}
