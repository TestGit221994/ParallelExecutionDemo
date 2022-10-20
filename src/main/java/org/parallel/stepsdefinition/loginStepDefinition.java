package org.parallel.stepsdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.parallel.steps.LoginSteps;
import org.testng.annotations.Parameters;

import static org.parallel.stepsdefinition.BaseClass.navigateToLoginPage;

public class loginStepDefinition {

     LoginSteps loginSteps = new LoginSteps();


    @When("User click on login button")
    public void userClickOnLoginButton() {
        loginSteps.clickOnLoginButton();
    }

    @Then("Verify email label")
    public void verifyEmailLabel() throws InterruptedException {
        Thread.sleep(3000);
        loginSteps.verifyEmailLabel();
    }

    @Then("Verify password label")
    public void verifyPasswordLabel() throws InterruptedException {
        Thread.sleep(3000);
        loginSteps.verifyPasswordLabel();
    }
}
