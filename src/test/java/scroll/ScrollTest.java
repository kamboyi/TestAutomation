package scroll;

import Base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;



public class ScrollTest extends BaseTests {
    WebDriver driver;
    int scroll=2;
    @Test
    public void scrollDownPage(){
        homePage.clickInfiniteScrollPage().scrollToBottom(100);
    }
}


