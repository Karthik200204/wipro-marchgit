package testng;
 
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
 
//@Listeners(MyTestListener.class)
public class MyTest {
	@Test (enabled=true)
	public void test1()
	{
		System.out.println("Executing Test case-1");
		Assert.assertTrue(true);//pass
	}
	@Test (enabled=true)
	public void test2()
	{
		System.out.println("Executing Test case-1");
		Assert.assertFalse(false);//fail
	}
 
}