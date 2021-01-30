package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/TagsDemo.feature",
				 glue= {"stepDefinition"},
				 tags= "@smoke",
				 plugin= {"html:Report/cucumber-html-report.html",
						 "json:Report/Cucumber.json",
						 "pretty:Report/Cucumber-Pretty.txt",
						 "usage:Report/Cucumber-Usage.json",
						 "junit:Report/Cucumber-Juint.xml"}
				 )

public class TestRunner {

}
 