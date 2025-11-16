package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {

    WebDriver driver; //criar a variavel "driver" e armazena nela o webdriver(navegador)

    private By email_create_field = By.id("email_create");
    private By create_email_button = By.id("SubmitCreate");


    public LoginPage(WebDriver driver) // → recebe o driver.
         {this.driver = driver; // → guarda o driver dentro da classe. para todos os metodos da login page poderem usar o navegador aberto.
    }

    public void acessLoginScreen(){
        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        waitElementBePresent(email_create_field, 10);
    }

    public void fillEmailCreate(){
        driver.findElement(email_create_field).sendKeys(getRandomEmail());

    }

    public void clickCreateAccountButton(){
        driver.findElement(create_email_button).click();
    }
}