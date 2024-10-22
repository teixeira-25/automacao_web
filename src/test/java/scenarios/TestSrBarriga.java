package scenarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SrBarrigaHomePage;
import pages.SrBarrigaLoginPage;
import steps.Hooks;

public class TestSrBarriga extends Hooks
{
    SrBarrigaLoginPage login = new SrBarrigaLoginPage(driver);
    SrBarrigaHomePage home = new SrBarrigaHomePage(driver);

    @Test
    @DisplayName("Cenario: Login com sucesso")
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

    /**
     *
     * Cenario: Email valido de usuario nao cadastrado
     * Cenario: Email em branco e Senha preenchida
     * Cenario: Email correto e Senha errada
     * Cenario: Email correto e Senha e branco
     * Cenario: Email e senha em branco
     * Cenario: Email invalido
     *
     * */
}
