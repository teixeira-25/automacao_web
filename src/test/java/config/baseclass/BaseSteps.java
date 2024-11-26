package config.baseclass;

import config.support.Navegador;
import io.cucumber.java.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseSteps
{
    public static WebDriver browser;
    public static Scenario scenario;
    public static Actions actions;


    public static void abrirBrowser()
    {
        if (browser != null) return;
        browser = Navegador.getNavegador();
    }

    public static void fecharBrowser()
    {
        browser.quit();
        browser = null;
    }

    public static void screenshot() {
        try {
            String dataHora = (new SimpleDateFormat("yyyy-MM-dd_-_HH-mm-ss-SSS")).format(new Date());
            byte[] screenshot = ((TakesScreenshot) BaseSteps.browser).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", dataHora + "_screenshot.png");
        } catch (ClassCastException cce) {
            cce.printStackTrace();
        }
    }



}
