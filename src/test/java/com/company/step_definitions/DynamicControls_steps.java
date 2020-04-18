package com.company.step_definitions;

import com.company.pages.AddRemoveElements;
import com.company.pages.DynamicControls;
import com.company.pages.Heroku_Homepage;
import com.company.utilities.BrowserUtils;
import com.company.utilities.ConfigurationReader;
import com.company.utilities.DriverUtil;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControls_steps {

    private WebDriver driver = DriverUtil.getDriver();
    Heroku_Homepage homepage = new Heroku_Homepage();
    DynamicControls dynamicControls = new DynamicControls();

    @Given("{string} module should exists in homepage")
    public void module_should_exists_in_homepage(String string) {
        Assert.assertTrue(homepage.dynamicControlsModule.isDisplayed());
        Assert.assertEquals(homepage.dynamicControlsModule.getText(), string);
    }

    @When("I click dynamic controls")
    public void i_click_dynamic_controls() {
        homepage.dynamicControlsModule.click();
    }

    @Then("I should land t dynamic controls page")
    public void i_should_land_t_dynamic_controls_page() {
        Assert.assertNotEquals(driver.getCurrentUrl(), ConfigurationReader.getProperty("herURL"));
    }

    @Then("editBox in the page should be disabled by default")
    public void editbox_in_the_page_should_be_disabled_by_default() {
        Assert.assertFalse(dynamicControls.editBox.isEnabled());
    }

    @Then("{string} button should exist in the page")
    public void button_should_exist_in_the_page(String string) {
        Assert.assertTrue(dynamicControls.enableBtn.isDisplayed());
        Assert.assertEquals(dynamicControls.enableBtn.getText(), string);
    }

    @When("I click enable button")
    public void i_click_enable_button() {
        dynamicControls.enableBtn.click();
    }

    @Then("editBox should be enabled")
    public void editbox_should_be_enabled() {
        BrowserUtils.waitForClickablility(dynamicControls.editBox);
        Assert.assertTrue(dynamicControls.editBox.isEnabled());
    }

    @Then("I should see {string} text displayed")
    public void i_should_see_text_displayed(String string) {
        Assert.assertEquals(dynamicControls.enableText(), string);
    }


}
