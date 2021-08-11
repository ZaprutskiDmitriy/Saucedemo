package com.saucedemo;

import com.saucedemo.page_object.CartPage;
import com.saucedemo.page_object.CheckOutPage;
import com.saucedemo.page_object.HomePage;
import com.saucedemo.page_object.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class TestLoginAndShoppingCart extends BaseTest {

    @Test
    public void testLoginAndShoppingCart() {

        LoginPage loginPage = new LoginPage();
        loginPage.login("standart_user", "secret_sauce");

        HomePage homePage = new HomePage();
        homePage.addProductToCart("Sauce Labs Fleece Jacket");

        homePage.navigateToCart();

        CartPage cartPage = new CartPage();
        Map<String, String> productsInCartData = cartPage.getProductData();


        Assert.assertTrue(
                productsInCartData.isEmpty(),
                "No products in cart"
        );
        Assert.assertFalse(
                productsInCartData.containsKey("Sauce Labs Fleece Jacket"),
                "No product with name Sauce Labs Fleece Jacket"
        );
        Assert.assertFalse(
                productsInCartData.containsKey("$49.99"),
                "Price does not match"
        );

        CheckOutPage checkOutPage = new CheckOutPage();
        checkOutPage.checkOut();
        checkOutPage.addUserInfo();

    }
}
