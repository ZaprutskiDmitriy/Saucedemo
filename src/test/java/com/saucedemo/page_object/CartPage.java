package com.saucedemo.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartPage extends BasePage{

    @FindBy(css = ".inventory_item_name")
    private WebElement productName;
    @FindBy(css = ".inventory_item_price")
    private WebElement productPrice;
    @FindBy(css = "button[data-test='remove-sauce-labs-fleece-jacket']")
    private WebElement removeButton;
    @FindBy(css = "button[data-test=continue-shopping]")
    private WebElement continueShoppingButton;
    @FindBy(css = "button[data-test=checkout]")
    private WebElement checkoutButton;

    public CartPage(){
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

    /**
     * @return Map where key is product name,
     * and value is price
     * */

    public Map<String, String> getProductData(){
        String productNameText = productName.getText();
        String productPriceText = productPrice.getText();
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(productNameText, productPriceText);
        return hashMap;
    }

    public void clickRemoveButton(){
        removeButton.click();
    }

    public void clickContinueShoppingButton(){
        continueShoppingButton.click();
    }

    public void clickCheckoutButton(){
        checkoutButton.click();
    }
}
