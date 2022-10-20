package org.parallel.stepsdefinition;

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
}
