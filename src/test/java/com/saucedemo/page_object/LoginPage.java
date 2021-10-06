package com.saucedemo.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(css = "input[placeholder='Username']")
    private WebElement inputUsername;
    @FindBy(css = "input[placeholder='Password']")
    private WebElement inputPassword;
    @FindBy(css = "input[type='submit']")
    private WebElement loginButton;
    @FindBy(css = "h3[data-test='error']")
    private WebElement errorMessage;
    @FindBy(tagName = "form")
    private WebElement loginForm;

    public LoginPage(){
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

    public HomePage login(String userName, String password){
        inputUsername.clear();
        inputUsername.sendKeys("standard_user");
        inputPassword.clear();
        inputPassword.sendKeys("secret_sauce");
        loginButton.click();
        return new HomePage();
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public String getErrorMessage(){
        return errorMessage.getText();
    }

    public WebElement loginForm(){
        return loginForm;
    }
}
