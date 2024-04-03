package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", // creates reports on the console as well
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        monochrome = true,  // makes the console reports more readable
        features = "./src/test/resources/features",// provides path of the features folder
        glue = {"stepdefinitions", "hooks"}, // provides path of the step definitions folder and hooks folder
        dryRun = false, // dryRun = true generates the missing step definitions, without running the existing step definitions
        tags = "@param_feature"


)
public class Runner {


}

/*

    Runner class is used to run the feature files
    And to add report plugins
    Runner class is used to connect the JAVA (steep definitions) and NON-JAVA (feature files) parts
    @RunWith(Cucumber.class) makes the Runner class runnable
    @CucumberOptions is used to connect the feature files with their step definitions. It is also used fot configurations and report plugins
    features => provides path of the features folder
    glue => is used to connect feature file with it step definitions
    dryRun = true generates the missing step definitions, without running the existing step definitions
    dryRun = false must be used to run the tests normally
    @tags us used to run specific test scenarios


 */