package com.qa.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\Users\\kudumalau\\Downloads\\cucumber_assignment-master\\cucumber_assignment-master\\src\\test\\java\\com\\qa\\features\\orange.feature\\orange.feature",
		glue = "com.qa.stepdefination",
		dryRun = false,
		strict = true,
		monochrome = true,
		format = {"pretty", "html:test-output"},
		tags= {"@SmokeTest, @RegressionalTest"}
		)

public class Orange_TestRunner {

}
