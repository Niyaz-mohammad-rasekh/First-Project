package Pages;

import Utilities.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LoginPage extends PageObject{
    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement account;
    @FindBy(xpath = "//a[text()='Login']")
    public WebElement login;

    @FindBy(css = "#input-email")
    private WebElement username;
    @FindBy(css = "#input-password")
    public WebElement password;
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    private WebElement loginButton2;
    @FindBy(xpath = "//a[text()='Qafox.com']")
    public WebElement varify;


    public void login() throws InterruptedException {

        account.click();
        login.click();

        username.sendKeys(ConfigReader.getpProperties("username"));
        password.sendKeys(ConfigReader.getpProperties("password"));
        Thread.sleep(2000);
        loginButton2.click();

    }


}
