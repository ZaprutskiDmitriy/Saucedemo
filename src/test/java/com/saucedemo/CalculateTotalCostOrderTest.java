package com.saucedemo;

import com.saucedemo.page_object.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculateTotalCostOrderTest extends BaseTest{

    @Test
    public void calculateTotalCostTest() {

        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage = new HomePage();
        homePage.addProductToCart("Sauce Labs Fleece Jacket");
        homePage.addAnotherProductToCart("Sauce Labs Backpack");

        homePage.navigateToCart();

        CartPage cartPage = new CartPage();
        cartPage.checkout();

        CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage();
        checkoutStepOnePage.userInformation("First_Name", "Last_Name", "220000");

        CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage();

        checkoutStepTwoPage.title();
        Assert.assertEquals(checkoutStepTwoPage.itemTotal(), "Item total: $79.98");
        Assert.assertEquals(checkoutStepTwoPage.taxTotal(), "Tax: $6.40");
        Assert.assertEquals(checkoutStepTwoPage.totalCost(), "Total: $86.38");

    }
}
