package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MainPage;
import page.MenuSection;
import page.SettingModal;
import page.SignUpModal;

import java.util.Map;

public class MyChange {
    MainPage mainPage = new MainPage();
    SignUpModal loginModal = new SignUpModal();
    MenuSection menuSection= new MenuSection();
    SettingModal settingModal = new SettingModal();
    @When("yo cambio mi pass antiguo por uno nuevo")
    public void yoCambioMiPassAntiguoPorUnoNuevo(Map<String, String> credential) {
        menuSection.settingsButton.click();
        settingModal.oldPwdTxtBox.writeText(credential.get("pwd"));
        settingModal.newPwdTxtBox.writeText(credential.get("newPwd"));
        settingModal.okButton.click();
    }

    @And("salgo de la App Web")
    public void salgoDeLaAppWeb() {
        menuSection.logoutButton.click();
    }

    @Then("yo deberia realizar el login con el pass nuevo")
    public void yoDeberiaRealizarElLoginConElPassNuevo(Map<String, String> credential) {
        mainPage.loginButton.click();
        loginModal.emailTxtBox.writeText(credential.get("email"));
        loginModal.pwdTxtBox.writeText(credential.get("password"));
        loginModal.loginButton.click();
    }
}
