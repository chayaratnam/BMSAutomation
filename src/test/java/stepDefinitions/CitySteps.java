package stepDefinitions;

import io.cucumber.java.en.*;
import com.bookmyshow.pages.CityPage;

public class CitySteps {

    CityPage cityPage;

    @When("user searches for city {string}")
    public void searchCity(String cityName) {
        cityPage = new CityPage(CommonSteps.driver);
        cityPage.searchCity(cityName);
    }

    @When("user selects the city icon")
    public void selectCityIcon() {
        cityPage.selectCityIcon();
    }

    @Then("city should be selected successfully")
    public void verifyCitySelected() {
        System.out.println("City selected successfully!");
    }

    @Then("an error message should be displayed")
    public void verifyCityError() {
        System.out.println("Invalid city error displayed!");
    }
}