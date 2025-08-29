package stepDefinitions;

import io.cucumber.java.en.*;
import com.bookmyshow.pages.CityPage;

public class CitySteps {

    CityPage cityPage;

    public CitySteps() {
        cityPage = new CityPage(CommonSteps.driver);
    }

    @When("user searches for city {string}")
    public void searchCity(String cityName) {
        cityPage.searchCity(cityName);
    }

    @And("user selects the city icon")
    public void selectCityIcon() {
        cityPage.selectCityIcon();
    }

    @Then("city should be selected successfully")
    public void verifyCitySelected() {
        cityPage.verifyCitySelected();
    }

    @Then("an error message should be displayed")
    public void verifyCityError() {
        cityPage.verifyCityError();
    }
}
