package com.BDD.BDD_TestNG;

import org.junit.AfterClass;
//import org.junit.runner.RunWith;
//import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import java.io.File;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "C:\\Users\\Lenovo\\Desktop\\Appiumworkspace\\BDD_TestNG\\FeatureFiles\\First.feature", glue = {
		"com.stepDefinations" }, format = { "pretty", "html:target/Destination" }, plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\Lenovo\\Desktop\\Appiumworkspace\\BDD_TestNG\\Reports\\ExtentReporting.html" }, monochrome = true)

public class Runner extends AbstractTestNGCucumberTests {
	@AfterClass
	public void reportsetup() {
		Reporter.loadXMLConfig(
				new File("C:\\Users\\Lenovo\\Desktop\\Appiumworkspace\\BDD_TestNG\\FeatureFiles\\extent-config.xml"));
		Reporter.setSystemInfo("Username", "Your_ID");
		Reporter.setSystemInfo("Projectname", "Your_Project name");
		Reporter.setSystemInfo("OS", "Windows 7");
		Reporter.setSystemInfo("Browsername", "Firefox");
		Reporter.setTestRunnerOutput("Cucumber Junit Runner ");

	}
}
