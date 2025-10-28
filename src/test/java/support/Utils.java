package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runners.RunCucumberTest;

import java.time.Duration;
import java.util.Random;

public class Utils extends RunCucumberTest {


    // Metodo que recebe 2 parametros, um é o elemento a se esperar e o outro o tempo que vai esperar.
    public void waitElementBeClickable(By element, int time){
        // Instanciamos uma variavel da funcao WebDriverWait que recebe o driver e o tempo
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        // Espera Até (Condicao esperada.Elemento ser clicavel (parametro elemento))
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void waitElementBePresent(By element, int tempo) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public String getRandomEmail(){

        String email_init = "qazando_";
        String email_final = "@qazando.com.br";

        Random random = new Random();
        int min = 0;
        int max = 99999999;

        int result = random.nextInt(max-min) + min;

        return email_init + result + email_final;
    }

}
