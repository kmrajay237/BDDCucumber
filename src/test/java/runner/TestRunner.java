package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles",
				 glue= {"stepDefinition"},
//				 tags= {"@first or @second or @third"},
				 tags= {"@btd"},
				 plugin= {"html:target/cucumber-html-report.html",
						 "json:target/Cucumber.json",
						 "pretty:target/Cucumber-Pretty.txt",
						 "usage:target/Cucumber-Usage.json",
						 "junit:target/Cucumber-Juint.xml"},
				 monochrome= true
//				 dryRun=true
				 )

public class TestRunner {

}
 