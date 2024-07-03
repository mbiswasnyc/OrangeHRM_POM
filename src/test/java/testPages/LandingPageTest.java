package testPages;

import browser.Browser;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(value = TestListener.class)
public class LandingPageTest {

    @Test
    public void logInWithInvalidCredentials1(){
        Browser browser = new Browser();
        browser.startBrowser().logInWithInvalidCredential("Admin", "admin");
    }
    @Test
    public void logInWithInvalidCredentials2(){
        Browser browser = new Browser();
        browser.startBrowser().logInWithInvalidCredential("Adminx", "admin123");
    }
    @Test
    public void logInWithInvalidCredentials3(){
        Browser browser = new Browser();
        browser.startBrowser().logInWithInvalidCredential("Adminx", "admin");
    }

}
