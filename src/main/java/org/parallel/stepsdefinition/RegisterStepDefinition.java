package org.parallel.stepsdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.parallel.steps.RegisterSteps;

import static org.parallel.stepsdefinition.BaseClass.navigateToLoginPage;

public class RegisterStepDefinition {

    RegisterSteps registerSteps=new RegisterSteps();

    @When("User click on register button")
    public void userClickOnRegisterButton() {
         registerSteps.clickOnRegisterButton();
    }

    @Then("Verify register label")
    public void verifyRegisterLabel() throws InterruptedException {
        Thread.sleep(3000);
        registerSteps.verifyRegisterLabel();
    }

    @Then("Verify your personal details label")
    public void verifyYourPersonalDetailsLabel() throws InterruptedException {
        Thread.sleep(3000);
        registerSteps.verifyYourPersonalDetailsLabel();
    }
}
