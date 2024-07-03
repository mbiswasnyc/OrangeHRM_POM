package testPages;

import browser.Browser;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(value = TestListener.class)
public class DashboardPageTest {

    @Test
    public void dashboardPageValidation(){
        Browser browser = new Browser();
        browser.startBrowser().logInWithValidCredential("Admin", "admin123").validateDashboardPage();
    }

    @Test
    public void dashboardPageValidation2(){
        Browser browser = new Browser();
        browser.startBrowser().logInWithValidCredential("Admin", "admin123").validateDashboardPageForScreenShot();
    }

}
