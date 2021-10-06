package com.saucedemo.page_object;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected final WebDriver driver;

    public BasePage(){
        driver=DriverProvider.get();
    }

    public abstract BasePage isPageOpened();

    public abstract BasePage openPage();

}
