package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.pt.Dada;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import junit.framework.Assert;
import pages.SrBarrigaHomePage;
import pages.SrBarrigaLoginPage;

public class LoginSrBarrigaSteps extends BaseSteps
{
    SrBarrigaLoginPage pageLogin = new SrBarrigaLoginPage();
    SrBarrigaHomePage pageHome = new SrBarrigaHomePage();

    @Dada("que eu estou na pagina de Login do Sr Barriga")
    public void que_eu_estou_na_pagina_de_login_do_sr_barriga()
    {
        pageLogin.abrir();
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
    }

    @Quando("eu clico em Entrar")
    public void eu_clico_em_entrar()
    {
        pageLogin.clickEntrar();
    }

    @Entao("o sistema exibe a mensagem: {string}")
    public void o_sistema_exibe_a_mensagem(String msgEsperada)
    {
        String msgTela = pageHome.pegarMsg();
        Assert.assertEquals(msgEsperada, msgTela);
    }
}
