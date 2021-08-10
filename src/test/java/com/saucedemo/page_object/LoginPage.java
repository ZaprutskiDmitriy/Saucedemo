package com.saucedemo.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public void login(String userName, String password){
        WebElement inputUsername = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        inputUsername.clear();
        inputUsername.sendKeys("standard_user");
        WebElement inputPassword = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        inputUsername.clear();
        inputPassword.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
        loginButton.click();
    }

    public void loginButton(){
        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
        loginButton.click();
    }

    public String errorMessage(){
        String errorMessageText = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
        return errorMessageText;
    }

    public WebElement loginForm(){
        WebElement loginForm = driver.findElement(By.tagName("form"));
        return loginForm;
    }
}
