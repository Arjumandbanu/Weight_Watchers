package com.ww.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty","html:target","com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber_Extents_report.html"},
		features = "Test_Scripts/W_W_Test_Scripts.feature",
		glue= "com.ww.stepdef")

public class Test_Runner extends AbstractTestNGCucumberTests{

}
