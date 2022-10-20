package org.parallel.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.parallel.stepsdefinition.BaseClass.getWebDriver;

public class PageShoppingCart {

    public PageShoppingCart() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    private WebElement lblShoppingCart;
    public WebElement getLblShoppingCart(){
        return lblShoppingCart;
    }

    @FindBy(xpath = "//div[contains(text(),'Your Shopping Cart is empty!')]")
    private WebElement lblShoppingCartEmpty;
    public WebElement getLblShoppingCartEmpty(){
        return lblShoppingCartEmpty;
    }

}
