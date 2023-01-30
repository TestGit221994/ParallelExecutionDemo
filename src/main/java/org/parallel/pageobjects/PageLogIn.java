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

    @FindBy(xpath = "//input[@name='Email']")
    private WebElement txtEmail;
    public WebElement getTxtEmail(){
        return txtEmail;
    }

    @FindBy(xpath = "//input[@name='Password']")
    private WebElement txtPassword;
    public WebElement getTxtPassword(){
        return txtPassword;
    }

    @FindBy(xpath = "//input[@name='Email']")
    private WebElement txtUsername;
    public WebElement getTxtUsername(){
        return txtUsername;
    }

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    private WebElement btnLogIn;
    public WebElement getBtnLogIn(){
        return btnLogIn;
    }

    @FindBy(xpath = "//label[contains(text(),'Email:')]")
    private WebElement lblEmail;
    public WebElement getLblEmail(){
        return lblEmail;
    }

    @FindBy(xpath = "//span[@id='Email-error']")
    private WebElement msgErrorOfWithoutUsername;
    public WebElement getMsgErrorOfWithoutUsername(){
        return msgErrorOfWithoutUsername;
    }

    @FindBy(xpath = "//label[contains(text(),'Password:')]")
    private WebElement lblPassword;
    public WebElement getLblPassword(){
        return lblPassword;
    }

    @FindBy(xpath = "//strong[contains(text(),'Returning Customer')]/ancestor::div[1]/preceding-sibling::div[1]/descendant::li[1]")
    private WebElement msgOfLoginValidation;
    public WebElement getMsgOfLoginValidation(){
        return msgOfLoginValidation;
    }

    @FindBy(xpath = "//a[contains(text(),'Forgot password?')]")
    private WebElement btnForgotButton;
    public WebElement getBtnForgotButton(){
        return btnForgotButton;
    }

    @FindBy(xpath = "//button[contains(text(),'Register')]")
    private WebElement btnRegister;
    public WebElement getBtnRegister(){
        return btnRegister;
    }

    @FindBy(xpath = "//h1[contains(text(),'Password recovery')]")
    private WebElement lblPasswordRecovery;
    public WebElement getLblPasswordRecovery(){
        return lblPasswordRecovery;
    }

    @FindBy(xpath = "//h2[contains(text(),'About login / registration')]/ancestor::div[1]/following-sibling::div[1]/p[1]")
    private WebElement msgOfLoginInformation;
    public WebElement getMsgOfLoginInformation(){
        return msgOfLoginInformation;
    }

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    private WebElement pageTitle;
    public WebElement getPageTitle(){
        return pageTitle;
    }


    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    private WebElement btnLogout;
    public WebElement getBtnLogout(){
        return btnLogout;
    }


















}
