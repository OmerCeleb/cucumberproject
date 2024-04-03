package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUpScenario() {
        System.out.println("Before Hooks");
    }

    @After
    public void tearDown(Scenario scenario) {
        //    System.out.println("After Hooks");

        byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        scenario.attach(screenshot, "image/png", "screenshot of failed step");
        Driver.closeDriver();

    }


}
