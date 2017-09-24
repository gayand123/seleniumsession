package com.orange.pages;

import com.orange.base.TestBase;
import com.orange.util.Elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends TestBase {
    //Define web elements
    @FindBy(xpath = "//a[text()='Logout']")
    WebElement btnLogOut;

    @FindBy(xpath = Elements.lblWelcome)
    WebElement lblWelcome;

    @FindBy (xpath = ".//*[@id='footer']/a")
    WebElement linkFooterMessage;

    // Define methods
    public String  checkWelcomeMessage(){
        return lblWelcome.getText();
    }
    public void checkLinkFooterMessage(){
        clickElement(linkFooterMessage);
    }


}
