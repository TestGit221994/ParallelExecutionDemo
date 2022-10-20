package org.parallel.steps;

import org.parallel.pageobjects.PageHome;
import org.parallel.pageobjects.PageShoppingCart;
import org.parallel.pageobjects.PageWishList;
import org.testng.Assert;

public class WishListSteps {

    PageHome pageHome = new PageHome();
    PageWishList pageWishList = new PageWishList();

    public void clickOnWishListButton(){
         pageHome.getBtnWishList().click();
    }

    public void verifyWishListLabel(){
        Assert.assertEquals(pageWishList.getLblWishList().getText().trim(),"Wishlist");
    }

    public void verifyYourWishListIsEmptyLabel(){
        Assert.assertEquals(pageWishList.getLblWishListIsEmpty().getText().trim(),"The wishlist is empty!");
    }


}
