package com.saucedemo.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutStepOnePage extends BasePage{

    public void userInformation(String firstName, String lastName, String zipCode){
        WebElement inputFirstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        inputFirstName.clear();
        inputFirstName.sendKeys(firstName);
        WebElement inputLastName = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        inputLastName.clear();
        inputLastName.sendKeys(lastName);
        WebElement inputZipCode = driver.findElement(By.cssSelector("input[placeholder='Zip/Postal Code']"));
        inputZipCode.clear();
        inputZipCode.sendKeys(zipCode);

        WebElement continueButton = driver.findElement(By.cssSelector("input[type='submit']"));
        continueButton.click();
    }

}
