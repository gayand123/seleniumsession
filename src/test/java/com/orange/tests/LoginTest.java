package com.orange.tests;

import com.orange.base.TestBase;
import com.orange.ddtexample.DDTExample;
import com.orange.pages.LoginPage;
import com.orange.util.ConfigFile;
import javafx.scene.layout.Priority;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    //Define Test Methods here
    @Test(priority = 4, enabled = false)
    public void loginWithValidCredentials() {
        System.out.println("hello");
        //access the login page
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        //login with valid credentials
        System.out.println("hello");
//        loginPage.login(ConfigFile.userName, ConfigFile.passWord);
        //verify welcome message
        Assert.assertEquals(loginPage.getMessage(), "Welcome " + ConfigFile.userName);
//        loginPage.clickLogOut();
    }

    @Test(priority = 2, enabled = false)
    public void loginWithInvalidUserName() {
        //access the login page
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        //login with valid credentials
        loginPage.login("", ConfigFile.passWord);
        //verify welcome message
        Assert.assertEquals(loginPage.getErrorMessage(), "Username cannot be empty");
    }

    @Test(priority = 3, enabled = false)
    public void loginWithInvalidPassword() {
        //access the login page
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        //login with valid credentials
        loginPage.login(ConfigFile.userName, "");
        //verify welcome message
        // Assert.assertEquals(loginPage.getErrorMessage(), "Username cannot be empty");
    }

    @Test (dataProvider = "usercredentials")
    public void testInvalidUserLogin(String userName,String passWord){
        //access the login page
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        //login with valid credentials
        loginPage.login(userName,passWord);
        loginPage.clickLogin();
    }
}
