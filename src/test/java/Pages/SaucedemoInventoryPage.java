package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaucedemoInventoryPage extends PageObject {
    @FindBy(className = "title")
    private WebElement product;


    //************** Methods ***************

    public String getProductText(){
        return product.getText();
    }
}
