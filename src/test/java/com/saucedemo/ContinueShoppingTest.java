package com.saucedemo;

import com.saucedemo.page_object.CartPage;
import com.saucedemo.page_object.HomePage;
import com.saucedemo.page_object.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContinueShoppingTest extends BaseTest {

    @Test
    public void continueShoppingTest() {

        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage = new HomePage();
        homePage.addProductToCart("Sauce Labs Fleece Jacket");

        homePage.navigateToCart();

        CartPage cartPage = new CartPage();
        cartPage.continueShoppingButton();

        Assert.assertEquals(homePage.title(), "products");
    }
}
