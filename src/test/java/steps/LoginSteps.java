package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import runners.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginpage = new LoginPage(driver);

    @Given("que estou na tela de login")
    public void que_estou_na_tela_de_login() {
        loginpage.acessLoginScreen();
    }

    @Given("acesso o cadastro de usuario")
    public void acesso_o_cadastro_de_usuario() {
        loginpage.fillEmailCreate();
        loginpage.clickCreateAccountButton();
    }

    @Given("preencho email e senha")
    public void preencho_email_e_senha() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("clico em login")
    public void clico_em_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("o login e realizado")
    public void o_login_e_realizado() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("vejo a mensagem de login realizado com sucesso")
    public void vejo_a_mensagem_de_login_realizado_com_sucesso() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
