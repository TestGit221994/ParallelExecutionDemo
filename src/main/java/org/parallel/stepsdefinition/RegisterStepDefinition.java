package org.parallel.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.*;
import org.parallel.steps.RegisterSteps;
import org.testng.Assert;

import static org.parallel.stepsdefinition.BaseClass.navigateToLoginPage;

public class RegisterStepDefinition {

    RegisterSteps registerSteps=new RegisterSteps();

    String username = "";
    String password = "";

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



    @And("User enter last name")
    public void userEnterLastName() {
     registerSteps.enterLastName();
    }

    @And("User select birthdate")
    public void userSelectBirthdate() throws InterruptedException {


     registerSteps.selectDayOfDOB();
     registerSteps.selectMonthOfDOB();
     registerSteps.selectYearOfDOB();

    }

    @And("User enter email")
    public void userEnterEmail() {
    registerSteps.enterMail();
    }

    @And("User company name")
    public void userCompanyName() {
     registerSteps.enterCompanyName();
    }

    @And("User enter password")
    public void userEnterPassword() {
      registerSteps.enterPassword();
    }

    @And("User enter confirm password")
    public void userEnterConfirmPassword() {
       registerSteps.enterConfirmPassword();
    }

    @And("User click on submit button")
    public void userClickOnSubmitButton() {
       registerSteps.clickOnSubmitButton();
    }

    @Then("Verify error message when user trying to register without enter first name field")
    public void verifyErrorMessageWhenUserTryingToRegisterWithoutEnterFirstNameField() {

       registerSteps.VerifyErrorMessageWhenUserTryingToRegisterWithoutEnterFirstNameField();
    }

    @And("User select gender")
    public void userSelectGender() {
      registerSteps.selectGender();
    }

    @And("User enter first name")
    public void userEnterFirstName() {
        registerSteps.enterFirstName();
    }

    @Then("Verify error message when user trying to register without enter last name field")
    public void verifyErrorMessageWhenUserTryingToRegisterWithoutEnterLastNameField() {
        registerSteps.VerifyErrorMessageWhenUserTryingToRegisterWithoutEnterLastNameField();
    }

    @Then("Verify error message when user trying to register without enter email field")
    public void verifyErrorMessageWhenUserTryingToRegisterWithoutEnterEmailField() {
        registerSteps.VerifyErrorMessageWhenUserTryingToRegisterWithoutEnterEmailField();
    }

    @Then("Verify error message when user trying to register without enter password field")
    public void verifyErrorMessageWhenUserTryingToRegisterWithoutEnterPasswordField() {
        registerSteps.VerifyErrorMessageWhenUserTryingToRegisterWithoutEnterPasswordField();
    }

    @And("User enter invalid confirm password")
    public void userEnterInvalidConfirmPassword() {
        registerSteps.enterInvalidConfirmPassword();
    }

    @Then("Verify error message when password and confirm password not matched.")
    public void verifyErrorMessageWhenPasswordAndConfirmPasswordNotMatched() {
        registerSteps.VerifyErrorMessageWhenPasswordAndConfirmPasswordNotMatched();
    }

    @And("User enter invalid password")
    public void userEnterInvalidPassword() {
       registerSteps.enterIncorrectPassword();

    }

    @Then("Verify error message when password is incorrect.")
    public void verifyErrorMessageWhenPasswordIsIncorrect() {
        registerSteps.VerifyErrorMessageWhenUserTryingToRegisterWithIncorrectPassword();
    }

    @Then("Verify User should get success message of registration")
    public void verifyUserShouldGetSuccessMessageOfRegistration() {
       registerSteps.verifySuccessMessageOfRegistration();
    }
}
