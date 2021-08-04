package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginAndShoppingCart {

    @Test
    public void testLoginAndShoppingCart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/TeachMeSkills/WebDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);

        WebElement inputUsername = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        inputUsername.clear();
        inputUsername.sendKeys("standard_user");
        WebElement inputPassword = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        inputUsername.clear();
        inputPassword.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement addToCartButton = driver.findElement(By.cssSelector("button[data-test='add-to-cart-sauce-labs-fleece-jacket']"));
        addToCartButton.click();
//        String correctProductName = driver.findElement(By.cssSelector("#item_5_title_link div")).getText();
//        String correctProductPrice = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div")).getText();

        WebElement shoppingCartLink = driver.findElement(By.cssSelector(".shopping_cart_badge"));
        shoppingCartLink.click();
        Thread.sleep(2000);

        WebElement productName = driver.findElement(By.cssSelector(".inventory_item_name"));
        String productNameText = productName.getText();
//        Assert.assertEquals(productNameText, correctProductName);
        Assert.assertEquals(productNameText, "Sauce Labs Fleece Jacket");


        WebElement productPrice = driver.findElement(By.cssSelector(".inventory_item_price"));
        String productPriceText = productPrice.getText();
//        Assert.assertEquals(productNameText, correctProductPrice);
        Assert.assertEquals(productPriceText, "$49.99");

    }
}
