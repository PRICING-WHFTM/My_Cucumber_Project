package com.company.step_definitions;

import com.company.utilities.BrowserUtils;
import com.company.utilities.ConfigReader;
import com.company.utilities.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hook {
    private static Logger logger = Logger.getLogger(Hook.class);

    @Before
    public void setup() {
        logger.info("##############################");
        logger.info("Test setup!");
        String browser = ConfigReader.getProperty("browser");
        if (!browser.contains("remote") && !browser.contains("mobile")) {
            DriverUtil.getDriver();
                    //manage().window().maximize();
        }
    }

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            BrowserUtils.getScreenshot(scenario.getName());
            logger.error("Test failed!");
          byte[] screenshot = ((TakesScreenshot) DriverUtil.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } else {
            logger.info("Cleanup!");
            logger.info("Test completed!");
        }
        logger.info("##############################");
        DriverUtil.close();
    }
}
