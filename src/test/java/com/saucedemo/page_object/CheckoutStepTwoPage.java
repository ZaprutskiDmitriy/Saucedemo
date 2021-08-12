package com.saucedemo.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepTwoPage extends BasePage{

    @FindBy(css = "span.title")
    private WebElement title;
    @FindBy(css = "button[data-test=finish]")
    private WebElement finishButton;
    @FindBy(css = "div.summary_subtotal_label")
    private WebElement itemTotal;
    @FindBy(css = "div.summary_tax_label")
    private WebElement taxTotal;
    @FindBy(css = "div.summary_total_label")
    private WebElement totalCost;

    public CheckoutStepTwoPage() {
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

    public String getTitle(){
        return title.getText().toLowerCase();
    }

    public void finishCheckout(){
        finishButton.click();
    }

    public String getItemTotal(){
        return itemTotal.getText();
    }

    public String getTaxTotal(){
        return taxTotal.getText();
    }

    public String getTotalCost(){
        return totalCost.getText();
    }

}
