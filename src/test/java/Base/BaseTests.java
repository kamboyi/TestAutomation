package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

import java.util.concurrent.ExecutionException;

public class BaseTests {

    WebDriver driver;
    protected HomePage homePage;
    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
      driver.manage().window().fullscreen();

      homePage = new HomePage(driver);
    }
    @AfterTest
    public void tearDown()  {

        driver.quit();
    }


}
