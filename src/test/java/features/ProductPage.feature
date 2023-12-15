

Feature: Product discription fuctionality
  Background:
    When user enter username "standard_user" and password "secret_sauce"
    And user click on login button
  @Reg
  Scenario: add and remove the product from discription page 
    When click on product for details 
    And click on add to cart button
    Then click on the remove button
   
   @Reg
   Scenario: validate the hamburger menu of product page 
   When click on hamburger menu 
   And click on all items  and validate the item
   And click on about and validate the it working
   And click on resetapp state and validate it 
   Then click on logout and validate it
 
