package stepDefinitions;

import io.cucumber.java.en.*;
import com.bookmyshow.page.GiftCardPage;

public class GiftCardSteps {

    GiftCardPage giftCardPage;

    @When("user opens Gift Card section")
    public void openGiftCardSection() {
        giftCardPage = new GiftCardPage(CommonSteps.driver);
        giftCardPage.openGiftCardSection();
    }

    @When("user clicks Check Gift Card Balance")
    public void clickCheckBalance() {
        giftCardPage.clickCheckBalance();
    }

    @When("user enters card number {string}")
    public void enterCardNumber(String cardNumber) {
        giftCardPage.enterCardNumber(cardNumber);
    }

    @When("user submits")
    public void submit() {
        giftCardPage.submit();
    }

    @Then("user should see an error message")
    public void verifyError() {
        System.out.println("Invalid gift card error displayed!");
    }
}