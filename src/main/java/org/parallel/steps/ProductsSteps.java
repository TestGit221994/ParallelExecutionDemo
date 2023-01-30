package org.parallel.steps;

import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.parallel.pageobjects.PageProducts;
import org.parallel.stepsdefinition.BaseClass;
import org.parallel.utils.misc.ElementUtils;
import org.parallel.utils.misc.PropertyUtils;
import org.parallel.utils.misc.WaitUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class ProductsSteps extends BaseClass {

    PageProducts pageProducts = new PageProducts();

    public static Integer totalCountOfAllProducts=0;
    public static Integer totalCountOfAllSoldProducts=0;
    public static Boolean gotItWebElementStatus=false;

    public void getSoldProductsDetails(String productNameSection) throws InterruptedException {

        int totalSoldProductsCount = pageProducts.getSoldProductName(productNameSection).size();

        String productName="";

        Allure.step(" Sold Product Section Name : "+productNameSection);

        Allure.step(" Total Sold products Count of "+productNameSection+" Section : " +totalSoldProductsCount);

        ElementUtils.click(getWebDriver(),pageProducts.clickOnGotItButton(),"");

        for (int i = 0; i < totalSoldProductsCount; i++) {
            productName = pageProducts.getSoldProductName(productNameSection).get(i).getText().trim();

            Allure.step("Sold Product Name : " + pageProducts.getSoldProductName(productNameSection).get(i).getText().trim());

            ElementUtils.click(getWebDriver(),pageProducts.getSoldProductName(productNameSection).get(i),"");

            //actions.moveToElement(pageProducts.getSoldProductName(productNameSection).get(i)).build().perform();
            //actions.moveToElement(pageProducts.getSoldProductName(productNameSection).get(i)).build().perform();

            //actions.moveToElement(pageProducts.getSoldProductName(productNameSection).get(i)).click().build().perform();

            Thread.sleep(5000);

            Allure.step("Sold Product Page Title : " + getPageTitle());

            Allure.step("Sold Product Page URL : " + getPageCurrentUrl());

            addScreenshot(productName);

            navigateBack();

            Thread.sleep(5000);
        }
    }

    public String getPageTitle() {
        return getWebDriver().getTitle();
    }

    public String getPageCurrentUrl() {
        return getWebDriver().getCurrentUrl();
    }

    public void navigateBack() {
        getWebDriver().navigate().back();
    }

    @Attachment(value = "Failed Test ScreenShot", type = "image/png")
    public void saveScreenShot(WebDriver driver, String productName) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr, new File(PropertyUtils.getProperty("default.screenshot.location") + "/" + productName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addScreenshot(String productName) {
            saveScreenShot(getWebDriver(), productName);
            try {
                FileInputStream inputStream = new FileInputStream(PropertyUtils.getProperty("default.screenshot.location") + "/" + productName + ".png");
                Allure.addAttachment(productName, inputStream);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Allure.addAttachment("Sold Product Name ", productName);
        }

    public void verifyTotalCountOfProductAndCountOfSoldProducts(String productNameSection){

        int totalCountOfProducts = pageProducts.getProductCount(productNameSection);
        int totalCountOfSoldProducts = pageProducts.getProductSoldOutCount(productNameSection);

        Allure.step(" Total Count of Products From "+productNameSection+" Section : " +totalCountOfProducts);
        Allure.step(" Total Count of Sold Products From "+productNameSection+" Section : " +totalCountOfSoldProducts);

        totalCountOfAllProducts = totalCountOfAllProducts + totalCountOfProducts;
        totalCountOfAllSoldProducts = totalCountOfAllSoldProducts + totalCountOfSoldProducts;

    }

    public void verifyTotalCountOfAllProductAndCountOfAllSoldProducts(){

        Allure.step(" Total Count of All Products : " +totalCountOfAllProducts);
        Allure.step(" Total Count of All Sold Products : "+totalCountOfAllSoldProducts);

    }

    public void verifyHowManySoldProductsInTheGiftsProductsSectionWithAPageTitleAndPageLinkAndPageScreenshot(String productNameSection) throws InterruptedException {

        WaitUtils.waitForPageLoad(getWebDriver());
        String productName = "";
            int totalSoldProductsCount = pageProducts.getSoldProductName(productNameSection).size();
            Allure.step(" Sold Product Section Name : " + productNameSection);
            Allure.step(" Total Sold products Count of " + productNameSection + " Section : " + totalSoldProductsCount);
            if (!gotItWebElementStatus) {
                ElementUtils.click(getWebDriver(), pageProducts.clickOnGotItButton(), "");
                gotItWebElementStatus = true;
            }
            for (int i = 0; i < totalSoldProductsCount; i++) {
                productName = pageProducts.getSoldProductName(productNameSection).get(i).getText().trim();
                Allure.step("Sold Product Name : " + pageProducts.getSoldProductName(productNameSection).get(i).getText().trim());
                ElementUtils.click(getWebDriver(), pageProducts.getSoldProductName(productNameSection).get(i), "");
                WaitUtils.waitForPageLoad(getWebDriver());
                Allure.step("Sold Product Page Title : " + getPageTitle());
                Allure.step("Sold Product Page URL : " + getPageCurrentUrl());
                addScreenshot(productName);
                navigateBack();
                WaitUtils.waitForPageLoad(getWebDriver());
            }

        }







}