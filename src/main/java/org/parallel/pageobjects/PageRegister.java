package org.parallel.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.parallel.stepsdefinition.BaseClass.getWebDriver;

public class PageRegister {

    public PageRegister() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    private WebElement lblRegister;
    public WebElement getLblRegister(){
        return lblRegister;
    }

    @FindBy(xpath = "//strong[contains(text(),'Your Personal Details')]")
    private WebElement lblPersonalDetails;
    public WebElement getLblPersonalDetails(){
        return lblPersonalDetails;
    }

}
