package org.parallel.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.parallel.steps.ShoppingCartSteps;

import static org.parallel.stepsdefinition.BaseClass.navigateToLoginPage;

public class ShoppingCartStepDefinition {


    ShoppingCartSteps shoppingCartSteps = new ShoppingCartSteps();
    @When("User click on Shopping Cart button")
    public void userClickOnShoppingCartButton() {
        shoppingCartSteps.clickOnShoppingCartButton();
    }

    @Then("Verify Shopping Cart label")
    public void verifyShoppingCartLabel() throws InterruptedException {
        Thread.sleep(3000);
       shoppingCartSteps.verifyShoppingCartLabel();
    }

    @Then("Verify your shopping cart is empty label")
    public void verifyYourShoppingCartIsEmptyLabel() throws InterruptedException {
        Thread.sleep(3000);
        shoppingCartSteps.verifyYourShoppingCartIsEmptyLabel();
    }

    @Then("Verify product name on shopping cart page")
    public void verifyProductNameOnShoppingCartPage() {
        shoppingCartSteps.verifyProductName();
    }

    @And("User click on Add to Add to Cart button from product listing page")
    public void userClickOnAddToAddToCartButtonFromProductListingPage() {
        shoppingCartSteps.clickOnAddToCartButtonOnProductListingPage();
    }

    @And("User click on add to cart button from product details page")
    public void userClickOnAddToCartButtonFromProductDetailsPage() {
        shoppingCartSteps.clickOnAddToCartButtonOnProductDetailsPage();
    }

    @And("User click on add to cart button on top option")
    public void userClickOnAddToCartButtonOnTopOption() {
        shoppingCartSteps.clickOnShoppingCartOption();
    }

    @Then("Verify product should be added into Shopping cart page")
    public void verifyProductShouldBeAddedIntoShoppingCartPage() {
        shoppingCartSteps.verifyProductNameOnShoppingCartPage();
    }

    @And("User click on update cart details button on product details page")
    public void userClickOnUpdateCartDetailsButtonOnProductDetailsPage() {
        shoppingCartSteps.clickOnUpdateCartDetailsButton();
    }

    @Then("Verify product should be removed from Shopping Cart page")
    public void verifyProductShouldBeRemovedFromShoppingCartPage() {
        shoppingCartSteps.verifyProductShouldBeRemovedFromShoppingCartPage();
    }

    @And("User click on update shopping cart button on shopping cart page")
    public void userClickOnUpdateShoppingCartButtonOnShoppingCartPage() {
        shoppingCartSteps.clickOnUpdateShoppingCartButton();
    }
}
