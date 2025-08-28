package com.bookmyshow.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GiftCardPage {
    WebDriver driver;

    // Constructor
    public GiftCardPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By giftCardMenu = By.xpath("//a[text()='Gift Cards']");
    By checkBalanceButton = By.xpath("//button[text()='Check Gift Card Balance']");
    By cardNumberField = By.id("giftCardNumber"); // example
    By submitButton = By.id("submitGiftCard"); // example
    By errorMessage = By.id("errorMessage"); // example

    // Actions
    public void openGiftCardSection() {
        driver.findElement(giftCardMenu).click();
    }

    public void clickCheckBalance() {
        driver.findElement(checkBalanceButton).click();
    }

    public void enterCardNumber(String cardNumber) {
        driver.findElement(cardNumberField).sendKeys(cardNumber);
    }

    public void submit() {
        driver.findElement(submitButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}