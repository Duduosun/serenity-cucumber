package net.thucydides.cucumber.integration;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Run all of the passing sample scenarios - a quick smoke test
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(format = "pretty", features = {"src/test/resources/samples"}, tags = "@shouldPass")
public class WhenRunningPassingCucumberSampleTests {
}