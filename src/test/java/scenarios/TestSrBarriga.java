package scenarios;

import config.Navegador;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestSrBarriga
{
    static WebDriver driver;

    @BeforeAll
    public static void antes()
    {
        driver = Navegador.getNavegador();
    }

    @AfterAll
    public static void depois()
    {
        driver.quit();
        driver = null;
    }

    @Test
    public void teste() throws InterruptedException
    {
        driver.get("https://seubarriga.wcaquino.me");
        Thread.sleep(2000);
    }

    @Test
    public void teste02() throws InterruptedException
    {
        driver.get("https://seubarriga.wcaquino.me");
        Thread.sleep(2000);
    }
}
