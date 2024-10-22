package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SrBarrigaHomePage
{
    private By msgAlert = By.cssSelector("body > div.alert.alert-success");

    private WebDriver driver;

    public SrBarrigaHomePage(WebDriver navegador)
    {
        this.driver = navegador;
    }

    public String pegarMsg()
    {
        return driver.findElement(msgAlert).getText();
    }
}
