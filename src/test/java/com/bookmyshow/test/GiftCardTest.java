package com.bookmyshow.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.bookmyshow.page.GiftCardPage;
import base.DriverSetup;

public class GiftCardTest {

    WebDriver driver;
    GiftCardPage giftCardPage;

    @BeforeClass
    public void setup() {
        driver = DriverSetup.getDriver("chrome");
        driver.get("https://in.bookmyshow.com/"); // homepage URL
        giftCardPage = new GiftCardPage(driver);
    }

    @Test
    public void checkInvalidGiftCardBalance() {
        giftCardPage.openGiftCardSection();
        giftCardPage.clickCheckBalance();
        giftCardPage.enterCardNumber("987654"); // invalid card
        giftCardPage.submit();

        String error = giftCardPage.getErrorMessage();
        System.out.println("Error message: " + error);
        Assert.assertTrue(error.toLowerCase().contains("invalid"), "Error message validation passed!");
    }
}
