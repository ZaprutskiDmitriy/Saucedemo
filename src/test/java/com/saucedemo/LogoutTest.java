package com.saucedemo;

import com.saucedemo.page_object.HomePage;
import com.saucedemo.page_object.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutTest() {

        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage = new HomePage();
        homePage.burgerMenu();
        homePage.logout();

        Assert.assertTrue(loginPage.loginForm().isDisplayed());
        loginPage.loginButton();
        Assert.assertEquals(loginPage.errorMessage(), "Epic sadface: Username is required");
    }
}
