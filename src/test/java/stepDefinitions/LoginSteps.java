package stepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

    @When("user clicks Sign in")
    public void clickSignIn() {
        System.out.println("Simulated click on Sign In button");
    }

    @When("user enters mobile number {string}")
    public void enterMobile(String mobile) {
        System.out.println("Simulated entering mobile number: " + mobile);
    }

    @Then("user should see OTP screen")
    public void verifyOtpScreen() {
        System.out.println("Simulated OTP screen display");
    }

    @Then("user should see error message")
    public void verifyError() {
        System.out.println("Simulated invalid number error displayed");
    }
}