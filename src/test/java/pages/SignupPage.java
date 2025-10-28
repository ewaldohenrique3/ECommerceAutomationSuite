package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class SignupPage extends Utils {

    WebDriver driver;

    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectTitle(Integer type) {
        if (type == 1) {
            driver.findElement(titleM).click();
        } else {
            driver.findElement(titleF).click();
        }
    }
}