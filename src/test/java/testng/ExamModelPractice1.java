package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;

public class ExamModelPractice1 extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        // Invoke browser using BaseClass method
        invokeBrowser("firefox"); // Change to "chrome" or "edge" if needed

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

                    // Open Google
            driver.get("https://www.cricbuzz.com");
            Thread.sleep(2000);
            driver.findElement(By.linkText("Schedule")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Teams")).click();
            driver.findElement(By.linkText("India")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Players")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Virat Kohli")).click();
            //driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Cricbuzz" + Keys.ENTER);

        

            // Find the search bar and type "Cricbuzz"
            
        
    }
}
