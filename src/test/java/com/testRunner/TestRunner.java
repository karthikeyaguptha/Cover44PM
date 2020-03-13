package com.testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//Karthik Guptha//IdeaProjects//Cover44PM//Feature Files//Division.feature",
        glue = "StepDefns",
        monochrome = true,
        dryRun = true,
        tags = "",

        plugin = {"pretty","html:target/cucumber-html-reports",
                  "json:target/cucumber-json-reports",
                  "junit:target/cucumber.xml"
        }
)


public class TestRunner {
}
