package testng;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class ParameterDemo {
	@Test
	@Parameters({"num1","num2"})
	public void sum(int a, int b)
	{
		int sum=a+b;
		System.out.println("Sum of "+a+" & "+b+" is: "+sum);
	}

 
	@Test
	@Parameters({"num1","num2"})
	public void sub(int a, int b)
	{
		int sub=a-b;
		System.out.println("Subtraction of "+a+" & "+b+" is: "+sub);
		Assert.assertTrue(a>b);
	}
 
}