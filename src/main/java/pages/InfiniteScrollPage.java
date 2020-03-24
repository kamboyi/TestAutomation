package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage<bottomPage> {

    private WebDriver driver;
    By textBlocks = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        this.driver=driver;
    }

    public void scrollToBottom(int index) {
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (scrollUpPage() < index) {
            ((JavascriptExecutor) jsExecutor).executeScript(script);
        }
    }
        private int scrollUpPage(){
            return driver.findElements(textBlocks).size();
        }



}