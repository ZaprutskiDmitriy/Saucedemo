package com.saucedemo.page_object;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class DriverProvider {

    public static WebDriver driver = null;

    public static WebDriver get(){
        if(driver == null) {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https://www.saucedemo.com/");
        }
        return driver;
    }

    public static void quit(){
        driver.quit();
        driver = null;
    }
}
