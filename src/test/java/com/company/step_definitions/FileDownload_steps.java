package com.company.step_definitions;

import com.company.pages.Heroku_Homepage;
import com.company.utilities.DriverUtil;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileDownload_steps {

    WebDriver driver = DriverUtil.getDriver();
    Heroku_Homepage homepage = new Heroku_Homepage();
    List<WebElement> filesList;

    @When("I click file download")
    public void i_click_file_download() {
        homepage.downloadFile.click();
    }

    @Then("I should be able to see {int} elements in the page")
    public void i_should_be_able_to_see_elements_in_the_page(int int1) {
        filesList = driver.findElements(By.tagName("a"));
        // Assert.assertEquals(filesList.size(), int1);
    }

    @When("I click {string}")
    public void i_click(String string) {
        for (WebElement file : filesList) {
            if (file.getText().equals(string)) {
                file.click();
                file.sendKeys(Keys.ENTER);
                break;
            }
        }
    }

    @Then("{string} file should be downloaded to my computer")
    public void file_should_be_downloaded_to_my_computer(String string) {
        String fullPath = "C:\\Users\\salma\\Downloads\\" + string;
        Assert.assertTrue(Files.exists(Paths.get(fullPath)));
    }
}
