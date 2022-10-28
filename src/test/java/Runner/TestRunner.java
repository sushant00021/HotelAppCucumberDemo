package Runner;

import org.junit.runner.RunWith;
// org.junit.Test;
import static org.junit.Assert.*;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="com.stepDefinition",
		plugin= {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})
//"pretty", "html:target/cucumber-reports.html"
//com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter
public class TestRunner {

}
//<dependency>
//<groupId>com.vimalselvam</groupId>
//<artifactId>cucumber-extentsreport</artifactId>
//<version>3.0.2</version>
//</dependency>
//<dependency>
//<groupId>com.aventstack</groupId>
//<artifactId>extentreports</artifactId>
//<version>5.0.9</version>
//<scope>test</scope>
//</dependency>