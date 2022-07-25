package testUI;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.MainPage;
import page.MenuSection;
import page.SettingModal;
import page.SignUpModal;
import session.Session;

public class SeleniumPageTest {
    MainPage mainPage = new MainPage();
    SignUpModal loginModal = new SignUpModal();
    MenuSection menuSection= new MenuSection();
    SettingModal settingModal = new SettingModal();

    Aleatorios nombresAleatorios = new Aleatorios();

    @BeforeEach
    public void goWebApp(){
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }
    @AfterEach
    public void closeWebApp(){
        Session.getInstance().closeSession();
    }

    @Test
    public void verifyLoginIsSuccessfully(){
        String fullName = nombresAleatorios.nombreAleatori();
        String email = nombresAleatorios.emailAleatorio(fullName);
        String pwd = "1234";
        String newPwd = "123";

        mainPage.signupButton.click();
        loginModal.fullNameTxtBox.writeText(fullName);
        loginModal.emailTxtBox.writeText(email);
        loginModal.pwdTxtBox.writeText(pwd);
        loginModal.selectCheck.click();
        loginModal.loginButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(), "ERROR el login fallo");

        menuSection.settingsButton.click();
        settingModal.oldPwdTxtBox.writeText(pwd);
        settingModal.newPwdTxtBox.writeText(newPwd);
        settingModal.okButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),"ERROR el login fallo");
       }
}
