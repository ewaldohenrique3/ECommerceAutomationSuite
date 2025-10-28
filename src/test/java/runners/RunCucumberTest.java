package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)  // Define o Cucumber como o runner
@CucumberOptions(
        features = "src/test/resources/features",  // Caminho para os arquivos de feature
        glue = "steps",  // Caminho para as classes de step definitions
        tags = "",
        // Plugins para relatórios
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/cucumberReport.html" },
        monochrome = true  // Exibe os resultados de maneira mais legível

)
public class RunCucumberTest {

    public static WebDriver driver;

    @BeforeClass
    public static void start(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void stop() {
        driver.quit();
    }
}
