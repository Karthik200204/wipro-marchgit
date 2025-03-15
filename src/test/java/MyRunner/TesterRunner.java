package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\karthik reddy\\eclipse-workspace\\wipro_march_maven1\\src\\test\\java\\feature\\tester.feature",
							glue = "stepDef", 
							plugin = {"pretty"}, monochrome = true)

public class TesterRunner{

}