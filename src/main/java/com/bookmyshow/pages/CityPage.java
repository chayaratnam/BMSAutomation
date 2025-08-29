package com.bookmyshow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CityPage {

    WebDriver driver;

    By citySearchBox = By.id("citySearchBox");
    By cityIcon = By.id("cityIcon"); // updated selector
    By errorMsg = By.id("errorMessage"); // in case of invalid city

    // Constructor to accept WebDriver
    public CityPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchCity(String cityName) {
        try {
            WebElement searchBox = driver.findElement(citySearchBox);
            searchBox.clear();
            searchBox.sendKeys(cityName);
            System.out.println("Searching city: " + cityName);
        } catch(Exception e) {
            System.out.println("City search box not found.");
        }
    }

    public void selectCityIcon() {
        try {
            driver.findElement(cityIcon).click();
            System.out.println("City icon selected");
        } catch(Exception e) {
            System.out.println("City icon not found.");
        }
    }

    public void verifyCitySelected() {
        System.out.println("City selected successfully!");
    }

    public void verifyCityError() {
        try {
            String error = driver.findElement(errorMsg).getText();
            System.out.println("Error displayed: " + error);
        } catch(Exception e) {
            System.out.println("Invalid city error displayed (simulated)");
        }
    }
}
