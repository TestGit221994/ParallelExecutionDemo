package org.parallel.steps;

import org.parallel.pageobjects.PageProductsListing;

public class ProductListingSteps {


    PageProductsListing pageProductsListing = new PageProductsListing();

    public void clickOnAddToWishlistButton(){
             pageProductsListing.getAddToWishlistButton("adidas Consortium Campus 80s Running Shoes").click();
    }

}
