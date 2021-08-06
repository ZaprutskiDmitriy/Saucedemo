package com.saucedemo.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class CartPage extends BasePage{

    /**
     * @return Map where key is product name,
     * and value is price
     * */

    public Map<String, String> getProductData(){
        WebElement productName = driver.findElement(By.cssSelector(".inventory_item_name"));
        WebElement productPrice = driver.findElement(By.cssSelector(".inventory_item_price"));
        String productNameText = productName.getText();
        String productPriceText = productPrice.getText();
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(productNameText, productPriceText);
        return hashMap;

    }

}
