package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CheckOutPage;

public class CheckOutPageStep {
	
	CheckOutPage check= new CheckOutPage();
	
	@When("click on checkout button")
		public void click_on_checkout_button() { 
		check.click_on_checkout_button();
	}
	
	@When("enter the first name {string} and last name {string} and zip code {string}") 
		public void enter_the_first_name_and_last_name_and_zip_code(String f,String l,String z) {
		check.enter_the_first_name_and_last_name_and_zip_code(f, l, z);
	}
	
	@Then("click on continue")
	public void click_on_continue() {
		check.click_on_continue();
	}
}
