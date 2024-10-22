package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class SrBarrigaLoginPage extends BasePages
{
    private String url = "https://seubarriga.wcaquino.me";
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("senha");
    private By btnEntrar = By.cssSelector("form > button.btn.btn-primary");

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
