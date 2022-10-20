package org.parallel.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.parallel.stepsdefinition.BaseClass.getWebDriver;

public class PageLogIn {


    public PageLogIn() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(xpath = "//label[contains(text(),'Email:')]")
    private WebElement lblEmail;
    public WebElement getLblEmail(){
        return lblEmail;
    }

    @FindBy(xpath = "//label[contains(text(),'Password:')]")
    private WebElement lblPassword;
    public WebElement getLblPassword(){
        return lblPassword;
    }













}
