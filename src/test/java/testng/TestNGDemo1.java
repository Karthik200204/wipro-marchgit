package testng;
 

  import org.testng.annotations.Test;
  
  public class TestNGDemo1 {
 
  /*@Test (priority=1)//main method public void TC1() {
  System.out.println("Welcome to TestNG framework"); }
  
  @Test (priority=0)//main method public void TC2() {
  System.out.println("Bye to TestNG framework"); }
  
  }
 */

	@Test (priority=1,groups= {"regression"})//main method
	public void TC1()
	{
		System.out.println("Welcome to TestNG framework");
	}
	@Test (priority=0,groups= {"smoke","crazy"})//main method
	public void TC2()
	{
		System.out.println("Bye to TestNG framework");
	}
}