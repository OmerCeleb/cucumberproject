package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt",
                "com.avenstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,
        features = "./src/test/resources/features",
        glue = "stepdefinitions", // DO NOT USE HOOKS here. Because Hooks class has Driver.closeDriver(); which can create problem for remote driver
        dryRun = true,
        tags = "@grid"


)
public class GridRunner {



}
