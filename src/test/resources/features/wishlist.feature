Feature: Validate WishList Functionality

  Background:
    Given initialise browser

  @Smoke
  Scenario: Validate WishList label
    When User click on WishList button
    Then Verify WishList label

  @Smoke
  Scenario: Validate your wishlist cart is empty label
    When User click on WishList button
    Then Verify your wishlist cart is empty label

  @Smoke
  Scenario: Verify that when user click on add to wishlist button then product should be moved into wishlist page.
    When User click on Apparel option
    And User click on Shoes option
    And User click on Add to wishList button from product listing page
    And User select size for product
    And User collect product name from product details page
    And User click on add to wishlist button from product details page
    And User close the success popup
    And User click on wishlist button on top option
    Then Verify product should be added into wishlist page

  @Smoke
  Scenario: Verify all the product info into wishlist page.
    When User click on Apparel option
    And User click on Shoes option
    And User click on Add to wishList button from product listing page
    And User select size for product
    And User collect product name from product details page
    And User collect SKU name from product details page
    And User collect product size from product details page
    And User collect product color from product details page
    And User click on add to wishlist button from product details page
    And User close the success popup
    And User click on wishlist button on top option
    Then Verify product name on wishlist page
    Then Verify SKU name on wishlist page
    Then Verify product size on wishlist page
    Then Verify product color on wishlist page

  @Smoke
  Scenario: Verify edit functionality into wishlist page.
    When User click on Apparel option
    And User click on Shoes option
    And User click on Add to wishList button from product listing page
    And User select size for product
    And User collect product size from product details page
    And User click on add to wishlist button from product details page
    And User close the success popup
    And User click on wishlist button on top option
    Then Verify product size on wishlist page
    When User click on edit button on wishlist page
    And User change size of product on product details page
    And User click on update button on product details page
    And User close the success popup
    And User click on wishlist button on top option
    Then Verify product size on wishlist page

  @Smoke
  Scenario: Verify remove product functionality into wishlist page.
    When User click on Apparel option
    And User click on Shoes option
    And User click on Add to wishList button from product listing page
    And User select size for product
    And User collect product name from product details page
    And User click on add to wishlist button from product details page
    And User close the success popup
    And User click on wishlist button on top option
    Then Verify product should be added into wishlist page
    When User click on remove product button on wishlist page
    Then Verify product should be removed from wishlist page

  @Smoke
  Scenario: Verify add to cart functionality into wishlist page.
    When User click on Apparel option
    And User click on Shoes option
    And User click on Add to wishList button from product listing page
    And User select size for product
    And User collect product name from product details page
    And User click on add to wishlist button from product details page
    And User close the success popup
    And User click on wishlist button on top option
    Then Verify product should be added into wishlist page
    When User select the product on wishlist page
    And User click on Add to Cart button on wishlist page
    And User click on Shopping Cart button
    Then Verify product name on shopping cart page

  @Smoke
  Scenario: Verify update wishlist functionality into wishlist page.
    When User click on Apparel option
    And User click on Shoes option
    And User click on Add to wishList button from product listing page
    And User select size for product
    And User collect product name from product details page
    And User click on add to wishlist button from product details page
    And User close the success popup
    And User click on wishlist button on top option
    Then Verify product should be added into wishlist page
    When User change the quantity count on wishlist page
    And User click on update wishlist button on wishlist page
    Then Verify quantity count should be updated into wishlist page


















