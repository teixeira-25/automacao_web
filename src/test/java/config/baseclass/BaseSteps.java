package config.baseclass;

import config.Navegador;
import org.openqa.selenium.WebDriver;

public class BaseSteps
{
    public static WebDriver browser;

    public static void abrirBrowser()
    {
        browser = Navegador.getNavegador();
    }

    public static void fecharBrowser()
    {
        browser.quit();
        browser = null;
    }
}
