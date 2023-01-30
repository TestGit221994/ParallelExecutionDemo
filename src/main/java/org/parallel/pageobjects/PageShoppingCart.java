package org.parallel.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.parallel.stepsdefinition.BaseClass.getWebDriver;

public class PageShoppingCart {

    public PageShoppingCart() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    private WebElement lblShoppingCart;
    public WebElement getLblShoppingCart(){
        return lblShoppingCart;
    }

    @FindBy(xpath = "//div[contains(text(),'Your Shopping Cart is empty!')]")
    private WebElement lblShoppingCartEmpty;
    public WebElement getLblShoppingCartEmpty(){
        return lblShoppingCartEmpty;
    }

    @FindBy(xpath = "//td[@class='product']/descendant::a[1]")
    private WebElement lblProductName;
    public WebElement getLblProductName(){
        return lblProductName;
    }

    @FindBy(xpath = "//div[contains(text(),'Your Shopping Cart is empty!')]")
    private WebElement lblShoppingCartIsEmpty;
    public WebElement getLblShoppingCartIsEmpty(){
        return lblShoppingCartIsEmpty;
    }



    public WebElement getChkAddToCart(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='add-to-cart']/input[1]"));
    }

    public WebElement getSKU(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='sku']/span[1]"));
    }

    public WebElement getImgProduct(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='product-picture']/descendant::img[1]"));
    }

    public WebElement getProductDetails(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='product']/descendant::div[1]"));
    }


    public WebElement getBtnProductEdit(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='product']/descendant::div[2]"));
    }

    public WebElement getProductPrice(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='unit-price']/descendant::span[1]"));
    }

    public WebElement getProductQuantity(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='quantity']/descendant::input[1]"));
    }

    public WebElement getProductTotal(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='subtotal']/descendant::span[1]"));
    }

    public WebElement getBtnProductRemove(String productName){
        return getWebDriver().findElement(By.xpath("//a[contains(text(),'"+productName.trim()+"')]/ancestor::tr[1]/descendant::td[@class='remove-from-cart']/descendant::button[1]"));
    }

    @FindBy(xpath = "//button[contains(text(),'Update shopping cart')]")
    private WebElement btnUpdateShoppingCart;
    public WebElement getBtnUpdateShoppingCart(){
        return btnUpdateShoppingCart;
    }

    @FindBy(xpath = "//table[@class='cart-total']/descendant::label[contains(text(),'Sub-Total')][1]/ancestor::td[1]/following-sibling::td[1]/span[1]")
    private WebElement subTotal;
    public WebElement getSubTotal(){
        return subTotal;
    }

    @FindBy(xpath = "//table[@class='cart-total']/descendant::label[contains(text(),'Shipping')][1]/ancestor::td[1]/following-sibling::td[1]/span[1]")
    private WebElement shippingAmount;
    public WebElement getShippingAmount(){
        return shippingAmount;
    }


    @FindBy(xpath = "//table[@class='cart-total']/descendant::label[contains(text(),'Tax:')][1]/ancestor::td[1]/following-sibling::td[1]/span[1]")
    private WebElement taxAmount;
    public WebElement getTaxAmount(){
        return taxAmount;
    }


    @FindBy(xpath = "//table[@class='cart-total']/descendant::tr[@class='order-total']/descendant::strong[1]")
    private WebElement totalAmount;
    public WebElement getTotalAmount(){
        return totalAmount;
    }

}
