package Pages;


import Utilities.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaucedemoLoginPage extends PageObject {

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(tagName = "h3")
    private WebElement errorMessage;

    //*********** Methods ****************

    public boolean isLoginButtonDisplayed() {
        return loginButton.isDisplayed();
    }

    public void loginMethod() {
      username.sendKeys(ConfigReader.getpProperties("username"));
      password.sendKeys(ConfigReader.getpProperties("password"));
      loginButton.click();
    }

    public void loginManipulate(String user, String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
    }

    public String getErrorMessageText(){
        return errorMessage.getText();
    }
}
