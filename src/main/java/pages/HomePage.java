package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By infiniteScrollLink = By.linkText("Infinite Scroll");
    private By keyPressesLink = By.linkText("Key Presses");

    public HomePage (WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication (){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScrollPage (){
        driver.findElement(infiniteScrollLink).click();
        return new InfiniteScrollPage(driver);
    }
    public KeyPressesPage clickKeyPressesPAge (){
        driver.findElement(keyPressesLink).click();
        return new KeyPressesPage(driver);
    }
}
