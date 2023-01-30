package org.parallel.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Sheet;
import org.parallel.steps.HomeSteps;
import org.parallel.steps.ProductDetailsSteps;
import org.parallel.steps.ProductListingSteps;
import org.parallel.steps.WishListSteps;
import org.parallel.utils.misc.ExcelBaseUtil;
import org.parallel.utils.misc.JsonUtils;
import org.parallel.utils.misc.RandomUtils;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

import static org.parallel.stepsdefinition.BaseClass.navigateToLoginPage;

public class WishListStepDefinition {
    


    WishListSteps wishListSteps = new WishListSteps();
    HomeSteps homeSteps = new HomeSteps();
    ProductListingSteps productListingSteps = new ProductListingSteps();
    ProductDetailsSteps productDetailsSteps = new ProductDetailsSteps();


    @When("User click on WishList button")
    public void userClickOnWishListButton() {
        wishListSteps.clickOnWishListButton();
    }

    @Then("Verify WishList label")
    public void verifyWishListLabel() throws InterruptedException {
        Thread.sleep(3000);
        wishListSteps.verifyWishListLabel();
    }

    @Then("Verify your wishlist cart is empty label")
    public void verifyYourWishlistCartIsEmptyLabel() throws InterruptedException {
        Thread.sleep(3000);
        //wishListSteps.verifyYourWishListIsEmptyLabel();
    }

    @When("User click on Apparel option")
    public void userClickOnApparelOption() throws InterruptedException {
        homeSteps.clickOnApparelButton();
    }

    @And("User click on Shoes option")
    public void userClickOnShoesOption() {
        homeSteps.clickOnShoesButton();
    }

    @And("User click on Add to wishList button from product listing page")
    public void userClickOnAddToWishListButtonFromProductListingPage() {
        productListingSteps.clickOnAddToWishlistButton();

    }

    @And("User select size for product")
    public void userSelectSizeForProduct() throws InterruptedException {
        Thread.sleep(5000);
        productDetailsSteps.selectSize();
    }

    @And("User collect product name from product details page")
    public void userCollectProductNameFromProductDetailsPage() {
        productDetailsSteps.storeProductName();
    }

    @And("User click on add to wishlist button from product details page")
    public void userClickOnAddToWishlistButtonFromProductDetailsPage() {
     productDetailsSteps.clickOnAddToWishlistButton();
    }

    @And("User close the success popup")
    public void userCloseTheSuccessPopup() throws InterruptedException {
        Thread.sleep(2000);
        productDetailsSteps.clickOnCloseButtonOfSuccessPopup();
    }

    @And("User click on wishlist button on top option")
    public void userClickOnWishlistButtonOnTopOption() {
        homeSteps.clickOnWishListButton();
    }

    @Then("Verify product should be added into wishlist page")
    public void verifyProductShouldBeAddedIntoWishlistPage() {
        wishListSteps.verifyProductNameOnWishListPage();
    }

    @And("User collect SKU name from product details page")
    public void userCollectSKUNameFromProductDetailsPage() {

    }

    @And("User collect product size from product details page")
    public void userCollectProductSizeFromProductDetailsPage() {

    }

    @And("User collect product color from product details page")
    public void userCollectProductColorFromProductDetailsPage() {

    }

    @Then("Verify product name on wishlist page")
    public void verifyProductNameOnWishlistPage() {
        wishListSteps.verifyProductNameOnWishListPage();
    }

    @Then("Verify SKU name on wishlist page")
    public void verifySKUNameOnWishlistPage() {
        wishListSteps.verifyProductSKUNameOnWishListPage();
    }

    @Then("Verify product size on wishlist page")
    public void verifyProductSizeOnWishlistPage() {
        wishListSteps.verifyProductSizeOnWishListPage();
    }

    @Then("Verify product color on wishlist page")
    public void verifyProductColorOnWishlistPage() {
       wishListSteps.verifyProductColorOnWishListPage();
    }

    @When("User click on edit button on wishlist page")
    public void userClickOnEditButtonOnWishlistPage() throws InterruptedException {
        Thread.sleep(3000);
       wishListSteps.clickOnProductEditButton();
    }

    @And("User change size of product on product details page")
    public void userChangeSizeOfProductOnProductDetailsPage() {
        productDetailsSteps.changeSize();
    }

