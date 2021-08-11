package com.saucedemo.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class CartPage extends BasePage{

    /**
     * @return Map where key is product name,
     * and value product price
     */

    public Map<String, String> getProductData() {

        WebElement productName = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
        String productNameText = productName.getText();
        WebElement productPrice = driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div.cart_item > div.cart_item_label > div.item_pricebar > div"));
        String productPriceText = productPrice.getText();

        return new HashMap<>();
    }
}
