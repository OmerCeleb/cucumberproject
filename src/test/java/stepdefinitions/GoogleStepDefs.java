package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Google_HomePage;
import utilities.Driver;
import utilities.WaitUtils;

public class GoogleStepDefs {

    Google_HomePage googleHomePage = new Google_HomePage(); // Create object from Google_HomePage

    @Given("user is on google homepage")
    public void user_is_on_google_homepage() {
        Driver.getDriver().get("https://www.google.com/");
        WaitUtils.waitFor(2);
    }

    @Given("user search for iPhone")
    public void user_search_for_i_phone() {
        googleHomePage.searchBox.sendKeys("iPhone", Keys.ENTER);
        WaitUtils.waitFor(2);
    }

    @Then("verify the result contains iPhone")
    public void verify_the_result_contains_i_phone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
        WaitUtils.waitFor(2);
    }

    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

}