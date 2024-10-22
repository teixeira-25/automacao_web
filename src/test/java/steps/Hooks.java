package steps;

import config.Navegador;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class Hooks
{
    public static WebDriver driver;

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
}
