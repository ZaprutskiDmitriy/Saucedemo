package com.saucedemo;

import com.saucedemo.page_object.CartPage;
import com.saucedemo.page_object.HomePage;
import com.saucedemo.page_object.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class LoginAndAddingToShoppingCartTest extends BaseTest {

    @Test
    public void loginAndAddingToShoppingCartTest() {

        new LoginPage()
        .login("standard_user", "secret_sauce")
        .addProductToCart("Sauce Labs Fleece Jacket")
        .navigateToCart();

        CartPage cartPage = new CartPage();
        cartPage.isPageOpened();
        Map<String, String> productInCartData = cartPage.getProductData();

        Assert.assertFalse(productInCartData.isEmpty(), "No products in cart");
        Assert.assertTrue(productInCartData.containsKey("Sauce Labs Fleece Jacket"), "No products with name Sauce Labs Fleece Jacket");
        Assert.assertEquals(productInCartData.get("Sauce Labs Fleece Jacket"), "$49.99", "Prices doesn't match");

    }
}
