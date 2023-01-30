package org.parallel.steps;

import io.qameta.allure.*;
import org.openqa.selenium.support.ui.Select;
import org.parallel.pageobjects.PageHome;
import org.parallel.pageobjects.PageRegister;
import org.parallel.utils.misc.RandomUtils;
import org.testng.Assert;

import java.util.Random;

public class RegisterSteps {

    PageHome pageHome = new PageHome();
    PageRegister pageRegister = new PageRegister();
    String password = "";

    public void clickOnRegisterButton(){
        pageHome.getBtnRegister().click();
    }

    public void verifyRegisterLabel(){
        Assert.assertEquals(pageRegister.getLblRegister().getText().trim(),"Register");
    }

    public void verifyYourPersonalDetailsLabel(){
        Assert.assertEquals(pageRegister.getLblPersonalDetails().getText().trim(),"Your Personal Details");
    }

    public void selectGender(){
        pageRegister.getBtnMale().click();
    }

    public void enterFirstName(){

        pageRegister.getTxtFirstName().sendKeys(RandomUtils.generateFirstName());
    }

    public void enterLastName(){
        pageRegister.getTxtLastName().sendKeys(RandomUtils.generateLastName());
    }

    public void enterInvalidConfirmPassword(){
        pageRegister.getTxtConfirmPassword().sendKeys(RandomUtils.generatePhoneNumber());
    }

    public void selectDayOfDOB(){
        pageRegister.getDdDay().click();
        Select select = new Select(pageRegister.getDdDay());
        select.selectByValue("22");
    }

    public void selectMonthOfDOB(){
        pageRegister.getDdMonth().click();
        Select select = new Select(pageRegister.getDdMonth());
        select.selectByValue("2");
    }

    public void selectYearOfDOB(){
        pageRegister.getDdYear().click();
        Select select = new Select(pageRegister.getDdYear());
        select.selectByValue("1994");
    }

    public void enterMail(){
        pageRegister.getTxtEmail().sendKeys(RandomUtils.generateEmailId());
    }

    public void enterCompanyName(){
        pageRegister.getTxtCompany().sendKeys(RandomUtils.generateCompanyName());
    }

    public void enterPassword(){
        password = RandomUtils.generatePhoneNumber();
        pageRegister.getTxtPassword().sendKeys(password);
    }

    public void enterConfirmPassword(){
        pageRegister.getTxtConfirmPassword().sendKeys(password);
    }

    public void clickOnSubmitButton(){
        pageRegister.getBtnRegister().click();
    }


    public void VerifyErrorMessageWhenUserTryingToRegisterWithoutEnterFirstNameField(){
        Assert.assertEquals(pageRegister.getMsgOfErrorOfFirstNameIsRequired().getText().trim(),"First name is required.");
    }

    public void VerifyErrorMessageWhenUserTryingToRegisterWithoutEnterLastNameField(){
        Assert.assertEquals(pageRegister.getMsgOfErrorOfLastNameIsRequired().getText().trim(),"Last name is required.");
    }

    public void VerifyErrorMessageWhenUserTryingToRegisterWithoutEnterEmailField(){
        Assert.assertEquals(pageRegister.getMsgOfErrorOfEmailIsRequired().getText().trim(),"Email is required.");
    }

    public void VerifyErrorMessageWhenUserTryingToRegisterWithoutEnterPasswordField(){
        Assert.assertEquals(pageRegister.getMsgOfErrorOfPasswordIsRequired().getText().trim(),"Password is required.");
    }

    public void VerifyErrorMessageWhenUserTryingToRegisterWithIncorrectPassword(){
        Assert.assertEquals(pageRegister.getMsgOfErrorOfPasswordValidation().getText().trim(),"must have at least 6 characters");
    }

    public void VerifyErrorMessageWhenPasswordAndConfirmPasswordNotMatched(){
        Assert.assertEquals(pageRegister.getMsgOfErrorOfPasswordIsRequired().getText().trim(),"The password and confirmation password do not match.");
    }

    public void enterIncorrectPassword(){
        pageRegister.getTxtPassword().sendKeys("123");
    }

    public void verifySuccessMessageOfRegistration(){
        Assert.assertEquals(pageRegister.getMsgOfSuccessOfRegistration().getText().trim(),"Your registration completed");
    }










}
