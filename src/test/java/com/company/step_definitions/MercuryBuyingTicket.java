package com.company.step_definitions;

import com.company.pages.MercuryFlightFinder;
import com.company.pages.MercuryHomepage;
import com.company.pages.MercurySignOn;
import com.company.utilities.DriverUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MercuryBuyingTicket {
    private WebDriver driver = DriverUtil.getDriver();
    MercuryHomepage homepage = new MercuryHomepage();
    MercurySignOn signOn = new MercurySignOn();
    MercuryFlightFinder flightFinder = new MercuryFlightFinder();

    @Given("I logged in the account")
    public void i_logged_in_the_account() {
        homepage.signOn.click();
        signOn.logIn();
        signOn.submitBtn.click();
    }

    @When("I select trip type")
    public void i_select_trip_type() {
        flightFinder.selectRoundTrip();
    }

    @When("I select passengers count")
    public void i_select_passengers_count() {
        flightFinder.selectCountOfPassengers("2");
    }

    @When("I select departing location")
    public void i_select_departing_location() {
        flightFinder.selectDepartingFrom("New York");
    }

    @When("I select departing month and date")
    public void i_select_departing_month_and_date() {
        flightFinder.selectDateOfDeparture("May", "13");
    }

    @When("I select arriving location")
    public void i_select_arriving_location() {
        flightFinder.selectArrivingInLocation("London");
    }

    @When("I select returning month and date")
    public void i_select_returning_month_and_date() {
        flightFinder.selectDateOfReturning("June", "15");
    }

    @When("I select service class")
    public void i_select_service_class() {
        flightFinder.selectServClass(3);
    }

    @When("I select airline")
    public void i_select_airline() {
        flightFinder.selectAirline("Unified Airlines");
    }

    @When("I click continue button in the page")
    public void i_click_continue_button_in_the_page() {
        flightFinder.continueBtn.click();
    }

    @Then("I should see {string} text in the page")
    public void i_should_see_text_in_the_page(String string) {
        Assert.assertTrue(driver.getPageSource().contains(string));
    }


}
