package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RediffLoginPage {
	WebDriver driver;
	//Constructor
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By username=By.name("login");
	By password = By.id("password");
	By rediffHome = By.linkText("rediff.com");
	//user defined methods
	public WebElement userName()
	{
		//driver.findElement(By.name("login"));
		return driver.findElement(username);
	}
	//password defined methods
	public WebElement password()
	{
		return driver.findElement(password);
	}
	//user defined methods
	public WebElement rediffHome()
	{
		return driver.findElement(rediffHome);
	}
}