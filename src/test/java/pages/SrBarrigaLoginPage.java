package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class SrBarrigaLoginPage extends BasePages
{
    private String url = "https://id.churchofjesuschrist.org/oauth2/default/v1/authorize?response_type=code&client_id=0oa5b6krts7UNNkID357&redirect_uri=https%3A%2F%2Fwww.churchofjesuschrist.org%2Fservices%2Fplatform%2Fv4%2Flogin&scope=openid+profile&state=https%3A%2F%2Fwww.churchofjesuschrist.org%2Fmy-home%3Flang%3Dpor";
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
    public String pegarIdSenha()
    {
        return campoSenha.toString();
    }

    public void estouAqui()
    {
        driver.findElement(campoEmail);
        driver.findElement(campoSenha);
    }
}
