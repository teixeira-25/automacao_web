package scenarios;

import config.baseclass.BaseSteps;
import org.junit.jupiter.api.*;
import pages.SrBarrigaHomePage;
import pages.SrBarrigaLoginPage;

public class TestSrBarriga extends BaseSteps
{
    SrBarrigaLoginPage login = new SrBarrigaLoginPage();
    SrBarrigaHomePage home = new SrBarrigaHomePage();

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


    @BeforeAll
    public static void antes()
    {
        abrirBrowser();
    }

    @AfterAll
    public static void depois()
    {
        fecharBrowser();
    }
}
