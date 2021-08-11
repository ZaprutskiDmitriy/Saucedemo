package com.saucedemo.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckOutPage extends BasePage {
    public void checkOut() {
        WebElement checkOutButton = driver.findElement(By.cssSelector("#checkout"));
        checkOutButton.click();
    }

    //    public class userInfo extends {
    public void addUserInfo() {
        WebElement firstName = driver.findElement(By.cssSelector("#first-name"));
        firstName.sendKeys("Sergey");
        WebElement lastName = driver.findElement(By.cssSelector("#last-name"));
        lastName.sendKeys("Samusevich");
        WebElement zipCode = driver.findElement(By.cssSelector("#postal-code"));
        zipCode.sendKeys("12345");
        WebElement continueButton = driver.findElement(By.cssSelector("#continue"));
        continueButton.click();
        WebElement finishButton = driver.findElement(By.cssSelector("#finish"));
        finishButton.click();

    }

    public void checkOutComplete() {
        WebElement checkOutComplete = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        String checkOutCompleteText = checkOutComplete.getText();
        Assert.assertEquals(checkOutCompleteText, "CHECKOUT: COMPLETE!");
    }
}
