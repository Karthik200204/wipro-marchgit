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
 
public class HRMSDemo extends BaseClass{
	String name,password,url,browser;
	@BeforeTest
	public void readData() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\karthik reddy\\eclipse-workspace\\wipro_march_maven1\\src\\main\\java\\data\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		name = prop.getProperty("username");
		password = prop.getProperty("password");
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
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//logout
		
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		    //  clicking the logout dropdown button
		    WebElement logoutDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")));
		    logoutDropdown.click();

		    // Locate and clicking the "Logout" option
		    WebElement logoutOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]"))); // Example XPath
		    logoutOption.click();
		    
            driver.quit();
		
		
	}
 
}