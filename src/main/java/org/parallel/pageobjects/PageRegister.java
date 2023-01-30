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

    @FindBy(xpath = "//input[@id='gender-male']")
    private WebElement btnMale;
    public WebElement getBtnMale(){
        return btnMale;
    }

    @FindBy(xpath = "//input[@id='gender-female']")
    private WebElement btnFemale;
    public WebElement getBtnFemale(){
        return btnFemale;
    }

    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement txtFirstName;
    public WebElement getTxtFirstName(){
        return txtFirstName;
    }

    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement txtLastName;
    public WebElement getTxtLastName(){
        return txtLastName;
    }

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    private WebElement ddDay;
    public WebElement getDdDay(){
        return ddDay;
    }

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    private WebElement ddMonth;
    public WebElement getDdMonth(){
        return ddMonth;
    }

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    private WebElement ddYear;
    public WebElement getDdYear(){
        return ddYear;
    }

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement txtEmail;
    public WebElement getTxtEmail(){
        return txtEmail;
    }

    @FindBy(xpath = "//input[@id='Company']")
    private WebElement txtCompany;
    public WebElement getTxtCompany(){
        return txtCompany;
    }

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement txtPassword;
    public WebElement getTxtPassword(){
        return txtPassword;
    }

    @FindBy(xpath = "//input[@name='ConfirmPassword']")
    private WebElement txtConfirmPassword;
    public WebElement getTxtConfirmPassword(){
        return txtConfirmPassword;
    }

    @FindBy(xpath = "//button[@name='register-button']")
    private WebElement btnRegister;
    public WebElement getBtnRegister(){
        return btnRegister;
    }

    @FindBy(xpath = "//span[@id='FirstName-error']")
    private WebElement msgOfErrorOfFirstNameIsRequired;
    public WebElement getMsgOfErrorOfFirstNameIsRequired(){
        return msgOfErrorOfFirstNameIsRequired;
    }

    @FindBy(xpath = "//span[@id='LastName-error']")
    private WebElement msgOfErrorOfLastNameIsRequired;
    public WebElement getMsgOfErrorOfLastNameIsRequired(){
        return msgOfErrorOfLastNameIsRequired;
    }

    @FindBy(xpath = "//span[@id='Email-error']")
    private WebElement msgOfErrorOfEmailIsRequired;
    public WebElement getMsgOfErrorOfEmailIsRequired(){
        return msgOfErrorOfEmailIsRequired;
    }


    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    private WebElement msgOfErrorOfPasswordIsRequired;
    public WebElement getMsgOfErrorOfPasswordIsRequired(){
        return msgOfErrorOfPasswordIsRequired;
    }


    @FindBy(xpath = "//span[@id='Password-error']/descendant::li[1]")
    private WebElement msgOfErrorOfPasswordValidation;
    public WebElement getMsgOfErrorOfPasswordValidation(){
        return msgOfErrorOfPasswordValidation;
    }

    @FindBy(xpath = "//div[@class='result']")
    private WebElement msgOfSuccessOfRegistration;
    public WebElement getMsgOfSuccessOfRegistration(){
        return msgOfSuccessOfRegistration;
    }




}
