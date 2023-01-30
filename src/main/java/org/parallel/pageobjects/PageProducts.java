package org.parallel.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.parallel.utils.misc.WaitUtils;

import java.util.List;

import static org.parallel.stepsdefinition.BaseClass.getWebDriver;

public class PageProducts {


    public PageProducts() {
        PageFactory.initElements(getWebDriver(), this);
    }



    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    private WebElement btnLogin;
    public WebElement getBtnLogin(){
        return btnLogin;
    }

    public Integer getProductCount(String productNameSection){
        if(productNameSection.equals("Chocolate-Bars")){
            return getWebDriver().findElements(By.xpath("//div[@id='"+productNameSection+"']/ancestor::div[1]/following-sibling::div[1]/descendant::div[5]/descendant::img")).size();
        }else {
            return getWebDriver().findElements(By.xpath("//div[@id='"+productNameSection.trim()+"']/descendant::div[2]/following-sibling::div[1]/descendant::img")).size();
        }

    }

    public Integer getProductSoldOutCount(String productNameSection){
        if(productNameSection.equals("Hot-Chocolates")){
            return getWebDriver().findElements(By.xpath("//div[@id='"+productNameSection+"']/descendant::div[5]/descendant::span[@class='card__availability']")).size();
        }else if(productNameSection.equals("Chocolate-Bars")){
            return getWebDriver().findElements(By.xpath("//div[@id='"+productNameSection+"']/ancestor::div[1]/following-sibling::div[1]/descendant::div[5]/descendant::span[@class='card__availability']")).size();
        } else {
            return getWebDriver().findElements(By.xpath("//div[@id='"+productNameSection+"']/descendant::span[@class='card__availability']")).size();
        }
    }

    public List<WebElement> getSoldProductName(String productNameSection){
        if(productNameSection.equals("Hot-Chocolates")){
            return getWebDriver().findElements(By.xpath("//div[@id='"+productNameSection.trim()+"']/descendant::div[5]/descendant::span[@class='card__availability']/ancestor::div[2]/descendant::h3"));
        }else if(productNameSection.equals("Chocolate-Bars")){
            return getWebDriver().findElements(By.xpath("//div[@id='"+productNameSection.trim()+"']/ancestor::div[1]/following-sibling::div[1]/descendant::div[5]/descendant::span[@class='card__availability']/ancestor::div/descendant::div[2][@class='card__origin']"));
        } else {
            return getWebDriver().findElements(By.xpath("//div[@id='" + productNameSection + "']/descendant::span[@class='card__availability']/ancestor::div[2]/descendant::h3"));
        }
    }

    public WebElement clickOnGotItButton(){
        WaitUtils.waitForElementToLoad(getWebDriver(),"//a[contains(text(),'Got it!')]");
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'Got it!')]"));

    }













}
