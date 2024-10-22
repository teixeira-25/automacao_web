package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.*;

public class Hooks extends BaseSteps
{
    @Before
    public void antesDoTeste(Scenario _scenario)
    {
        scenario = _scenario;
    }

    @After
    public void depoisDoTeste()
    {
        if (scenario.isFailed())
            screenshot();
    }

    @Before("@reset")
    public void resetarBrowser()
    {
        fecharBrowser();
        abrirBrowser();
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
