package com.eggplant;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resorces",
        dryRun = false,
        strict = true,
        tags = "@eggplant",
        plugin = "json:target/cucumber.json"
)
public class RunCukesTest {
}
