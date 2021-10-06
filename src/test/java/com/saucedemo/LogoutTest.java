package com.saucedemo;

import com.saucedemo.page_object.HomePage;
import com.saucedemo.page_object.LoginPage;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import io.qameta.allure.TmsLink;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Link("https://instagram.com/dmitryrak11")
    @Issue("COVID-19")
    @TmsLink("COVID-19")

    @Test
    public void logoutTest() {
        login("standard_user", "secret_sauce");
        logout();
        takeScreenshot();
    }

    @Step("login with {userName} and password {password}")
    public void login(String userName, String password){
        LoginPage loginPage = new LoginPage();
        loginPage.login(userName, password);

        HomePage homePage = new HomePage();
        homePage.isPageOpened();
        homePage.openBurgerMenu();
    }

    @Step("logout")
    public void logout(){
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        homePage.logout();

        Assert.assertTrue(loginPage.loginForm().isDisplayed());
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
    }
}
