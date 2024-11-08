package steps;

import io.cucumber.java.pt.E;
import pages.EoCoreFaturaPage;
import pages.EoCoreHomePage;

public class FaturaEoCoreSteps
{
    EoCoreHomePage pageHome = new EoCoreHomePage();
    EoCoreFaturaPage faturaPage = new EoCoreFaturaPage();

    @E("o usuario clica para ver a fatura")
    public void o_usuario_clica_para_ver_a_fatura()
    {
        pageHome.clicarNaFatura();
    }

    @E("o sistema da acesso a pagina da fatura")
    public void o_sistema_da_acesso_a_pagina_da_fatura()
    {
        pageHome.trocarJanelas();
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        faturaPage.estouNaFaturaPage();
    }

    @E("as informacoes sao correspondentes")
    public void as_informacoes_sao_correspondentes()
    {

    }

}


