package org.parallel.steps;

import org.parallel.pageobjects.PageHome;
import org.parallel.pageobjects.PageLogIn;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import static org.parallel.stepsdefinition.BaseClass.navigateToLoginPage;

public class LoginSteps {

    PageHome pageHome = new PageHome();
    PageLogIn pageLogIn = new PageLogIn();


    public void clickOnLoginButton(){
        pageHome.getBtnLogin().click();
    }

    public void verifyEmailLabel(){
        Assert.assertEquals(pageLogIn.getLblEmail().getText().trim(),"Email:");

    }

    public void verifyPasswordLabel(){
        Assert.assertEquals(pageLogIn.getLblPassword().getText().trim(),"Password:");
    }










}
