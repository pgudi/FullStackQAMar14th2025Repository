package com.sgtesting.actitime.driverscript;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\test\\resources\\FeatureFiles",
        glue = "com.sgtesting.actitime.stepdefinitions"
)
public class DriverScript extends AbstractTestNGCucumberTests {


}
