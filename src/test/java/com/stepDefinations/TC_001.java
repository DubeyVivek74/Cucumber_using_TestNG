package com.stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TC_001{

	static WebDriver dr;

	@Before
	public void setup(Scenario scenario) {
		dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("C:\\Users\\Lenovo\\Desktop\\Appiumworkspace\\BDD_TestNG\\EnquiryForm.html");
		scenario.write("Testcase started ,Website opened");
	}

	@Given("^As a user i fill up all textboxes$")
	public void as_a_user_i_fill_up_all_textboxes() throws Throwable {

		dr.findElement(By.xpath(".//*[@id='firstname']")).sendKeys("TB1");
		dr.findElement(By.xpath(".//*[@id='lastname']")).sendKeys("TB2");
		dr.findElement(By.xpath(".//*[@id='alternatename']")).sendKeys("TB3");
		dr.findElement(By.xpath(".//*[@id='addressname']")).sendKeys("TB4");
		dr.findElement(By.xpath(".//*[@id='addressname2']")).sendKeys("TB5");
		dr.findElement(By.xpath(".//*[@id='addressname3']")).sendKeys("TB6");
	}

	@Then("^I can fill car dropdown$")
	public void i_can_fill_car_dropdown() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Select ss = new Select(dr.findElement(By.xpath(".//*[@id='cars']")));
		ss.selectByIndex(1);
		String selected_item = ss.getFirstSelectedOption().getText();
		System.out.println("Selected value from dropdown is ->> "+selected_item);
	}

	@Then("^I upload resume$")
	public void i_upload_resume() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		dr.findElement(By.xpath("html/body/form/fieldset/input[13]")).click();
		dr.findElement(By.xpath("html/body/form/fieldset/input[13]")).sendKeys("C:\\Users\\Lenovo\\Downloads\\Adhar_card_UID.jpg");
		Thread.sleep(1000);
	}

	@After
	public void tearDown(Scenario scenario) {
		scenario.write("Testcase ended ,Website closing");
		dr.close();

	}
}
