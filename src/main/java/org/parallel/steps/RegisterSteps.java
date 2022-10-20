package org.parallel.steps;

import org.parallel.pageobjects.PageHome;
import org.parallel.pageobjects.PageRegister;
import org.testng.Assert;

public class RegisterSteps {

    PageHome pageHome = new PageHome();
    PageRegister pageRegister = new PageRegister();

    public void clickOnRegisterButton(){
        pageHome.getBtnRegister().click();
    }

    public void verifyRegisterLabel(){
        Assert.assertEquals(pageRegister.getLblRegister().getText().trim(),"Register");
    }

    public void verifyYourPersonalDetailsLabel(){
        Assert.assertEquals(pageRegister.getLblPersonalDetails().getText().trim(),"Your Personal Details");
    }
}
