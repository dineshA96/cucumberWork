package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseAdactin;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\TestData3.feature", glue = {
		"com.stepdefinition" }, dryRun = false, monochrome = true/*, plugin = { "pretty",
				"json:src\\test\\resources\\Reporting\\cucumber2.json" }, tags = { " not @Reg" }*/)

public class RunAdactin extends BaseAdactin {

	@AfterClass
	public static void afterClass() {
		// JVMReport.generateJVMReport(System.getProperty("user.dir") +
		// "\\src\\test\\resources\\Reporting\\cucumber1.json");
	}
}
