package com.projectassist.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"},
        glue = "com/projectassist/step_definitions",
        features = "src/test/resources/features",
        publish = true,
        tags = "@Login",
        dryRun =false



)
public class CukesRunner {

}