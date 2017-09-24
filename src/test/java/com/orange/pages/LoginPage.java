package com.orange.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    //Define web element sin Login Page
    @FindBy(id = "txtUsername")
    WebElement txtUserName;

    @FindBy(id = "txtPassword")
    WebElement txtPassword;

    @FindBy(id = "btnLogin")
    WebElement btnLogin;

    @FindBy(xpath = ".//*[@id='welcome']")
    WebElement lblWelcome;

    @FindBy(xpath = "//a[@href='/index.php/auth/logout']")
    WebElement btnLogOut;

    @FindBy(xpath = ".//*[@id='spanMessage']")
    WebElement lblErrorMessage;

    //Define Methods in Login Page
    public void typeUserName(String userName) {
        txtUserName.sendKeys(userName);
    }

    public void typePassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public void login(String userName, String password) {
        typeUserName(userName);
        typePassword(password);
        clickLogin();
    }

    public String getMessage() {
        return lblWelcome.getText();
    }

    public String getErrorMessage() {
        return lblErrorMessage.getText();
    }

    public void clickLogOut() {
        btnLogOut.click();
    }
}

