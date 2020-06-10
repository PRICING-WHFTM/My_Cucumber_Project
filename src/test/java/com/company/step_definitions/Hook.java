package com.company.step_definitions;

import com.company.utilities.BrowserUtils;
import com.company.utilities.ConfigReader;
import com.company.utilities.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;


public class Hook {


    @Before
    public void setup() {
        String browser = ConfigReader.getProperty("browser");
        if (!browser.contains("remote") && !browser.contains("mobile")) {
            DriverUtil.getDriver();

        }
    }

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            BrowserUtils.getScreenshot(scenario.getName());
            byte[] screenshot = ((TakesScreenshot) DriverUtil.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        DriverUtil.closeDriver();
    }
}
