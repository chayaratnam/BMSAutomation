package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By signInButton = By.xpath("//span[text()='Sign in']");
    private By mobileNumberField = By.id("mobileNo");

    // Actions
    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }

    public void enterMobileNumber(String mobile) {
        driver.findElement(mobileNumberField).sendKeys(mobile);
    }
}