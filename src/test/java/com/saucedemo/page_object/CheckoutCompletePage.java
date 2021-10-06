package com.saucedemo.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage extends BasePage{

    @FindBy(css = "div.complete-text")
    private WebElement orderMessage;

    public CheckoutCompletePage() {
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

    public String getOrderMessage(){
        return orderMessage.getText();
    }

}
