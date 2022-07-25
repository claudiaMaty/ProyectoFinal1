package page;

import control.Button;
import control.Check;
import control.TextBox;
import org.openqa.selenium.By;

public class SettingModal {

     //Old password
    public TextBox oldPwdTxtBox = new TextBox(By.id("TextPwOld"));
    //New password
    public TextBox newPwdTxtBox = new TextBox(By.id("TextPwNew"));

    //boton ok
    public Button okButton = new Button(By.xpath("//span[text()='Ok']"));
}
