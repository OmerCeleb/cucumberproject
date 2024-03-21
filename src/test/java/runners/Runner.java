package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features/day22_first_feature_file.feature",// provides path of the features folder
        glue = "stepdefinitions"
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

 */