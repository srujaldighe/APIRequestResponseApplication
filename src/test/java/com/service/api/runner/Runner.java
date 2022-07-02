package com.service.api.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/com/service/api/feature",glue={"com.service.api.stepdefinition"},
tags= {"@UpdateAPIResponse,@PostAPIResponse,@GetAPIResponse,@DELETEAPI"},monochrome=true,
plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/APITestReport.html"})

public class Runner {
	
	
}
