package MBAproject;

import Pages.LoginPage;
import Utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_01 extends BaseTest {


LoginPage loginPage = new LoginPage();

@Test
    public void Test1() throws InterruptedException {
    loginPage.login();
    Thread.sleep(2000);
    WebElement element = driver.findElement(By.xpath("//a[text()='Qafox.com']"));
    String expectedMessage = "Qafox.com";
    String actualMessage = element.getText();
    Assert.assertEquals(actualMessage,expectedMessage,"Texts are not equal!");
    Thread.sleep(2000);
    WebElement homepage = driver.findElement(By.linkText("Qafox.com"));
    homepage.click();

    WebElement canon= driver.findElement(By.linkText("Canon EOS 5D"));
    canon.click();
    Thread.sleep(3000);
    // I confirm that till this step everything is Ok and the test is running appropriately, But "Cannon EOS5D" could not be added to cart.
    // As a QA Tester I decided to prepare a BUG ticket with all steps to be solved
    //Importance: The responsible team should take in to consideration as a medium priority.

}





}
