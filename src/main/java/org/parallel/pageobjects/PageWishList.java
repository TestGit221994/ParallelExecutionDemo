package org.parallel.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.parallel.stepsdefinition.BaseClass.getWebDriver;

public class PageWishList {

    public PageWishList() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Wishlist')]")
    private WebElement lblWishList;
    public WebElement getLblWishList(){
        return lblWishList;
    }

    @FindBy(xpath = "//div[contains(text(),'The wishlist is empty!')]")
    private WebElement lblWishListIsEmpty;
    public WebElement getLblWishListIsEmpty(){
        return lblWishListIsEmpty;
    }

}
