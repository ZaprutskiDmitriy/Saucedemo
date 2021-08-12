package com.saucedemo;

import com.saucedemo.page_object.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculateTotalCostOrderTest extends BaseTest{

    @Test
    public void calculateTotalCostTest() {

        new LoginPage()
                .login("standard_user", "secret_sauce")
                .addProductToCart("Sauce Labs Fleece Jacket")
                .navigateToCart();

        CartPage cartPage = new CartPage();
        cartPage.clickCheckoutButton();

        CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage();
        checkoutStepOnePage.enterUserInformation("First_Name", "Last_Name", "220000");

        CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage();

        checkoutStepTwoPage.getTitle();
        Assert.assertEquals(checkoutStepTwoPage.getItemTotal(), "Item total: $79.98");
        Assert.assertEquals(checkoutStepTwoPage.getTaxTotal(), "Tax: $6.40");
        Assert.assertEquals(checkoutStepTwoPage.getTotalCost(), "Total: $86.38");
    }
}
