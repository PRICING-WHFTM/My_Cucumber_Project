package com.company.step_definitions;

import com.company.pages.EtsyHomepage;
import com.company.utilities.DriverUtil;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Etsy_steps {

    private WebDriver driver;

    String item;

    @Given("User is on Etcy homepage")
    public void user_is_on_Etcy_homepage() {
        driver = DriverUtil.getDriver();
        driver.get("https://www.etsy.com/");
        String homepageTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals(driver.getTitle(), (homepageTitle));
    }

    @When("User searches for {string}")
    public void user_searches_for(String item) {
        this.item = item;
        EtsyHomepage etsyhomepage = new EtsyHomepage();
        etsyhomepage.searchEditbox.sendKeys(item + Keys.ENTER);
        System.out.println("Searching for " + item);
    }

    @Then("Search result should be displayed")
    public void search_result_should_be_displayed() {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith(item));
    }

}
