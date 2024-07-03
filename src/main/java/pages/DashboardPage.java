package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage {

    @FindBy(css="div[class='oxd-topbar-header-title']>span>h6") private WebElement headerText;
    @FindBy(css="ul[class='oxd-main-menu']>li:nth-child(2)>a") private WebElement PIMBtn;

    public void validateDashboardPage(){
        Assert.assertEquals(headerText.getText(),"Dashboard");
    }

    public void validateDashboardPageForScreenShot(){
        Assert.assertEquals(headerText.getText(),"NoName");
    }

    public PIMPage clickPIMBtn(){
        PIMBtn.click();
        return PageFactory.initElements(Browser.getDriver(), PIMPage.class);
    }
}
