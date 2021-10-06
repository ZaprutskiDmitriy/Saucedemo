package com.saucedemo.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOnePage extends BasePage{
    @FindBy(css = "input[placeholder='First Name']")
    private WebElement inputFirstName;
    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement inputLastName;
    @FindBy(css = "input[placeholder='Zip/Postal Code']")
    private WebElement inputZipCode;
    @FindBy(css = "input[type='submit']")
    private WebElement continueButton;

    public CheckoutStepOnePage() {
        super();
        PageFactory.initElements(driver, this);
    }

    @Override
    public BasePage isPageOpened() {
        //ОЖИДАНИЕ ПОКА НА СТРАНИЦЕ НЕ ОТОБРАЗИТСЯ ПОСЛЕДНИЙ ЭЛЕМЕНТ
        return this;
    }

    @Override
    public BasePage openPage() {
        //МЕТОД ДЛЯ ОТКРЫТИЯ КОНКРЕТНОЙ СТРАНИЦЫ
        return this;
    }

    public void enterUserInformation(String firstName, String lastName, String zipCode){
        inputFirstName.clear();
        inputFirstName.sendKeys(firstName);
        inputLastName.clear();
        inputLastName.sendKeys(lastName);
        inputZipCode.clear();
        inputZipCode.sendKeys(zipCode);
        continueButton.click();
    }

}
