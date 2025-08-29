package stepDefinitions;

import io.cucumber.java.en.*;
import com.bookmyshow.page.GiftCardPage;

public class GiftCardSteps {

    GiftCardPage giftCardPage;

    public GiftCardSteps() {
        giftCardPage = new GiftCardPage(CommonSteps.driver);
    }

    @When("user opens Gift Card section")
    public void openGiftCardSection() {
        giftCardPage.openGiftCardSection();
    }

    @And("user clicks Check Gift Card Balance")
    public void clickCheckBalance() {
        giftCardPage.clickCheckBalance();
    }

    @And("user enters card number {string}")
    public void enterCardNumber(String cardNumber) {
        giftCardPage.enterCardNumber(cardNumber);
    }

    @And("user submits")
    public void submit() {
        giftCardPage.submit();
    }

    @Then("user should see an error message")
    public void verifyError() {
        giftCardPage.verifyError();
    }
}
