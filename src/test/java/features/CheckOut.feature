
Feature: checkout functionality of swag lab

Background:
    When user enter username "standard_user" and password "secret_sauce"
    And user click on login button


@Reg
  Scenario Outline: validate the checkout 
    Then click on basket icon 
    When click on checkout button
    And  enter the first name "<fname>" and last name "<lname>" and zip code "<zcode>"  
    Then click on continue
    
    Examples:
    
    |fname|lname|zcode|
    |ranjeet|bharti| |
    |ranjeet| |110022|
    | |bharti|110022|