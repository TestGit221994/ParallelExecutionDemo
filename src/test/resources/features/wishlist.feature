Feature: Validate WishList Functionality

  Background:
    Given initialise browser

  @Smokeg
  Scenario: Validate WishList label
    When User click on WishList button
    Then Verify WishList label

  @Smokeg
  Scenario: Validate your wishlist cart is empty label
    When User click on WishList button
    Then Verify your wishlist cart is empty label