package com.saucedemo.page_object;

import org.openqa.selenium.By;

public class CheckoutCompletePage extends BasePage{

    public String orderMessage(){
        String orderMessageText = driver.findElement(By.cssSelector("div.complete-text")).getText();
        return orderMessageText;
    }

}
