package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.BasketPage;

public class Basket {
	
		BasketPage basket=new BasketPage();
		
		@And ("add product from product page")
		public void add_Product() {
			basket.addProduct();
	}
		@Then("click on basket icon")
		public void click_on_basket_icon() {
			basket.click_on_basket_icon();
			
		}
		@Then("click on remove button")
		public void click_on_remove_button() {
			basket.click_on_remove_button();
		}

}
