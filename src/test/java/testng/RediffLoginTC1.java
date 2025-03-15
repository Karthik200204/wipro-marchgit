package testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class RediffLoginTC1 {
	//Declare the webdriver
	WebDriver driver;
	RediffHomePage rhp;
	 RediffLoginPage rlp;
	 @Test
	 public void rediffTC1()
	 {
		 driver = new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 rlp=new RediffLoginPage(driver);
		 rlp.userName().sendKeys("admin");
		 rlp.password().sendKeys("admin123");
		 //home page navigate
		 rlp.rediffHome().click();//Home page of Rediff 
		 rhp = new RediffHomePage(driver);
		 rhp.news().click();
		 rhp.movie().click();
	 }
}