package com.saucedemo.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(css = "button[data-test='add-to-cart-sauce-labs-fleece-jacket']")
    private WebElement addToCartButton;
    @FindBy(css = "button[data-test='add-to-cart-sauce-labs-backpack']")
    private WebElement addAnotherToCartButton;
    @FindBy(css = "button[data-test='remove-sauce-labs-fleece-jacket']")
    private WebElement removeFromCartButton;
    @FindBy(css = ".shopping_cart_badge")
    private WebElement shoppingCartLink;
    @FindBy(css = ".shopping_cart_link")
    private WebElement shoppingEmptyCartLink;
    @FindBy(css = "#react-burger-menu-btn")
    private WebElement burgerButton;
    @FindBy(css = "#logout_sidebar_link")
    private WebElement logoutRef;
    @FindBy(css = "span.title")
    private WebElement title;

    public HomePage() {
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

    public HomePage addProductToCart(String productName){
        addToCartButton.click();
        return this;
    }

    public void addAnotherProductToCart(String productName){
        addAnotherToCartButton.click();
    }

    public void removeProductFromCart(String productName){
        removeFromCartButton.click();
    }

    public void navigateToCart(){
        shoppingCartLink.click();
    }

    public void navigateToEmptyCart(){
        shoppingEmptyCartLink.click();
    }

    public void openBurgerMenu(){
        burgerButton.click();
    }

    public void logout(){
        logoutRef.click();
    }

    public String getTitle(){
        return title.getText().toLowerCase();
    }
}
