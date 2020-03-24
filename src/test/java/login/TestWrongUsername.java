package login;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class TestWrongUsername extends BaseTests {

    @Test
    public void testWrongUser() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setSetUserName("tomsmith@gmail.com");
        loginPage.setPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        assertEquals("Your username is invalid!", "Your username is invalid!");

    }
}

