package testng;
 
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class TestNGDemo3 {
	
	@Test (enabled=false,priority=1,groups= {"regression"})//main method
	public void TC1()
	{
		System.out.println("Welcome to TestNG framework");
		String name="wipro";
		Assert.assertEquals(name, "Wipro");//failure
		System.out.println("Both are equal");//not executed
	}
	
	@Test (enabled=true,priority=0,groups= {"smoke","crazy"})//main method
	public void TC2()
	{
		System.out.println("Bye to TestNG framework");
		Assert.assertEquals(6>5,true);//pass
		Assert.assertTrue(4<5);//false
		Assert.assertFalse(false);
		System.out.println("Pass");
	}
 
}
 
 