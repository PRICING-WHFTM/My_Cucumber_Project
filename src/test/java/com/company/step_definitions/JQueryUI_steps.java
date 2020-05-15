package com.company.step_definitions;

import com.company.pages.Heroku_Homepage;
import com.company.pages.JqueryUI;
import com.company.utilities.BrowserUtils;
import com.company.utilities.ConfigReader;
import com.company.utilities.DriverUtil;
import com.company.utilities.JSUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JQueryUI_steps {

    Heroku_Homepage homepage = new Heroku_Homepage();
    JqueryUI jqueryUI = new JqueryUI();
    Actions actions = new Actions(DriverUtil.getDriver());
    List<WebElement> formats;

    @When("I click jquery")
    public void i_click_jquery() {
        homepage.jQuery.click();
    }

    @Then("I should land to jquery age")
    public void i_should_land_to_jquery_age() {
        Assert.assertNotEquals(DriverUtil.getDriver().getCurrentUrl(), ConfigReader.getProperty("herURL"));
    }

    @When("I hover to enabled")
    public void i_hover_to_enabled() {
        actions.moveToElement(jqueryUI.enabled).build().perform();
        BrowserUtils.wait(2);
    }

    @When("I hover to downloads")
    public void i_hover_to_downloads() throws Exception {
        actions.moveToElement(jqueryUI.downloads).build().perform();
    }

    // We need to store all bootstrap dropdown elements
    //here we get xpath of parent ul tag then linked //li //a  to them
    @Then("I should see {int} options there")
    public void i_should_see_options_there(int int1) {
        formats = DriverUtil.getDriver().findElements(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-front']//ul[@class='ui-menu ui-widget ui-widget-content ui-front']//li/a"));
        Assert.assertEquals(formats.size(), int1);
    }

    @When("I click {string} in options") //areal hidden
    public void i_click_in_options(String string) {
        for (int i = 0; i < formats.size(); i++) {
            System.out.println(formats.get(i).getText());
            if (formats.get(i).getText().contains(string)) {
                actions.moveToElement(formats.get(i)).click().build().perform();
                break;
            }
        }
        BrowserUtils.wait(2);
    }

    @Then("It should be downloaded to my computer")
    public void it_should_be_downloaded_to_my_computer() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        String fileName = "menu.pdf";
        String fullPath = "C:\\Users\\salma\\Downloads\\" + fileName;
        Assert.assertTrue(Files.exists(Paths.get(fullPath)));

    }

}