package com.company.step_definitions;

import com.company.pages.Heroku_Homepage;
import com.company.utilities.ConfigReader;
import com.company.utilities.DriverUtil;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BasicAuth {

    private WebDriver driver = DriverUtil.getDriver();
    Heroku_Homepage homepage = new Heroku_Homepage();

    @Given("I am in Home page")
    public void i_am_in_Home_page() {
        driver.get(ConfigReader.getProperty("herURL"));
    }

    @Given("Basic Auth element should display in Ho")
    public void basic_Auth_element_should_display_in_Ho() {
        Assert.assertTrue(homepage.basicAuth.isDisplayed());
    }


}
