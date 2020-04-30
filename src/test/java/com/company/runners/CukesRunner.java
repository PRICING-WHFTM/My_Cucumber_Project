package com.company.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "com/company/step_definitions",
        monochrome = true,
        strict = false,
        dryRun = false,
        //tags = {"@register"},    //always comment out after running by tags
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"})


public class CukesRunner {


}
