package com.saucedemo.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutStepTwoPage extends BasePage{

    public String title(){
        String titleText = driver.findElement(By.cssSelector("span.title")).getText().toLowerCase();
        return titleText;
    }

    public void finishCheckout(){
        WebElement finishButton = driver.findElement(By.cssSelector("button[data-test=finish]"));
        finishButton.click();
    }

    public String itemTotal(){
        String itemTotal = driver.findElement(By.cssSelector("div.summary_subtotal_label")).getText();
        return itemTotal;
    }

    public String taxTotal(){
        String taxTotal = driver.findElement(By.cssSelector("div.summary_tax_label")).getText();
        return taxTotal;
    }

    public String totalCost(){
        String totalCost = driver.findElement(By.cssSelector("div.summary_total_label")).getText();
        return totalCost;
    }

}
