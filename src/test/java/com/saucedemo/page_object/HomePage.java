package com.saucedemo.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    public void addProductToCart(String productName){
        WebElement addToCartButton = driver.findElement(By.cssSelector("button[data-test='add-to-cart-sauce-labs-fleece-jacket']"));
        addToCartButton.click();

    }

    public void navigateToCart(){
        WebElement shoppingCartLink = driver.findElement(By.cssSelector(".shopping_cart_badge"));
        shoppingCartLink.click();

    }
}
