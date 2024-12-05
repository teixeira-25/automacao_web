package pages;

import config.baseclass.BasePages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EoCoreFaturaPage extends BasePages
{
    private By avisoFaturaPage = new By.ByXPath("/html/body/section/div/header/h2");
    private By hotelName = new By.ByCssSelector("h4");
    private By  invoiceDates = new By.ByCssSelector("body > section > div > ul > li:nth-child(1)");
    private By  duoDates = new By.ByCssSelector("body > section > div > ul > li:nth-child(2)");
    private By  invoiceNumber = new By.ByCssSelector("h6");
    private By  bookingCode = new By.ByCssSelector("table:nth-child(8) > tbody > tr:nth-child(1) > td:nth-child(2)");
    private By  customerDetails = new By.ByCssSelector("div > div");

    public void estouNaFaturaPage()
    {
        driver.findElement(avisoFaturaPage);
    }
    public String gethotelName ()
    {
        return driver.findElement(hotelName).getText();
    }
    public String getinvoiceDates ()
    {
        return driver.findElement(invoiceDates).getText();
    }
    public String getduoDates ()
    {
        return driver.findElement(duoDates).getText();
    }
    public String getinvoiceNumber ()
    {
        return driver.findElement(invoiceNumber).getText();
    }
    public String getbookingCode ()
    {
        return driver.findElement(bookingCode).getText();
    }

    public String getcustomerDetails ()
    {
        return driver.findElement(customerDetails).getText().replaceAll("\n", " ");
    }
}