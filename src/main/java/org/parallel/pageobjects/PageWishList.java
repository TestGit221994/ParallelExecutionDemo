package org.parallel.pageobjects;

import org.openqa.selenium.By;
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

    @FindBy(xpath = "//td[@class='product']/descendant::a[1]")
    private WebElement lblProductName;
    public WebElement getLblProductName(){
        return lblProductName;
    }

    public WebElement getChkAddToCart(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='add-to-cart']/input[1]"));
    }

    public WebElement getSKU(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='sku']/span[1]"));
    }

    public WebElement getImgProduct(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='product-picture']/descendant::img[1]"));
    }

    public WebElement getProductDetails(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='product']/descendant::div[1]"));
    }


    public WebElement getBtnProductEdit(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='product']/descendant::div[2]/a[1]"));
    }

    public WebElement getProductPrice(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='unit-price']/descendant::span[1]"));
    }

    public WebElement getProductQuantity(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='quantity']/descendant::input[1]"));
    }

    public WebElement getProductTotal(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='subtotal']/descendant::span[1]"));
    }

    public WebElement getBtnProductRemove(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='remove-from-cart']/descendant::button[1]"));
    }


    @FindBy(xpath = "//button[contains(text(),'Update wishlist')]")
    private WebElement btnUpdateWishlist;
    public WebElement getBtnUpdateWishlist(){
        return btnUpdateWishlist;
    }

    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    private WebElement btnAddToCart;
    public WebElement getBtnAddToCart(){
        return btnAddToCart;
    }


    @FindBy(xpath = "//div[contains(text(),'The wishlist is empty!')]")
    private WebElement lblWishlistIsEmpty;
    public WebElement getLblWishlistIsEmpty(){
        return lblWishlistIsEmpty;
    }



}
