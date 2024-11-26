package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
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

    @Entao("a pagina de envoice mostra no campo de Hotel name {string}")
    public void a_pagina_de_envoice_mostra_no_campo_de_hotel_name(String _hotelName)
    {
        String textoTela = faturaPage.gethotelName();
        Assert.assertEquals(_hotelName,textoTela);
    }

    @Entao("a pagina de envoice mostra no campo de Invoice Date {string}")
    public void a_pagina_de_envoice_mostra_no_campo_de_invoice_date(String _invoiceDates)
    {
        String textoTela = faturaPage.getinvoiceDates();
        Assert.assertEquals(_invoiceDates,textoTela);
    }
    @Entao("a pagina de envoice mostra no campo de Due Date {string}")
    public void a_pagina_de_envoice_mostra_no_campo_de_due_date(String _duoDates)
    {
        String textoTela = faturaPage.getduoDates();
        Assert.assertEquals(_duoDates,textoTela);
    }
    @Entao("a pagina de envoice mostra no campo de Invoice Number {string}")
    public void a_pagina_de_envoice_mostra_no_campo_de_invoice_number(String _invoiceNumber)
    {
        String textoTela = faturaPage.getinvoiceNumber();
        Assert.assertEquals(_invoiceNumber,textoTela);
    }
    @Entao("a pagina de envoice mostra no campo de Booking Code {string}")
    public void a_pagina_de_envoice_mostra_no_campo_de_booking_code(String _bookingCode)
    {
        String textoTela = faturaPage.getbookingCode();
        Assert.assertEquals(_bookingCode,textoTela);
    }
    @Entao("a pagina de envoice mostra no campo de Customer Details {string}")
    public void a_pagina_de_envoice_mostra_no_campo_de_customer_details(String _customerDetails)
    {
        String textoTela = faturaPage.getcustomerDetails();
        Assert.assertEquals(_customerDetails,textoTela);
    }
    @Entao("a pagina de envoice mostra no campo de Room {string}")
    public void a_pagina_de_envoice_mostra_no_campo_de_room(String string)
    {

    }
    @Entao("a pagina de envoice mostra no campo de Check In {string}")
    public void a_pagina_de_envoice_mostra_no_campo_de_check_in(String string)
    {

    }
    @Entao("a pagina de envoice mostra no campo de Check Out {string}")
    public void a_pagina_de_envoice_mostra_no_campo_de_check_out(String string)
    {

    }
    @Entao("a pagina de envoice mostra no campo de Total Stay Count {string}")
    public void a_pagina_de_envoice_mostra_no_campo_de_total_stay_count(String string)
    {

    }
    @Entao("a pagina de envoice mostra no campo de Total Stay Amount {string}")
    public void a_pagina_de_envoice_mostra_no_campo_de_total_stay_amount(String string)
    {

    }
    @Entao("a pagina de envoice mostra no campo de Deposit Now {string}")
    public void a_pagina_de_envoice_mostra_no_campo_de_deposit_now(String string)
    {

    }
    @Entao("a pagina de envoice mostra no campo de Tax & VAT {string}")
    public void a_pagina_de_envoice_mostra_no_campo_de_tax_vat(String string)
    {

    }
    @Entao("a pagina de envoice mostra no campo de Total Amount {string}")
    public void a_pagina_de_envoice_mostra_no_campo_de_total_amount(String string)
    {

    }

}


