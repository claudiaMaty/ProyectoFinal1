package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import page.SignUpModal;
import session.Session;

import java.util.Map;

public class MySignup {
    MainPage mainPage = new MainPage();
    SignUpModal signUpModal = new SignUpModal();
    MenuSection menuSection= new MenuSection();

    @Given("la pagina {string} este abierta")
    public void laPaginaEsteAbierta(String url) {
        Session.getInstance().getBrowser().get(url);
    }
    @When("yo quiero realizar un registro")
    public void yoQuieroRealizarUnRegistro(Map<String,String> credential) {
        mainPage.signupButton.click();
        signUpModal.fullNameTxtBox.writeText(credential.get("email"));
        signUpModal.emailTxtBox.writeText(credential.get("email"));
        signUpModal.pwdTxtBox.writeText(credential.get("password"));
        signUpModal.selectCheck.click();
        signUpModal.loginButton.click();
    }
    @Then("yo deberia ingresar a la app web")
    public void yoDeberiaIngresarALaAppWeb() {
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR el login fallo");
    }
}
