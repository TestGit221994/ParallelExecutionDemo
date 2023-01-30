package org.parallel.steps;

import org.parallel.pageobjects.*;
import org.testng.Assert;

public class ShoppingCartSteps {

    PageHome pageHome = new PageHome();
    PageShoppingCart pageShoppingCart=new PageShoppingCart();
    PageProductsListing pageProductsListing = new PageProductsListing();
    PageProductDetails pageProductDetails = new PageProductDetails();
    PageWishList pageWishList = new PageWishList();



    public void clickOnShoppingCartButton(){
     pageHome.getBtnShoppingCart().click();
    }

    public void verifyShoppingCartLabel(){
        Assert.assertEquals(pageShoppingCart.getLblShoppingCart().getText().trim(),"Shopping cart");
    }

    public void verifyYourShoppingCartIsEmptyLabel(){
        Assert.assertEquals(pageShoppingCart.getLblShoppingCartEmpty().getText().trim(),"Your Shopping Cart is empty!");
    }

    public void verifyProductName(){
        Assert.assertEquals(pageShoppingCart.getLblProductName().getText().trim(),"adidas Consortium Campus 80s Running Shoes");
    }

    public void clickOnAddToCartButtonOnProductListingPage(){
        pageProductsListing.getAddToCartButton("adidas Consortium Campus 80s Running Shoes").click();
    }
    public void clickOnAddToCartButtonOnProductDetailsPage(){
       pageProductDetails.getBtnAddToCart().click();
    }
    public void clickOnShoppingCartOption(){
       pageHome.getBtnShoppingCart().click();
    }

    public void verifyProductNameOnShoppingCartPage(){
        Assert.assertEquals(pageWishList.getLblProductName().getText().trim(),"adidas Consortium Campus 80s Running Shoes");
    }

    public void clickOnUpdateCartDetailsButton(){
        pageProductDetails.getBtnUpdate().click();
    }

    public void verifyProductShouldBeRemovedFromShoppingCartPage(){
        Assert.assertTrue(pageShoppingCart.getLblShoppingCartIsEmpty().isDisplayed());
    }

    public void clickOnUpdateShoppingCartButton(){
        pageShoppingCart.getBtnUpdateShoppingCart().click();
    }














}
