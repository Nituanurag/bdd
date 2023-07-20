package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class) 

@CucumberOptions(plugin = { "pretty", "json:target/Report.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, // reporting purpose
		monochrome = false, // console output
		tags = "", // tags from feature file
		features = { "src/test/resources/Features" }, // location of feature files
		glue = { "stepDefinition" }) // location of step definition files

public class TestRunner {

}