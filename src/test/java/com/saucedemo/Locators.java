package com.saucedemo;

import org.openqa.selenium.By;

public class Locators {

    public By idlocator = By.id("root");
    public By classLocator = By.className("inventory_list");
    public By nameLocator = By.name("viewport");
    public By tagNameLocator = By.tagName("img");
    public By linktextLocator = By.linkText("LinkedIn");
    public By partiallinktextLocator = By.partialLinkText("Linked");

    public By xpathAttribute = By.xpath("//div[@id='header_container']");
    public By xpathText = By.xpath("(//button[text()='Add to cart'])[1]");
    public By xpathAttributeContainText = By.xpath("(//div[contains(@class,'price')])[4]");
    public By xpathContainText = By.xpath("(//button[contains(text(),'Add')])[2]");
    public By xpathAncestor = By.xpath("(//*[text()='Sauce Labs Bike Light']//ancestor::div)[1]");
    public By xpathFollowing = By.xpath("(//div[@id='header_container']//descendant::div)[1]");
    public By xpathParent = By.xpath("(//*[text()='Add to cart']//parent::div)[1]");
    public By xpathPreceding = By.xpath("(//div[@id='header_container']//preceding::div)[1]");
    public By xpathConditionAnd = By.xpath("//img[@class='inventory_item_img' and @alt='Sauce Labs Backpack']");

    public By cssClass = By.cssSelector(".title");
    public By cssTwoClasses = By.cssSelector(".btn.btn_primary");
    public By cssTwoClassesDescendant = By.cssSelector(".header_secondary_container .peek");
    public By cssId = By.cssSelector("#header_container");
    public By cssTagname = By.cssSelector("button");
    public By cssTagnameClass = By.cssSelector("div.peek");
    public By cssAttributeEquals = By.cssSelector("[class='shopping_cart_link']");
    public By cssAttributeTilde = By.cssSelector("[alt~='Swag']");
    public By cssAttributeVerticalBar = By.cssSelector("[class|='peek']");
    public By cssAttributeCaret = By.cssSelector("img[alt^=Sauce]");
    public By cssAttributeDollar = By.cssSelector("img[alt$=Light]");
    public By cssAttributeStar = By.cssSelector("img[alt*=Bike]");

}
