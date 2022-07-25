package page;

import control.Button;
import org.openqa.selenium.By;

public class MenuSection {
    // Botón  Logout
    public Button logoutButton = new Button(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));
    // Botón  Settings
    public Button settingsButton = new Button(By.xpath("//a[@href='javascript:OpenSettingsDialog();']"));

}
