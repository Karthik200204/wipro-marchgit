package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RediffHomePage {
	WebDriver driver;
	//constructor
	public RediffHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	//capture the links
	By news = By.linkText("NEWS");
	By movie = By.linkText("MOVIES");
	//user defined methods
	public WebElement news()
	{
		return driver.findElement(news);
	}
	public WebElement movie()
	{		
		return driver.findElement(movie);
	}
}