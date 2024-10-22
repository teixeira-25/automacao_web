package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks extends BaseSteps
{
    @BeforeAll
    public static void antesDeTudo()
    {
        abrirBrowser();
    }

    @AfterAll
    public static void depoisDeTudo()
    {
        fecharBrowser();
    }
}