    @And("User click on update button on product details page")
    public void userClickOnUpdateButtonOnProductDetailsPage() {
         productDetailsSteps.clickOnUpdateWishListButton();
    }

    @When("User click on remove product button on wishlist page")
    public void userClickOnRemoveProductButtonOnWishlistPage() {
        wishListSteps.clickOnRemoveProductButton();
    }

    @Then("Verify product should be removed from wishlist page")
    public void verifyProductShouldBeRemovedFromWishlistPage() throws InterruptedException {
        Thread.sleep(3000);
        wishListSteps.verifyProductShouldBeRemovedFromWishListPage();
    }

    @When("User select the product on wishlist page")
    public void userSelectTheProductOnWishlistPage() {
        wishListSteps.clickSelectProductButton();
    }

    @And("User click on Add to Cart button on wishlist page")
    public void userClickOnAddToCartButtonOnWishlistPage() {
        wishListSteps.clickOnAddToCartButton();
    }

    @When("User change the quantity count on wishlist page")
    public void userChangeTheQuantityCountOnWishlistPage() {
        wishListSteps.changeProductQuantity();
    }

    @And("User click on update wishlist button on wishlist page")
    public void userClickOnUpdateWishlistButtonOnWishlistPage() {
        wishListSteps.clickOnUpdateWishListButton();
    }

    @Then("Verify quantity count should be updated into wishlist page")
    public void verifyQuantityCountShouldBeUpdatedIntoWishlistPage() throws InterruptedException {
        Thread.sleep(3000);
        wishListSteps.verifyProductQuantityShouldBeUpdate();
    }

    @When("read data from excel util")
    public void readDataFromExcelUtil() throws IOException {

        ExcelBaseUtil.setExcels("rpa",System.getProperty("user.dir") + File.separator + "src/test/resources/TestData/rpa.xlsx");

        System.out.println(" Test Data is : " +ExcelBaseUtil.getData(ExcelBaseUtil.getSheet(ExcelBaseUtil.getWorkbook("rpa"),"Sheet1"),1,1));
        System.out.println(" Test Data is : " +ExcelBaseUtil.getData(ExcelBaseUtil.getSheet(ExcelBaseUtil.getWorkbook("rpa"),"Sheet2"),1,1));

        ExcelBaseUtil.setExcels("selenium",System.getProperty("user.dir") + File.separator + "src/test/resources/TestData/selenium.xlsx");

        System.out.println(" Test Data is : " +ExcelBaseUtil.getData(ExcelBaseUtil.getSheet(ExcelBaseUtil.getWorkbook("selenium"),"Sheet1"),1,1));
        System.out.println(" Test Data is : " +ExcelBaseUtil.getData(ExcelBaseUtil.getSheet(ExcelBaseUtil.getWorkbook("selenium"),"Sheet2"),1,1));


        ExcelBaseUtil.openFile("rpa");
        ExcelBaseUtil.setData(ExcelBaseUtil.getSheet(ExcelBaseUtil.getWorkbook("rpa"),"Sheet1"),4,4,"TestUpdate1");
        ExcelBaseUtil.closeFile("rpa");

        ExcelBaseUtil.openFile("selenium");
        ExcelBaseUtil.setData(ExcelBaseUtil.getSheet(ExcelBaseUtil.getWorkbook("selenium"),"Sheet1"),4,4,"TestUpdate2");
        ExcelBaseUtil.closeFile("selenium");

        Sheet sheet=ExcelBaseUtil.getSheet(ExcelBaseUtil.getWorkbook("rpa"),"Sheet1");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(" " +ExcelBaseUtil.getData(sheet,i,j));
            }
            System.out.println();
        }
    }

    @When("read data from json util")
    public void readDataFromJsonUtil() {
        String jsonString = "{\"username\" : \"admin\",\"password\" : \"password123\"}";

        System.out.println(jsonString);

        JsonUtils.storeJSONFile(jsonString,"Demo");
        JsonUtils.storeJSONFile(jsonString,"Dem1");
        System.out.println(" final Value is " + JsonUtils.getValue(JsonUtils.getJSONDataFromJsonFile("Demo"),"username"));

    }
}
