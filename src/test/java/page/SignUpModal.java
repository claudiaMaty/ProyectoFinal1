package page;

import control.Button;
import control.Check;
import control.TextBox;
import org.openqa.selenium.By;

public class SignUpModal {

    //full name
    public TextBox fullNameTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    //email
    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    //password
    public TextBox pwdTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    //check
    public Check selectCheck = new Check(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    //boton
    public Button loginButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));

}
