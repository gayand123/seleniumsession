package com.orange.tests;

import com.orange.base.TestBase;
import com.orange.pages.LandingPage;
import com.orange.util.ConfigFile;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingTest extends TestBase {
    @Test
    public void validateLandingPageElements() {
        userLogin();
        LandingPage landingpage = PageFactory.initElements(webDriver, LandingPage.class);
        Assert.assertEquals(landingpage.checkWelcomeMessage(), "Welcome " + ConfigFile.userName);
        landingpage.checkLinkFooterMessage();
    }
}
