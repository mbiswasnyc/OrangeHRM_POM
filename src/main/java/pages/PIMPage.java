package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PIMPage {
    @FindBy(css="div[class='oxd-topbar-header-title']>span>h6") private WebElement pimHeaderText;

    @FindBy(xpath = "//a[contains(text(),'Add Employee')]") private WebElement addEmployeeBtn;
    @FindBy(css = "[name='firstName']") private WebElement firstNameField;
    @FindBy(css = "[name='lastName']") private WebElement lastNameField;
    @FindBy(css = "input[wfd-id='id5']") private WebElement  employeeIDField;

    @FindBy(css = "div[class='oxd-switch-wrapper']>label>span") private WebElement createLoginDetailsBtn;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]") private WebElement userNameField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]") private WebElement passwordField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]/input[1]") private WebElement confirmPasswordField;
    @FindBy(css = "button[type='submit']") private WebElement saveBtn;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h6[1]") private WebElement nameOnEmployeeList;

    public void validatePIMPage(){
        Assert.assertEquals(pimHeaderText.getText(), "PIM");
    }

    String firstName = "Abc";
    String lastName = "Xyz";
    String employeeID = "123456";
    String userName = "Abcxyz";
    String password = "123abcXyz";

    public void addEmployee(){
        addEmployeeBtn.click();
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        employeeIDField.clear();
        employeeIDField.sendKeys(employeeID);
        createLoginDetailsBtn.click();
        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
        saveBtn.click();
        //Assert.assertEquals(nameOnEmployeeList.getText(),firstName+" "+lastName);
    }

}
