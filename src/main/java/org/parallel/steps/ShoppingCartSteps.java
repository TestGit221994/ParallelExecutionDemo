package org.parallel.steps;

import org.parallel.pageobjects.PageHome;
import org.parallel.pageobjects.PageRegister;
import org.parallel.pageobjects.PageShoppingCart;
import org.testng.Assert;

public class ShoppingCartSteps {

    PageHome pageHome = new PageHome();
    PageShoppingCart pageShoppingCart=new PageShoppingCart();

    public void clickOnShoppingCartButton(){
     pageHome.getBtnShoppingCart().click();
    }

    public void verifyShoppingCartLabel(){
        Assert.assertEquals(pageShoppingCart.getLblShoppingCart().getText().trim(),"Shopping cart");
    }

    public void verifyYourShoppingCartIsEmptyLabel(){
        Assert.assertEquals(pageShoppingCart.getLblShoppingCartEmpty().getText().trim(),"Your Shopping Cart is empty!");
    }


}
