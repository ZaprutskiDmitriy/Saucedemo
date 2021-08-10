package com.saucedemo;

import com.saucedemo.page_object.CartPage;
import com.saucedemo.page_object.HomePage;
import com.saucedemo.page_object.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class RemoveButtonAtHomepageTest extends BaseTest{

    @Test
    public void removeButtonAtShoppingCartTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage = new HomePage();
        homePage.addProductToCart("Sauce Labs Fleece Jacket");
        homePage.removeProductFromCart("Sauce Labs Fleece Jacket");

        homePage.navigateToEmptyCart();

        CartPage cartPage = new CartPage();
        Map<String, String> productInCartData = cartPage.getProductData();
        Assert.assertTrue(productInCartData.isEmpty(), "Have products in cart");
    }
}
