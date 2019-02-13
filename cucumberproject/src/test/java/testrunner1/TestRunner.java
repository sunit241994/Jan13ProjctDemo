package testrunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Training_H1B.06.15\\eclipse-workspace\\cucumberproject\\src\\test\\java\\featurefolder1\\demotours.feature", glue = {"stepdefs1"}, plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json" }, monochrome = true )
public class TestRunner {

}
