package org.parallel.steps;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.parallel.pageobjects.PageProductDetails;

public class ProductDetailsSteps {


    public static String productName;
    public static String SKUName;
    public static String productSize;
    public static String productColor;

    PageProductDetails pageProductDetails = new PageProductDetails();

    public void clickOnAddToWishlistButton(){
        pageProductDetails.getBtnAddToWishlist().click();
    }

    public void selectSize(){

        Select select = new Select(pageProductDetails.getDdSize());
        select.selectByValue("22");
        productSize="9";
    }

    public void changeSize(){

        Select select = new Select(pageProductDetails.getDdSize());
        select.selectByValue("23");
        productSize="10";
    }

    public void storeProductName(){
        productName=pageProductDetails.getLblProductName().getText().trim();
    }


    public void storeProductSKUName(){
        SKUName=pageProductDetails.getLblSKU().getText().trim();
    }

    public void storeProductColor(){
        productColor=pageProductDetails.getColor().getText().trim();
    }


    public void clickOnUpdateWishListButton(){
        pageProductDetails.getBtnUpdateToWishlist().click();
    }



    public void clickOnCloseButtonOfSuccessPopup(){
       pageProductDetails.getBtnCloseSuccessPopup().click();
    }


}
