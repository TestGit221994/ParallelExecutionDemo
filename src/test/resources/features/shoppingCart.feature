Feature: Validate Shopping Cart Functionality

  Background:
    Given initialise browser

  @Smokeg
  Scenario: Validate Shopping Cart label
    When User click on Shopping Cart button
    Then Verify Shopping Cart label

  @Smokeg
  Scenario: Validate your shopping cart is empty label
    When User click on Shopping Cart button
    Then Verify your shopping cart is empty label