package com.saucedemo;

import com.saucedemo.page_object.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {

        new LoginPage()
                .login("standard_user", "secret_sauce")
                .addProductToCart("Sauce Labs Fleece Jacket")
                .navigateToCart();

        CartPage cartPage = new CartPage();
        cartPage.isPageOpened();
        cartPage.clickCheckoutButton();

        CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage();
        checkoutStepOnePage.enterUserInformation("First_Name", "Last_Name", "220000");

        CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage();
        Assert.assertEquals(checkoutStepTwoPage.getTitle(), "checkout: overview");

        checkoutStepTwoPage.finishCheckout();

        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();
        Assert.assertEquals(checkoutCompletePage.getOrderMessage(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");

    }
}
