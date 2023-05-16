package com.kayak.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/mahmut/Downloads/Kayak_Cucumber",
        glue="com/kayak/stepDefinition",
        tags="",
        dryRun=false

)



public class TestRunner {
}
