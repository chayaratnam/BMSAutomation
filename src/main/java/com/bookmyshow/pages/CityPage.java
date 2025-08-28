package com.bookmyshow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CityPage {
    WebDriver driver;

    // Constructor
    public CityPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By searchBox = By.id("citySearchBox"); // example
    By cityIcon = By.xpath("//span[text()='Chennai']"); // example

    // Actions
    public void searchCity(String cityName) {
        driver.findElement(searchBox).sendKeys(cityName);
    }

    public void selectCityIcon() {
        driver.findElement(cityIcon).click();
    }
}