package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// this class is created to run all of the tests with JUnit

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json", // Mvn-Cucumber Report - to get it run by Mvn/verify command , need a plugin in Pom.xml
                "html:target/default-html-reports", // Default Html Report - to get it run by  either Mvn/terminal  or Runner class
                "rerun:target/rerun.txt"}, // to store failed scenarios , I have TestRunnerFailed class to automate it
        features = "src/test/resources",
        glue = "/stepdefs", // the path of stepdefs
        dryRun = false, // change it as 'true' to generate stepdefs automatically
        tags = "@wip" // to specify which test(s) will be executed
)

public class TestRunner
{

}