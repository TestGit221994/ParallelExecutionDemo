package org.parallel.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.parallel.stepsdefinition.BaseClass.getWebDriver;

public class PageHome {

    public PageHome() {
        PageFactory.initElements(getWebDriver(), this);
    }



    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    private WebElement btnLogin;
    public WebElement getBtnLogin(){
        return btnLogin;
    }

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    private WebElement btnRegister;
    public WebElement getBtnRegister(){
        return btnRegister;
    }

    @FindBy(xpath = "//span[contains(text(),'Wishlist')]")
    private WebElement btnWishList;
    public WebElement getBtnWishList(){
        return btnWishList;
    }

    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    private WebElement btnShoppingCart;
    public WebElement getBtnShoppingCart(){
        return btnShoppingCart;
    }


    //======================================================================================================


    @FindBy(xpath = "//div[@class='header-menu']/descendant::a[contains(text(),'Apparel ')][1]")
    private WebElement lblApparel;
    public WebElement getLblApparel(){
        return lblApparel;
    }


    @FindBy(xpath = "//div[@class='sub-category-item']/descendant::a[contains(text(),' Shoes ')][1]")
    private WebElement lblShoes;
    public WebElement getLblShoes(){
        return lblShoes;
    }













}
