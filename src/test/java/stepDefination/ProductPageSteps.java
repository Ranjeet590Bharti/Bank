package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.ProductPage;

public class ProductPageSteps {

	ProductPage prpage = new ProductPage();

	@When("click on product for details")
	public void click_on_product_for_details() {
		prpage.click_on_product_for_details();

	}

	@When("click on add to cart button")
	public void click_on_add_to_cart_button() {
		prpage.click_on_add_to_cart_button();

	}

	@And("click on all items  and validate the item")
	public void click_on_all_items_and_validate_the_item() {
		prpage.click_on_all_items_and_validate_the_item();

	}

	@And("click on about and validate the it working")
	public void click_on_about_and_validate_the_it_working() {
		prpage.click_on_about_and_validate_the_it_working();

	}

	@And("click on resetapp state and validate it")
	public void click_on_resetapp_state_and_validate_it() {
		prpage.click_on_resetapp_state_and_validate_it();

	}
	@Then("click on the remove button")
	public void click_on_the_remove_button() {
		
	}
}
