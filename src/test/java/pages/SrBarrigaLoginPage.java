package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class SrBarrigaLoginPage extends BasePages
{
    private String url = "http://teacherz.dev.hill/signin";
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("pass");
    private By btnEntrar = By.id("login");
    private By btnHome = By.xpath("//*[@id=\"top_menu\"]/div/button");

    public void abrir()
    {
        driver.get(url);
    }

    public void preencherEmail(String email)
    {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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
    public String pegarIdSenha()
    {
        return campoSenha.toString();
    }

    public void estouAqui()
    {
        driver.findElement(campoEmail);
        driver.findElement(campoSenha);
    }

    public void verSeEstaHome()
    {
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(btnHome);
    }
}
