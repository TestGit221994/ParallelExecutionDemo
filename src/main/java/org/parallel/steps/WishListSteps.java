package org.parallel.steps;

import org.parallel.pageobjects.PageHome;
import org.parallel.pageobjects.PageShoppingCart;
import org.parallel.pageobjects.PageWishList;
import org.testng.Assert;

public class WishListSteps {

    PageHome pageHome = new PageHome();
    PageWishList pageWishList = new PageWishList();

    public static String productQuantity="";

    public void clickOnWishListButton(){
         pageHome.getBtnWishList().click();
    }

    public void verifyWishListLabel(){
        Assert.assertEquals(pageWishList.getLblWishList().getText().trim(),"Wishlist");
    }

    /*
    public void verifyYourWishListIsEmptyLabel(){
        Assert.assertEquals(pageWishList.getLblWishListIsEmpty().getText().trim(),"The wishlist is empty!");
    }
     */

    public void verifyProductNameOnWishListPage(){
          Assert.assertEquals(pageWishList.getLblProductName().getText().trim(),"adidas Consortium Campus 80s Running Shoes");
    }

    public void verifyProductSKUNameOnWishListPage(){
        Assert.assertEquals(pageWishList.getSKU("adidas Consortium Campus 80s Running Shoes").getText().trim(),"AD_C80_RS");
    }

    public void verifyProductSizeOnWishListPage(){
        Assert.assertEquals(pageWishList.getProductDetails("adidas Consortium Campus 80s Running Shoes").getText().trim().split("\n")[0].split(":")[1].trim(),ProductDetailsSteps.productSize.trim());
    }

    public void verifyProductColorOnWishListPage(){
        Assert.assertEquals(pageWishList.getProductDetails("adidas Consortium Campus 80s Running Shoes").getText().trim().split("\n")[1].split(":")[1].trim(),"Red");
    }

    public void clickOnProductEditButton(){
        pageWishList.getBtnProductEdit("adidas Consortium Campus 80s Running Shoes").click();
    }

    public void clickOnRemoveProductButton(){
        pageWishList.getBtnProductRemove("adidas Consortium Campus 80s Running Shoes").click();
    }

    public void verifyProductShouldBeRemovedFromWishListPage(){
        Assert.assertTrue(pageWishList.getLblWishlistIsEmpty().isDisplayed());
    }

    public void clickSelectProductButton(){
       pageWishList.getChkAddToCart("adidas Consortium Campus 80s Running Shoes").click();
    }

    public void clickOnAddToCartButton(){
        pageWishList.getBtnAddToCart().click();
    }

    public void changeProductQuantity(){
       pageWishList.getProductQuantity("adidas Consortium Campus 80s Running Shoes").click();
        pageWishList.getProductQuantity("adidas Consortium Campus 80s Running Shoes").clear();
       productQuantity="2";
       pageWishList.getProductQuantity("adidas Consortium Campus 80s Running Shoes").sendKeys(productQuantity.trim());
    }

    public void clickOnUpdateWishListButton(){
        pageWishList.getBtnUpdateWishlist().click();
    }

    public void verifyProductQuantityShouldBeUpdate(){
        Assert.assertEquals(pageWishList.getProductQuantity("adidas Consortium Campus 80s Running Shoes").getAttribute("value").trim(),productQuantity.trim());
    }









}
