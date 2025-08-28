package stepDefinitions;

import org.openqa.selenium.WebDriver;
import base.DriverSetup;
import io.cucumber.java.en.*;

public class CommonSteps {

    public static WebDriver driver; // make driver static so other step classes can use it

    @Given("user is on BookMyShow homepage")
    public void openHomePage() {
        driver = DriverSetup.getDriver("chrome");
        driver.get("https://in.bookmyshow.com/");
    }
}