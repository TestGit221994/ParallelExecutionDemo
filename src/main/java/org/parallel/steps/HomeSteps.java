package org.parallel.steps;

import org.parallel.pageobjects.PageHome;

public class HomeSteps {


    PageHome pageHome =new PageHome();

    public void clickOnApparelButton() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("dadas" +pageHome.getLblApparel());
        pageHome.getLblApparel().click();
    }

    public void clickOnShoesButton(){
       pageHome.getLblShoes().click();
    }

    public void clickOnWishListButton(){
      pageHome.getBtnWishList().click();
    }



}
