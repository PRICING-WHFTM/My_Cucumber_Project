package com.company.step_definitions;

import com.company.pages.Frames;
import com.company.pages.Heroku_Homepage;
import com.company.utilities.DriverUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Frames_steps {
    private WebDriver driver = DriverUtil.getDriver();
    Heroku_Homepage homepage = new Heroku_Homepage();
    Frames frames = new Frames();

    @When("I click frame")
    public void i_click_frame() {
        homepage.frames.click();
    }

    @Then("I should see {string} and {string} the page")
    public void i_should_see_and_the_page(String string, String string2) {
        Assert.assertTrue(driver.getPageSource().contains(string)
                && driver.getPageSource().contains(string2));
    }

    @When("I click iFrame")
    public void i_click_iFrame() {
        frames.iFrame.click();
    }

    @Then("only {int} frame should exist in the page")
    public void only_frame_should_exist_in_the_page(int int1) {
        Assert.assertEquals(driver.findElements(By.tagName("iframe")).size(), int1);
    }

    @Then("I should be able to switch to frame and get current text {string}")
    public void i_should_be_able_to_swithc_to_frame_and_get_current_text(String string) {
        driver.switchTo().frame(frames.frame);
        Assert.assertEquals(frames.textIFrame(), string);
    }

    @When("I clear the exicting text and write {string}")
    public void i_clear_the_exicting_text_and_write(String string) {
        frames.iFrameTextField.clear();
        frames.iFrameTextField.sendKeys(string + Keys.ENTER);
    }

    @Then("text should e changed to {string}")
    public void text_should_e_changed_to(String string) {
        Assert.assertEquals(frames.textIFrame(), string);
        driver.switchTo().defaultContent();
    }


}
