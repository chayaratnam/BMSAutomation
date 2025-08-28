package com.bookmyshow.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import com.bookmyshow.pages.CityPage;
import base.DriverSetup;   // <--- IMPORTANT

public class CityTest {
    WebDriver driver;
    CityPage cityPage;

    @BeforeClass
    public void setup() {
        driver = DriverSetup.getDriver("chrome");  // Pass browser type
        driver.get("https://in.bookmyshow.com/");
        cityPage = new CityPage(driver);     
    }

    @Test
    public void selectCityTest() {
        cityPage.searchCity("Chennai");
        cityPage.selectCityIcon();

        System.out.println("City selected successfully!");
    }
}