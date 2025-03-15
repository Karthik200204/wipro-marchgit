package stepDef;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then; 
public class GoogleSearch {
	WebDriver driver;
	WebElement searchBox;
	@Given("Browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Browser is opened");
	}
	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://www.google.com/");
	}
	@Given("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    searchBox = driver.findElement(By.name("q"));
	    searchBox.sendKeys("BDD Cucumber");
	}
	@Then("hits enter")
	public void hits_enter() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
	    searchBox.sendKeys(Keys.ENTER);
	}
	@Then("user is navigated to search results page")
	public void user_is_navigated_to_search_results_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(driver.getTitle());
	    System.out.println("User is navigated to search page");	    
	}
	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
		driver.quit();
	}
 
}