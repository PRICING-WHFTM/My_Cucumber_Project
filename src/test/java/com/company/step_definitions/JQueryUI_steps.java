package com.company.step_definitions;

import com.company.pages.Heroku_Homepage;
import com.company.pages.JqueryUI;
import com.company.utilities.ConfigReader;
import com.company.utilities.DriverUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JQueryUI_steps {

    Heroku_Homepage homepage = new Heroku_Homepage();
    JqueryUI jqueryUI = new JqueryUI();
    Actions actions = new Actions(DriverUtil.getDriver());
    List<WebElement> insideEnabled;
    List<WebElement> fileFormats;

    @When("I click jquery")
    public void i_click_jquery() {
        homepage.jQuery.click();
    }

    @Then("I should land to jquery age")
    public void i_should_land_to_jquery_age() {
        Assert.assertNotEquals(DriverUtil.getDriver().getCurrentUrl(), ConfigReader.getProperty("herURL"));
    }

    @When("I click enabled")
    public void i_click_enabled() {
        actions.moveToElement(jqueryUI.enabled).build().perform();
    }

    @Then("I should see {int} options there")
    public void i_should_see_options_there(int int1) {
        insideEnabled = DriverUtil.getDriver().findElements(By.tagName("//body/div/div/div/div/ul/li[2]/ul[1]//li/a"));
        //Assert.assertEquals(insideEnabled.size(), int1);
    }

    @When("I click downloads")
    public void i_click_downloads() {
        for (WebElement element : insideEnabled) {
            if (element.getAttribute("innerHTML").contentEquals("Downloads")) {
                actions.moveToElement(element).build().perform();
            }
        }
    }

    @Then("I should see {int} options")
    public void i_should_see_options(int int1) {
        // fileFormats = DriverUtil.getDriver().findElements(By.tagName("//ul[@class='ui-menu ui-widget ui-widget-content ui-front']//ul[@class='ui-menu ui-widget ui-widget-content ui-front']//li/a"));

    }

    @When("I click {string} in options")
    public void i_click_in_options(String string) {
        for (WebElement elem : insideEnabled) {
            if (elem.getAttribute("innerHTML").contentEquals(string)) {
                actions.moveToElement(elem).build().perform();
                elem.click();
                break;
            }
        }
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
