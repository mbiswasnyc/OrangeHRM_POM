package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LandingPage {

    @FindBy(css ="[name='username']") private WebElement userNameField;
    @FindBy(name= "password") private WebElement passwordField;
    @FindBy(css="[type='submit']") private WebElement logInBtn;
    @FindBy(css="div[class='oxd-alert-content oxd-alert-content--error']>p") private WebElement errorMassage;

    public DashboardPage logInWithValidCredential(String userName, String password){
        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        logInBtn.click();
        return PageFactory.initElements(Browser.getDriver(), DashboardPage.class);
    }
    public void logInWithInvalidCredential(String userName, String password){
        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        logInBtn.click();
        Assert.assertEquals(errorMassage.getText(), "Invalid credentials");
    }


}
