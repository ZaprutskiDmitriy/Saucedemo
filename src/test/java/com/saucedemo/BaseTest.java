package com.saucedemo;

import com.saucedemo.page_object.DriverProvider;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class BaseTest {
    @AfterMethod
    public void afterTest() {
        DriverProvider.quit();
    }

    @Attachment(value = "screenshot", type = "image/png")
    public byte[] takeScreenshot() {
        WebDriver driver = DriverProvider.get();
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
