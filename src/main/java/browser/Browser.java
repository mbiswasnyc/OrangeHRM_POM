package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LandingPage;

import java.time.Duration;

public class Browser {
    static WebDriver driver;

    public LandingPage startBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        return PageFactory.initElements(driver, LandingPage.class);
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
