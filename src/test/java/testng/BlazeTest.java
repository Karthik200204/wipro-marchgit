package testng;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class BlazeTest extends BaseClass{
	String name,password,url,browser;
	@BeforeTest
	public void readData() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\karthik reddy\\eclipse-workspace\\wipro_march_maven1\\src\\main\\java\\data\\blaze.properties");
		Properties prop = new Properties();
		prop.load(fis);
		name = prop.getProperty("loginusername");
		password = prop.getProperty("loginpassword");
		url = prop.getProperty("url");
		browser = prop.getProperty("browser");
	}
	@Test
	public void data()
	{
		System.out.println(name);
		System.out.println(password);
		System.out.println(url);
		System.out.println(browser);
	}
	@Test (enabled=true)
	//@Parameters({"browser"})
	public void login() throws IOException, InterruptedException
	{
		invokeBrowser(browser);
		driver.get(url);
		Thread.sleep(3000);
		//screenshot();
		//enter the user-id and password and enter
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("loginusername")).sendKeys(name);
		driver.findElement(By.id("loginpassword")).sendKeys(password);
		driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
		System.out.println("ok successfully logged in");
		//logout
		
		//driver.findElement(By.xpath("//*[@class='btn btn-success btn-lg']")).click();
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("successfully loggedout");
		
	}
}

