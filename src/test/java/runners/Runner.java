package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",// provides path of the features folder
        glue = "stepdefinitions",
        dryRun = false, // dryRun = true generates the missing step definitions, without running the existing step definitions
        tags = "@data_tables"

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