package org.parallel.steps;

import org.apache.log4j.Logger;
import org.parallel.pageobjects.PageHome;
import org.parallel.pageobjects.PageLogIn;
import org.parallel.pageobjects.PageRegister;
import org.parallel.utils.misc.ElementUtils;
import org.parallel.utils.misc.LoggerUtils;
import org.testng.Assert;
import org.testng.annotations.Parameters;

import static org.parallel.stepsdefinition.BaseClass.getWebDriver;
import static org.parallel.stepsdefinition.BaseClass.navigateToLoginPage;

public class LoginSteps {

    PageHome pageHome = new PageHome();
    PageLogIn pageLogIn = new PageLogIn();
    PageRegister pageRegister = new PageRegister();

    String username="test@mail.com";
    String password="test12345";


    Logger logger = LoggerUtils.getLogger();


    public void clickOnLoginButton(String what){
        ElementUtils.click(getWebDriver(),pageHome.getBtnLogin(),what);
    }


    public void verifyEmailLabel(String what){
        Assert.assertEquals(pageLogIn.getLblEmail().getText().trim(),"Email:",what);
        logger.info(" verify lblEmail : "+" Expected : " +"Email:" +" Actual : "+pageLogIn.getLblEmail().getText().trim());
    }

    public void verifyPasswordLabel(String what){
        Assert.assertEquals(pageLogIn.getLblPassword().getText().trim(),"Password:",what);
        logger.info(" verify lblPassword : "+" Expected : " +"Password:" +" Actual : "+pageLogIn.getLblPassword().getText().trim());
    }

    public void clickOnLoginButtonOnLoginPage(){
        pageLogIn.getBtnLogIn().click();
    }

    public void clickOnForgotPasswordButton(){
       pageLogIn.getBtnForgotButton().click();
    }

    public void clickOnNewRegisterButtonOnLoginPage(){
      pageLogIn.getBtnRegister().click();
    }

    public void enterUsername(){
      pageLogIn.getTxtUsername().sendKeys(username);
    }

    public void enterPassword(){
       pageLogIn.getTxtPassword().sendKeys(password);
    }


    public void enterInvalidUsername(){
       pageLogIn.getTxtUsername().sendKeys(username+"ss");
    }

    public void enterInvalidPassword(){
     pageLogIn.getTxtPassword().sendKeys(password+"sd");
    }


    public void verifyErrorMessageWhenUserLoginWithoutUsername(){
        Assert.assertEquals(pageLogIn.getMsgErrorOfWithoutUsername().getText().trim(),"Please enter your email");
    }

    public void verifyErrorMessageWhenUserLoginWithoutPassword(){
        Assert.assertEquals(pageLogIn.getMsgOfLoginValidation().getText().trim(),"No customer account found");
    }

    public void verifyErrorMessageWhenUserLoginWithInvalidUsername(){
        Assert.assertEquals(pageLogIn.getMsgOfLoginValidation().getText().trim(),"No customer account found");
    }

    public void verifyErrorMessageWhenUserLoginWithInvalidPassword(){
        Assert.assertEquals(pageLogIn.getMsgOfLoginValidation().getText().trim(),"No customer account found");
    }

    public void verifyUserShouldBeNavigateToForgotPasswordPage(){
        Assert.assertEquals(pageLogIn.getLblPasswordRecovery().getText().trim(),"Password recovery");
    }

    public void verifyUserShouldBeNavigateToNewRegisterPage(){
        Assert.assertEquals(pageRegister.getLblRegister().getText().trim(),"Register");
    }

    public void verifyLoginInformationOnLoginPage(){
        Assert.assertEquals(pageLogIn.getMsgOfLoginInformation().getText().trim(),"Put your login / registration information here. You can edit this in the admin site.");
    }

    public void verifyPageTitleOnLoginPage(){
        Assert.assertEquals(pageLogIn.getPageTitle().getText().trim(),"Welcome, Please Sign In!");
    }

    public void verifyUserShouldBeLoginSuccessfully(){
        Assert.assertTrue(pageLogIn.getBtnLogout().isDisplayed());
    }








































}
