Feature: Validate Shopping Cart Functionality

  Background:
    Given initialise browser

  @Smoke
  Scenario: Validate Shopping Cart label
    When User click on Shopping Cart button
    Then Verify Shopping Cart label

  @Smoke
  Scenario: Validate your shopping cart is empty label
    When User click on Shopping Cart button
    Then Verify your shopping cart is empty label

  @Smoke
  Scenario: Verify that when user click on add to cart button then product should be moved into add to cart page.
    When User click on Apparel option
    And User click on Shoes option
    And User click on Add to Add to Cart button from product listing page
    And User select size for product
    And User collect product name from product details page
    And User click on add to cart button from product details page
    And User close the success popup
    And User click on add to cart button on top option
    Then Verify product should be added into Shopping cart page

  @Smoke
  Scenario: Verify all the product info into add to cart page.
    When User click on Apparel option
    And User click on Shoes option
    And User click on Add to Add to Cart button from product listing page
    And User select size for product
    And User collect product name from product details page
    And User collect SKU name from product details page
    And User collect product size from product details page
    And User collect product color from product details page
    And User click on add to cart button from product details page
    And User close the success popup
    And User click on add to cart button on top option
    Then Verify product name on wishlist page
    Then Verify SKU name on wishlist page
    Then Verify product size on wishlist page
    Then Verify product color on wishlist page

  @Smoke
  Scenario: Verify edit functionality into cart page.
    When User click on Apparel option
    And User click on Shoes option
    And User click on Add to Add to Cart button from product listing page
    And User select size for product
    And User collect product size from product details page
    And User click on add to cart button from product details page
    And User close the success popup
    And User click on add to cart button on top option
    Then Verify product size on wishlist page
    When User click on edit button on wishlist page
    And User change size of product on product details page
    And User click on update cart details button on product details page
    And User close the success popup
    And User click on add to cart button on top option
    Then Verify product size on wishlist page

  @Smoke
  Scenario: Verify remove product functionality into cart page.
    When User click on Apparel option
    And User click on Shoes option
    And User click on Add to Add to Cart button from product listing page
    And User select size for product
    And User collect product name from product details page
    And User click on add to cart button from product details page
    And User close the success popup
    And User click on add to cart button on top option
    Then Verify product should be added into wishlist page
    When User click on remove product button on wishlist page
    Then Verify product should be removed from Shopping Cart page

  @Smoke
  Scenario: Verify update functionality into cart page.
    When User click on Apparel option
    And User click on Shoes option
    And User click on Add to Add to Cart button from product listing page
    And User select size for product
    And User collect product name from product details page
    And User click on add to cart button from product details page
    And User close the success popup
    And User click on add to cart button on top option
    Then Verify product should be added into wishlist page
    When User change the quantity count on wishlist page
    And User click on update shopping cart button on shopping cart page
    Then Verify quantity count should be updated into wishlist page
