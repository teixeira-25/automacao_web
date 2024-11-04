package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.pt.Dada;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import junit.framework.Assert;
import pages.AlertasComponentePage;
import pages.SrBarrigaLoginPage;

public class LoginSrBarrigaSteps extends BaseSteps
{
    SrBarrigaLoginPage pageLogin = new SrBarrigaLoginPage();
    AlertasComponentePage componenteAlert = new AlertasComponentePage();

    @Dada("que estou na pagina de login")
    public void que_estou_na_pagina_de_login()
    {
        pageLogin.abrir();
        screenshot();
    }

    @Quando("o usuario preenche o campo do email {string}")
    public void o_usuario_preenche_o_campo_do_email(String email)
    {
        pageLogin.preencherEmail(email);
    }

    @Quando("preenche a senha {string}")
    public void preenche_a_senha(String senha)
    {
        pageLogin.preencherSenha(senha);
        screenshot();
    }

    @Quando("clica em entrar")
    public void clica_em_entrar()
    {
        screenshot();
        pageLogin.clickEntrar();
    }

    @Entao("o sistema exibe a mensagem {string}")
    public void o_sistema_exibe_a_mensagem(String msgEsperada)
    {
        String msgTela = componenteAlert.pegarMsg1();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(msgEsperada, msgTela);
        screenshot();
    }

    @E("o sistema exibe a segunda mensagem: {string}")
    public void o_sistema_exibe_a_mensagem_da_senha(String msgEsperada)
    {
        String msgTela = componenteAlert.pegarMsg2();
        Assert.assertEquals(msgEsperada, msgTela);
        screenshot();
    }

    @Entao("o sistema continua na pagina de login")
    public void oSistemaContinuaNaPaginaDeLogin()
    {
        pageLogin.estouAqui();
        screenshot();
    }
}
