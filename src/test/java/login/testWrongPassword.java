package login;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class testWrongPassword extends BaseTests {
    @Test
    public void testCorrectUserWrongPassword() throws InterruptedException {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setSetUserName("tomsmith");
        loginPage.setPasswordField("qwerty");
        loginPage.clickLoginButton();
        assertEquals("Your password is invalid!", "Your password is invalid!");
        Thread.sleep(5000);
    }

}
