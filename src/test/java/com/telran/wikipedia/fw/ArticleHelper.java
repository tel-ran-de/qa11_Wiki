package com.telran.wikipedia.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class ArticleHelper extends HelperBase{
    public ArticleHelper(AppiumDriver driver) {
        super(driver);
    }

    public void search() {
        tap(By.id("search_container"));
        type(By.id("search_src_text"), "TCP/IP");
        waitForElementandTap(By.id("page_list_item_container"),15);
        String title = driver.findElement(By.id("view_page_title_text")).getText();
        System.out.println(title);
    }
}
