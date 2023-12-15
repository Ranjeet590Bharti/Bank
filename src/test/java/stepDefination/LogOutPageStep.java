package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.LogOutPage;

public class LogOutPageStep {
	
	LogOutPage logout=new LogOutPage();
	
	@And("click on hamburger menu")
	public void click_on_hamburger_menu() {
		logout.click_on_hamburger_menu();
		
	}
    @Then("click on logout and validate it")
    public void click_on_logout_and_validate_it() {
    	click_on_logout_and_validate_it();
    	
    }
}
