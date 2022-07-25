package session;

import browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class Session {
    // tener un objeto del mismo tipo como atributo
    private static Session session=null;
    private WebDriver browser;

    // tener el constructor privado
    private Session(){
        browser= FactoryBrowser.make("chrome").create();
    }
    // tener un metodo estatico publico que controle/retorne la instancia
    public static Session getInstance(){
        if (session == null)
            session= new Session();
        return session;
    }

    public void closeSession(){
        browser.quit();
        session=null;
    }

    public WebDriver getBrowser(){
        return browser;
    }
}
