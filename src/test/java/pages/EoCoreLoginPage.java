package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class EoCoreLoginPage extends BasePages
{
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/";
    private By campoUserName = By.name("username");
    private By campoSenha = By.name("password");
    private By btnLogin = By.id("btnLogin");

    public void abrir()
    {
        driver.get(url);
    }


    public void preencherUser(String userName)
    {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(campoUserName).sendKeys(userName);
    }

    public void preencherSenha(String senha)
    {
        driver.findElement(campoSenha).sendKeys(senha);
    }

    public void clickLogin()
    {
        driver.findElement(btnLogin).click();
    }
    public String pegarIdSenha()
    {
        return campoSenha.toString();
    }

}
