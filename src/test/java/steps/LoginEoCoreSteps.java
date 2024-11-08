package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.pt.*;
import pages.AlertasComponentePage;
import pages.EoCoreHomePage;
import pages.EoCoreLoginPage;

public class LoginEoCoreSteps extends BaseSteps
{
    EoCoreLoginPage pageLogin = new EoCoreLoginPage();
    EoCoreHomePage pageHome = new EoCoreHomePage();
    AlertasComponentePage componenteAlert = new AlertasComponentePage();

    @Dado("que o usuario esta na pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login()
    {
        pageLogin.abrir();
        screenshot();
    }


    @E("o usuario preenche na barra de username {string}")
    public void o_usuario_preenche_na_barra_de_username(String username)
    {
        pageLogin.preencherUser(username);
    }


    @E("o usuario preenche na barra de senha {string}")
    public void o_usuario_preenche_na_barra_de_senha_abc123(String senha)
    {
        pageLogin.preencherSenha(senha);
        screenshot();
    }

    @E("o usuario clica em login")
    public void o_usuario_clica_em_login()
    {
        pageLogin.clickLogin();
    }

    @Entao("o sistema libera o acesso a home")
    public void o_sistema_libera_o_acesso_a_home()
    {
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pageHome.EstouNaHome();
        screenshot();
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Entao("o sistema exibe a mensagem {string}")
    public void o_sistema_exibe_a_mensagem(String msg)
    {
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        componenteAlert.pegarMsg();
        screenshot();
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
