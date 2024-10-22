package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SrBarrigaLoginPage
{
    private String url = "https://seubarriga.wcaquino.me";
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("senha");
    private By btnEntrar = By.cssSelector("form > button.btn.btn-primary");

    private WebDriver driver;

    public SrBarrigaLoginPage(WebDriver navegador)
    {
        this.driver = navegador;
    }

    public void abrir()
    {
        driver.get(url);
    }

    public void preencherEmail(String email)
    {
        driver.findElement(campoEmail).sendKeys(email);
    }

    public void preencherSenha(String senha)
    {
        driver.findElement(campoSenha).sendKeys(senha);
    }

    public void clickEntrar()
    {
        driver.findElement(btnEntrar).click();
    }
}
