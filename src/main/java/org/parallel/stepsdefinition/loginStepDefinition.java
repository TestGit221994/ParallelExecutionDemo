package org.parallel.stepsdefinition;

import io.cucumber.java.en.And;
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
        loginSteps.clickOnLoginButton("btnLogin");
    }

    @Then("Verify email label")
    public void verifyEmailLabel() {
        loginSteps.verifyEmailLabel("lblEmail");
    }

    @Then("Verify password label")
    public void verifyPasswordLabel(){
        loginSteps.verifyPasswordLabel("lblPassword");
    }

    @And("User click on login button on login page")
    public void userClickOnLoginButtonOnLoginPage() {
        loginSteps.clickOnLoginButtonOnLoginPage();
    }


    @Then("Validate user should get error message when user login without username")
    public void validateUserShouldGetErrorMessageWhenUserLoginWithoutUsername() {
        loginSteps.verifyErrorMessageWhenUserLoginWithoutUsername();
    }

    @And("User enter username")
    public void userEnterUsername() {
        loginSteps.enterUsername();
    }

    @And("User enter invalid username")
    public void userEnterInvalidUsername() {
        loginSteps.enterInvalidUsername();
    }

    @Then("Validate user should get error message when user enter invalid username")
    public void validateUserShouldGetErrorMessageWhenUserEnterInvalidUsername() {
        loginSteps.verifyErrorMessageWhenUserLoginWithInvalidUsername();
    }

    @Then("Validate user should get error message when user enter invalid password")
    public void validateUserShouldGetErrorMessageWhenUserEnterInvalidPassword() {
        loginSteps.verifyErrorMessageWhenUserLoginWithInvalidPassword();
    }

    @And("User click on forgot password button")
    public void userClickOnForgotPasswordButton() {
        loginSteps.clickOnForgotPasswordButton();
    }

    @Then("Validate user should be navigate to forgot password page")
    public void validateUserShouldBeNavigateToForgotPasswordPage() {
        loginSteps.verifyUserShouldBeNavigateToForgotPasswordPage();
    }

    @And("User click on register button on login page")
    public void userClickOnRegisterButtonOnLoginPage() {
        loginSteps.clickOnNewRegisterButtonOnLoginPage();
    }

    @Then("Validate user should be navigate to register page")
    public void validateUserShouldBeNavigateToRegisterPage() {
        loginSteps.verifyUserShouldBeNavigateToNewRegisterPage();
    }

    @Then("Validate login information on login page")
    public void validateLoginInformationOnLoginPage() {
        loginSteps.verifyLoginInformationOnLoginPage();
    }

    @Then("Validate page title on login page")
    public void validatePageTitleOnLoginPage() {
        loginSteps.verifyPageTitleOnLoginPage();
    }

    @Then("Verify user should be login successfully")
    public void verifyUserShouldBeLoginSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        loginSteps.verifyUserShouldBeLoginSuccessfully();
    }

    @Then("Validate user should get error message when user login without password")
    public void validateUserShouldGetErrorMessageWhenUserLoginWithoutPassword() {
        loginSteps.verifyErrorMessageWhenUserLoginWithoutPassword();
    }

    @And("User enter invalid password on login page")
    public void userEnterInvalidPasswordOnLoginPage() {
        loginSteps.enterInvalidPassword();
    }

    @And("User enter password on login page")
    public void userEnterPasswordOnLoginPage() {
        loginSteps.enterPassword();
    }


}
