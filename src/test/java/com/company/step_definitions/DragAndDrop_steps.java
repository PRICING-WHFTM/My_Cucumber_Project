package com.company.step_definitions;

import com.company.pages.DragAndDrop;
import com.company.pages.Heroku_Homepage;
import com.company.utilities.ConfigurationReader;
import com.company.utilities.DriverUtil;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDrop_steps {

    private WebDriver driver;
    Heroku_Homepage homepage = new Heroku_Homepage();
    DragAndDrop dragAndDrop = new DragAndDrop();

    @Then("I should see {string} module in the homepage")
    public void i_should_see_module_in_the_homepage(String string) {
        driver = DriverUtil.getDriver();
        Assert.assertTrue(homepage.dragAndDropModule.isDisplayed());
        Assert.assertEquals(homepage.dragAndDropModule.getText(), string);
    }

    @When("I click drag and drop")
    public void i_click_drag_and_drop() {
        homepage.dragAndDropModule.click();
    }

    @Then("I should land drag and drop page")
    public void i_should_land_drag_and_drop_page() {
        Assert.assertNotEquals(driver.getCurrentUrl(), ConfigurationReader.getProperty("herURL"));
    }

    @Then("I should see A and B elements")
    public void i_should_see_A_and_B_elements() {
        Assert.assertTrue(dragAndDrop.columnA.isDisplayed());
        Assert.assertTrue(dragAndDrop.columnB.isDisplayed());

    }

    @Then("I should be able to drag element A and drop to element B")
    public void i_should_be_able_to_drag_element_A_and_drop_to_element_B() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragAndDrop.columnA, dragAndDrop.columnB).build().perform();
        Thread.sleep(1000);
        System.out.println("column A dragged and dropped to column B");
    }

}
