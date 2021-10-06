package com.saucedemo;

import com.saucedemo.page_object.CartPage;
import com.saucedemo.page_object.HomePage;
import com.saucedemo.page_object.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContinueShoppingTest extends BaseTest {

    @Test
    public void continueShoppingTest() {

        new LoginPage()
                .login("standard_user", "secret_sauce")
                .addProductToCart("Sauce Labs Fleece Jacket")
                .navigateToCart();

        CartPage cartPage = new CartPage();
        cartPage.isPageOpened();
        cartPage.clickContinueShoppingButton();
        HomePage homePage = new HomePage();

        Assert.assertEquals(homePage.getTitle(), "products");
    }
}
