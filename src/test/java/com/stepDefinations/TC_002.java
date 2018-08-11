package com.stepDefinations;

import org.openqa.selenium.By;

import cucumber.api.java.en.Then;

public class TC_002  {
	
	
	

	@Then("^I can select radio btn$")
	public void i_can_select_radio_btn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   TC_001. dr.findElement(By.xpath("html/body/form/fieldset/input[7]")).click();

}
}