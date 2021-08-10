package com.saucedemo;

import com.saucedemo.page_object.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {

        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage = new HomePage();
        homePage.addProductToCart("Sauce Labs Fleece Jacket");

        homePage.navigateToCart();

        CartPage cartPage = new CartPage();
        cartPage.checkout();

        CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage();
        checkoutStepOnePage.userInformation("First_Name", "Last_Name", "220000");

        CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage();
        checkoutStepTwoPage.title();
        Assert.assertEquals(homePage.title(), "checkout: overview");

        checkoutStepTwoPage.finishCheckout();

        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();
        Assert.assertEquals(checkoutCompletePage.orderMessage(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");

    }
}
