package com.telran.wikipedia.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase{
    public NavigationHelper(AppiumDriver driver) {
        super(driver);
    }

    public void favorites() {
        waitForElementandTap(By.xpath("//*[@content-desc='My lists']"),15);
        waitForElementandTap(By.id("item_title"),15);
    }
}
