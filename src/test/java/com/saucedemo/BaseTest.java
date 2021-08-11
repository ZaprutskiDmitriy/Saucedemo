package com.saucedemo;

import com.saucedemo.page_object.DriverProvider;
import org.testng.annotations.AfterTest;

public class BaseTest {
    @AfterTest
    public void afterTest() {
        DriverProvider.quit();
    }

}
