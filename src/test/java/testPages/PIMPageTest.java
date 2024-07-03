package testPages;

import browser.Browser;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = TestListener.class)
public class PIMPageTest {
    @Test
    public void pimPageValidation(){
        Browser browser = new Browser();
        browser.startBrowser()
                .logInWithValidCredential("Admin", "admin123")
                .clickPIMBtn()
                .validatePIMPage();
    }

    @Test
    public void addEmployee(){
        Browser browser = new Browser();
        browser.startBrowser().logInWithValidCredential("Admin", "admin123").clickPIMBtn()
                .addEmployee();

    }
}
