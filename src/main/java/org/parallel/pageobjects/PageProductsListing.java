package org.parallel.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.parallel.stepsdefinition.BaseClass.getWebDriver;

public class PageProductsListing {


    public PageProductsListing() {
        PageFactory.initElements(getWebDriver(), this);
    }


    public WebElement getAddToWishlistButton(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::div[@class='details']/descendant::button[@title='Add to wishlist']"));
    }

    public WebElement getAddToCartButton(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::div[@class='details']/descendant::button[1]"));
    }







}
