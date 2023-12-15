Feature: add to cart
@Reg
Scenario: add to cart from product page
    When user enter username "standard_user" and password "secret_sauce"
    And user click on login button
    And add product from product page 
    Then click on basket icon
    Then click on remove button

