package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class CheckOutPage extends Base {

	public void click_on_checkout_button() {
		WebElement chkbtn = driver.findElement(By.cssSelector("[class='btn_action checkout_button']"));
		clickOnElement(chkbtn);
	}

	public void enter_the_first_name_and_last_name_and_zip_code(String f,String l,String z) {
		WebElement firstname = driver.findElement(By.cssSelector("input#first-name"));
		firstname.sendKeys(f);
		
		WebElement lastname = driver.findElement(By.cssSelector("input#last-name"));
		lastname.sendKeys(l);
		
    	WebElement zipcode = driver.findElement(By.cssSelector("input#postal-code"));
		zipcode.sendKeys(z);		
	}

	public void click_on_continue() {
		WebElement con = driver.findElement(By.cssSelector("[type='submit']"));
		clickOnElement(con);
	}

}
