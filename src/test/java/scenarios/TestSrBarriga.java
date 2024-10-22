package scenarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.SrBarrigaHomePage;
import pages.SrBarrigaLoginPage;
import steps.Hooks;

public class TestSrBarriga extends Hooks
{
    SrBarrigaLoginPage login = new SrBarrigaLoginPage(driver);
    SrBarrigaHomePage home = new SrBarrigaHomePage(driver);

    @Test
    public void teste01() throws InterruptedException
    {
        login.abrir();
        login.preencherEmail("ytalo@teste.local");
        login.preencherSenha("1234");
        login.clickEntrar();
        Thread.sleep(2000);
        String mensagemTela = home.pegarMsg();
        Assertions.assertEquals("Bem vindo, Ytalo Pegador!", mensagemTela);
        Thread.sleep(2000);
    }
}
