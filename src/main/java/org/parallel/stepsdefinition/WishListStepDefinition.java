package org.parallel.stepsdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.parallel.steps.WishListSteps;

import static org.parallel.stepsdefinition.BaseClass.navigateToLoginPage;

public class WishListStepDefinition {
    


    WishListSteps wishListSteps = new WishListSteps();
    @When("User click on WishList button")
    public void userClickOnWishListButton() {
        wishListSteps.clickOnWishListButton();
    }

    @Then("Verify WishList label")
    public void verifyWishListLabel() throws InterruptedException {
        Thread.sleep(3000);
        wishListSteps.verifyWishListLabel();
    }

    @Then("Verify your wishlist cart is empty label")
    public void verifyYourWishlistCartIsEmptyLabel() throws InterruptedException {
        Thread.sleep(3000);
        wishListSteps.verifyYourWishListIsEmptyLabel();
    }
}
