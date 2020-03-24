package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("button");
    private By statusAlert = By.id("flash");

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void setSetUserName(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecurePageArea clickLoginButton() {
        driver.findElement(loginButton).click();
        return new SecurePageArea(driver);
    }

    public String getAlertText() {
        return driver.findElement(statusAlert).getText();
    }
}

