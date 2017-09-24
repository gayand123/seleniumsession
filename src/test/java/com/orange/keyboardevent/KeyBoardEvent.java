package com.orange.keyboardevent;

import com.orange.base.TestBase;
import com.orange.util.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoardEvent extends TestBase {
    @Test
    public void keyBoardEventExample() {
        WebElement txtUsername = webDriver.findElement(By.xpath(Elements.txtUserName));
        //Create Action Builder Class
        Actions builder = new Actions(webDriver);
        // Build the action
        Action seriesofActions = builder
                .moveToElement(txtUsername)
                .keyDown(txtUsername, Keys.SHIFT)
                .sendKeys("admin")
                .keyUp(txtUsername, Keys.SHIFT)
                .build();
        // perform
        seriesofActions.perform();
    }
}
