package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class EoCoreFaturaPage extends BasePages
{
    private By avisoFaturaPage = new By.ByXPath("/html/body/section/div/header/h2");

    public void estouNaFaturaPage()
    {
        driver.findElement(avisoFaturaPage);
    }
}