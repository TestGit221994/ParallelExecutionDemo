package org.parallel.stepsdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.openqa.selenium.WebElement;
import org.parallel.steps.ProductsSteps;

import java.util.ArrayList;
import java.util.List;

public class ProductsStepDefinition{


    ProductsSteps productsSteps = new ProductsSteps();
    public static Integer totalProductCount=0;
    public static Integer totalProductSoldCount=0;

    @Then("Validate A number of how many products in the store are in total")
    public void validateANumberOfHowManyProductsInTheStoreAreInTotal() throws InterruptedException {


/*
        System.out.println(" Total Product Count : Gifts : " +  + productsSteps.getTotalProductCount("Gifts"));
        totalProductCount=totalProductCount+productsSteps.getTotalProductCount("Gifts");
        System.out.println("  SoldOut : " +productsSteps.getTotalProductSoldOutCount("Gifts"));
        totalProductSoldCount=totalProductSoldCount+productsSteps.getTotalProductSoldOutCount("Gifts");
        System.out.println(" Sold Product Name : Gifts ");

 */


        productsSteps.getSoldProductsDetails("Gifts");






        /*
        List<WebElement> finalSoldProductNames = productsSteps.getSoldProductNames("Gifts");
        finalSoldProductNames.addAll(productsSteps.getSoldProductNames("Curated-Gifts"));
        finalSoldProductNames.addAll(productsSteps.getSoldProductNames("Bar-Sets"));
        finalSoldProductNames.addAll(productsSteps.getSoldProductNames("Gateaux-Basque"));
        finalSoldProductNames.addAll(productsSteps.getSoldProductNames("Hot-Chocolates"));
        finalSoldProductNames.addAll(productsSteps.getSoldProductNames("Pastries"));
        finalSoldProductNames.addAll(productsSteps.getSoldProductNames("Pantry-and-Baking"));
        finalSoldProductNames.addAll(productsSteps.getSoldProductNames("Treats"));

         */









        /*
        System.out.println(" Total Size of sold item : " +finalSoldProductNames.size());


        for(WebElement element : finalSoldProductNames){
            System.out.println(" Final name : " +element.getText().trim());
            element.click();
            Thread.sleep(5000);
            System.out.println(" page title is : " + productsSteps.getPageTitle());
            System.out.println(" page current url is : " + productsSteps.getPageCurrentUrl());
            productsSteps.nevigateBack();
            Thread.sleep(5000);
        }

         */

        /*
        for (WebElement element : hh){
            System.out.println(" Product Name : " +element.getText());
            element.click();
            Thread.sleep(3000);

            System.out.println(" Get Page Title" + productsSteps.getPageTitle());
            System.out.println(" Get Page URL" + productsSteps.getPageCurrentUrl());

            productsSteps.nevigateBack();
            Thread.sleep(3000);
        }




        System.out.println(" Total Product Count : Curated-Gifts : " +  + productsSteps.getTotalProductCount("Curated-Gifts"));
        totalProductCount=totalProductCount+productsSteps.getTotalProductCount("Curated-Gifts");
        System.out.println("  SoldOut : " +productsSteps.getTotalProductSoldOutCount("Curated-Gifts"));
        totalProductSoldCount=totalProductSoldCount+productsSteps.getTotalProductSoldOutCount("Curated-Gifts");

        System.out.println(" Total Product Count : Bar-Sets : " +  + productsSteps.getTotalProductCount("Bar-Sets"));
        totalProductCount=totalProductCount+productsSteps.getTotalProductCount("Bar-Sets");
        System.out.println("  SoldOut : " +productsSteps.getTotalProductSoldOutCount("Bar-Sets"));
        totalProductSoldCount=totalProductSoldCount+productsSteps.getTotalProductSoldOutCount("Bar-Sets");

        System.out.println(" Total Product Count : Gateaux-Basque : " +  + productsSteps.getTotalProductCount("Gateaux-Basque"));
        totalProductCount=totalProductCount+productsSteps.getTotalProductCount("Gateaux-Basque");
        System.out.println("  SoldOut : " +productsSteps.getTotalProductSoldOutCount("Gateaux-Basque"));
        totalProductSoldCount=totalProductSoldCount+productsSteps.getTotalProductSoldOutCount("Gateaux-Basque");

        System.out.println(" Total Product Count : Hot-Chocolates : " +  + productsSteps.getTotalProductCount("Hot-Chocolates"));
        totalProductCount=totalProductCount+productsSteps.getTotalProductCount("Hot-Chocolates");
        System.out.println("  SoldOut : " +productsSteps.getTotalProductSoldOutCount("Hot-Chocolates"));
        totalProductSoldCount=totalProductSoldCount+productsSteps.getTotalProductSoldOutCount("Hot-Chocolates");

        System.out.println(" Total Product Count : Pastries : " +  + productsSteps.getTotalProductCount("Pastries"));
        totalProductCount=totalProductCount+productsSteps.getTotalProductCount("Pastries");
        System.out.println("  SoldOut : " +productsSteps.getTotalProductSoldOutCount("Pastries"));
        totalProductSoldCount=totalProductSoldCount+productsSteps.getTotalProductSoldOutCount("Pastries");

        System.out.println(" Total Product Count : Pantry-and-Baking : " +  + productsSteps.getTotalProductCount("Pantry-and-Baking"));
        totalProductCount=totalProductCount+productsSteps.getTotalProductCount("Pantry-and-Baking");
        System.out.println("  SoldOut : " +productsSteps.getTotalProductSoldOutCount("Pantry-and-Baking"));
        totalProductSoldCount=totalProductSoldCount+productsSteps.getTotalProductSoldOutCount("antry-and-Baking");

        System.out.println(" Total Product Count : Treats : " +  + productsSteps.getTotalProductCount("Treats"));
        totalProductCount=totalProductCount+productsSteps.getTotalProductCount("Treats");
        System.out.println("  SoldOut : " +productsSteps.getTotalProductSoldOutCount("Treats"));
        totalProductSoldCount=totalProductSoldCount+productsSteps.getTotalProductSoldOutCount("Treats");



        System.out.println(" Total Product Count : "+totalProductCount);
        System.out.println(" Total Product Sold Count : "+totalProductSoldCount);


         */


    }



    @Then("Validate how many products in the {string} products section and how many products of them are sold out")
    public void validateHowManyProductsInTheGiftsProductsSectionAndHowManyProductsOfThemAreSoldOut(String productSectionName) {
        productsSteps.verifyTotalCountOfProductAndCountOfSoldProducts(productSectionName);
    }

    @Then("Validate Total count of all products and Total count of all sold products")
    public void validateTotalCountOfAllProductsAndTotalCountOfAllSoldProducts() {
        productsSteps.verifyTotalCountOfAllProductAndCountOfAllSoldProducts();
    }

    @Then("Validate how many sold products in the {string} products section with a page title and page link and Page Screenshot")
    public void validateHowManySoldProductsInTheGiftsProductsSectionWithAPageTitleAndPageLinkAndPageScreenshot(String productSectionName) throws InterruptedException {
        productsSteps.verifyHowManySoldProductsInTheGiftsProductsSectionWithAPageTitleAndPageLinkAndPageScreenshot(productSectionName);
    }
}
