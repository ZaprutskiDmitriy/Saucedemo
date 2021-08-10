package com.saucedemo.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    public void addProductToCart(String productName){
        WebElement addToCartButton = driver.findElement(By.cssSelector("button[data-test='add-to-cart-sauce-labs-fleece-jacket']"));
        addToCartButton.click();
    }

    public void addAnotherProductToCart(String productName){
        WebElement addAnotherToCartButton = driver.findElement(By.cssSelector("button[data-test='add-to-cart-sauce-labs-backpack']"));
        addAnotherToCartButton.click();
    }

    public void removeProductFromCart(String productName){
        WebElement removeFromCartButton = driver.findElement(By.cssSelector("button[data-test='remove-sauce-labs-fleece-jacket']"));
        removeFromCartButton.click();
    }

    public void navigateToCart(){
        WebElement shoppingCartLink = driver.findElement(By.cssSelector(".shopping_cart_badge"));
        shoppingCartLink.click();
    }

    public void navigateToEmptyCart(){
        WebElement shoppingCartLink = driver.findElement(By.cssSelector(".shopping_cart_link"));
        shoppingCartLink.click();
    }

    public void burgerMenu(){
        WebElement burgerButton = driver.findElement(By.cssSelector("#react-burger-menu-btn"));
        burgerButton.click();
    }

    public void logout(){
        WebElement logoutRef = driver.findElement(By.cssSelector("#logout_sidebar_link"));
        logoutRef.click();
    }

    public String title(){
        String titleText = driver.findElement(By.cssSelector("span.title")).getText().toLowerCase();
        return titleText;
    }
}
