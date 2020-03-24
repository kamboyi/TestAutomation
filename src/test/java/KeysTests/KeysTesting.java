package KeysTests;

import Base.BaseTests;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeysTesting extends BaseTests {

    @Test
    public void testBACKSPACEbutton(){
       KeyPressesPage keyPressesPage = homePage.clickKeyPressesPAge();
       keyPressesPage.enterText("A"+ Keys.BACK_SPACE);
       assertEquals( keyPressesPage.getResult(),"You entered: BACK_SPACE");
    }
    @Test
    public void testESCAPEButton() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPressesPAge();
        keyPressesPage.enterText("A" + Keys.ESCAPE);
        assertEquals(keyPressesPage.getResult(), "You entered: ESCAPE");

    }
    @Test
    public void testSPACEButton() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPressesPAge();
        keyPressesPage.enterText("A" + Keys.SPACE);
        assertEquals(keyPressesPage.getResult(), "You entered: SPACE");
    }
    @Test
    public void testF1Button() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPressesPAge();
        keyPressesPage.enterText("A" + Keys.F1);
        assertEquals(keyPressesPage.getResult(), "You entered: F1");
    }
}
