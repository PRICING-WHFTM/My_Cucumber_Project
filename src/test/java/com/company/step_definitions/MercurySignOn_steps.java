package com.company.step_definitions;

import com.company.pages.MercuryHomepage;
import com.company.pages.MercurySignOn;
import com.company.utilities.BrowserUtils;
import com.company.utilities.DriverUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MercurySignOn_steps {
    private WebDriver driver = DriverUtil.getDriver();
    MercuryHomepage homepage = new MercuryHomepage();
    MercurySignOn signOn = new MercurySignOn();

    @When("I click signOn in the page")
    public void i_click_signOn_in_the_page() {
        homepage.signOn.click();
    }

    @When("I provide correct credentials")
    public void i_provide_correct_credentials() {
        signOn.logIn();
    }

    @When("I click submit button in the signon page")
    public void i_click_submit_button_in_the_signon_page() {
        signOn.submitBtn.click();
    }

    @Then("I should see continue button present in the page")
    public void i_should_see_continue_button_present_in_the_page() {
        BrowserUtils.waitForVisibility(signOn.continueBtn);
        Assert.assertTrue(signOn.continueBtn.isDisplayed());
    }

}
