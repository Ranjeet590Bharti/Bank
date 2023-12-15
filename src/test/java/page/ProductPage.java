package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class ProductPage extends Base {

	public void click_on_product_for_details() {
		WebElement product = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
		clickOnElement(product);

	}

	public void click_on_add_to_cart_button() {
		WebElement adbtn = driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
		clickOnElement(adbtn);

	}

	public void click_on_the_remove_button() {
		WebElement rembtn = driver.findElement(By.xpath("//button[@class='btn_secondary btn_inventory']"));
		clickOnElement(rembtn);

	}

	public void click_on_all_items_and_validate_the_item() {
		WebElement allitem = driver.findElement(By.xpath("//a[@id='inventory_sidebar_link']"));
		clickOnElement(allitem);

	}

	public void click_on_about_and_validate_the_it_working() {
		WebElement about = driver.findElement(By.xpath("//a[@id='about_sidebar_link']"));
		clickOnElement(about);

	}

	public void click_on_resetapp_state_and_validate_it() {
		WebElement reset = driver.findElement(By.xpath("//a[@id='reset_sidebar_link']"));
		clickOnElement(reset);

	}

}
