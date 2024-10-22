package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.Before;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks extends BaseSteps
{
    @Before
    public void antesDoTeste(Scenario _scenario) {
        scenario = _scenario;
    }

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
