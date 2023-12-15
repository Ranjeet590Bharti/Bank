package page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class LogOutPage extends Base {

	public void click_on_hamburger_menu() {
		WebElement hgmenu = driver.findElement(By.xpath(
				"//button[@style='position: absolute; left: 0px; top: 0px; width: 100%; height: 100%; margin: 0px; padding: 0px; border: none; opacity: 0; font-size: 8px; cursor: pointer;']"));
		clickOnElement(hgmenu);

	}

	public void click_on_logout_and_validate_it() {
		WebElement logoutbtn = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		clickOnElement(logoutbtn);

		WebElement text = driver.findElement(By.xpath("//input[@id='login-button']"));
		String htext = text.getText();

		assertEquals("LOGIN", htext);

	}

}
