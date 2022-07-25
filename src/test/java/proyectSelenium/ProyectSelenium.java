package proyectSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ProyectSelenium {

    ChromeDriver driver;
    @BeforeEach
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();

        // implicit wait --> generico
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("http://todo.ly/");
    }

    @AfterEach
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        //cerrar navegador
        driver.quit();
    }
    @Test
    public void verifyTheLoginSuccessfully(){

        // click boton login
        driver.findElement(By.xpath("//img[@src='/Images/design/pagesignup.png']")).click();
        //full name
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName")).sendKeys("claudia5");
        // escribir email
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail")).sendKeys("claudia5@hotmail.com");
        //escribir password
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword")).sendKeys("1234");
        //check
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms")).click();
        // click boton login
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_ButtonSignup")).click();

        // verificacion

        Assertions.assertTrue(driver.findElement(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).isDisplayed(),
                "ERROR, el usuario no pudo iniciar session");

        // click boton Settings
        driver.findElement(By.xpath("//a[@href='javascript:OpenSettingsDialog();']")).click();
        //escribir Old Password
        driver.findElement(By.id("TextPwOld")).sendKeys("1234");
        //escribir New Password
        driver.findElement(By.id("TextPwNew")).sendKeys("123");
        // click boton login
        driver.findElement(By.xpath("//span[text()='Ok']")).click();

        // verificacion

        Assertions.assertTrue(driver.findElement(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).isDisplayed(),
                "ERROR, el usuario no pudo iniciar session");

    }

}
