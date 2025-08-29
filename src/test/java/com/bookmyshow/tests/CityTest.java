package com.bookmyshow.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import com.bookmyshow.pages.CityPage;
import base.DriverSetup;

public class CityTest {

    WebDriver driver;
    CityPage cityPage;

    @BeforeClass
    public void setup() {
        driver = DriverSetup.getDriver("chrome");
        driver.get("https://in.bookmyshow.com/"); // homepage URL
        cityPage = new CityPage(driver);
    }

    @Test
    public void selectValidCityTest() {
        cityPage.searchCity("Chennai");
        cityPage.selectCityIcon();
        cityPage.verifyCitySelected();
        System.out.println("Valid city test passed!");
    }

    @Test
    public void selectInvalidCityTest() {
        cityPage.searchCity("InvalidCity");
        cityPage.verifyCityError();
        System.out.println("Invalid city test passed!");
    }
}
