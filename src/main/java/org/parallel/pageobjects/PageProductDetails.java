package org.parallel.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.parallel.stepsdefinition.BaseClass.getWebDriver;

public class PageProductDetails {

    Actions actions;
    public PageProductDetails() {
        PageFactory.initElements(getWebDriver(), this);
        actions=new Actions(getWebDriver());
    }



    @FindBy(xpath = "//div[@class='add-to-wishlist']/descendant::button[contains(text(),'Add to wishlist')][1]")
    private WebElement btnAddToWishlist;
    public WebElement getBtnAddToWishlist(){
        return btnAddToWishlist;
    }

    @FindBy(xpath = "//div[@class='add-to-cart']/descendant::button[1]")
    private WebElement btnAddToCart;
    public WebElement getBtnAddToCart(){
        return btnAddToCart;
    }



    @FindBy(xpath = "//div[@class='add-to-wishlist']/descendant::button[contains(text(),'Update')][1]")
    private WebElement btnUpdateToWishlist;
    public WebElement getBtnUpdateToWishlist(){
        return btnUpdateToWishlist;
    }

    @FindBy(xpath = "//button[contains(text(),'Update')][1]")
    private WebElement btnUpdate;
    public WebElement getBtnUpdate(){
        return btnUpdate;
    }

    @FindBy(xpath = "//div[@class='attributes']/descendant::select[1]")
    private WebElement ddSize;
    public WebElement getDdSize(){
        return ddSize;
    }


    @FindBy(xpath = "//span[contains(text(),'SKU:')]/following-sibling::span[1]")
    private WebElement lblSKU;
    public WebElement getLblSKU(){
        return lblSKU;
    }

    @FindBy(xpath = "//div[@class='product-name']/descendant::h1[1]")
    private WebElement lblProductName;
    public WebElement getLblProductName(){
        return lblProductName;
    }



    @FindBy(xpath = "//span[@title='Red']")
    private WebElement color;
    public WebElement getColor(){
        return color;
    }


    @FindBy(xpath = "//div[@class='product-price']/descendant::span[1]")
    private WebElement productPrice;
    public WebElement getProductPrice(){
        return productPrice;
    }

    @FindBy(xpath = "//div[@class='add-to-cart']/descendant::input[1]")
    private WebElement productCount;
    public WebElement getProductCount(){
        return productCount;
    }

    @FindBy(xpath = "//span[@title='Close']")
    private WebElement btnCloseSuccessPopup;
    public WebElement getBtnCloseSuccessPopup(){
        return btnCloseSuccessPopup;
    }











































}
