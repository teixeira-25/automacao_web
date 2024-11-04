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

    @Dada("que eu estou na pagina de Login do Sr Barriga")
    public void que_eu_estou_na_pagina_de_login_do_sr_barriga()
    {
        pageLogin.abrir();
        screenshot();
    }

    @Quando("eu preencher o email {string}")
    public void eu_preencher_o_email(String email)
    {
        pageLogin.preencherEmail(email);
    }

    @Quando("eu preencher a senha {string}")
    public void eu_preencher_a_senha(String senha)
    {
        pageLogin.preencherSenha(senha);
        screenshot();
    }

    @Quando("eu clico em Entrar")
    public void eu_clico_em_entrar()
    {
        screenshot();
        pageLogin.clickEntrar();
    }

    @Entao("o sistema exibe a mensagem: {string}")
    public void o_sistema_exibe_a_mensagem(String msgEsperada)
    {
        String msgTela = componenteAlert.pegarMsg1();
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
