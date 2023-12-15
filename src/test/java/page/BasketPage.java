package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class BasketPage extends Base {

	public void addProduct() {
		WebElement addtocart1 = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]"));
		clickOnElement(addtocart1);

		WebElement addtocart2 = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[2]"));
		clickOnElement(addtocart2);

		WebElement addtocart3 = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[3]"));
		clickOnElement(addtocart3);

	}

	public void click_on_basket_icon() {

		WebElement bicon = driver.findElement(By.cssSelector("[fill='currentColor']"));
		clickOnElement(bicon);
	}

	public void click_on_remove_button() {
		WebElement remove1 = driver.findElement(By.xpath("(//button[@class='btn_secondary cart_button'])[1]"));
		clickOnElement(remove1);

		WebElement remove2 = driver.findElement(By.xpath("(//button[@class='btn_secondary cart_button'])[2]"));
		clickOnElement(remove2);


	}

}
