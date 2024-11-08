package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class EoCoreHomePage extends BasePages
{
    private By btnLogout = By.xpath("/html/body/nav/ul/li/a");
    private By btnFaturas = By.xpath("/html/body/section/div/div[2]/div[5]/a");

    public void EstouNaHome()
    {
        driver.findElement(btnLogout);
    }

    public void clicarNaFatura()
    {
        driver.findElement(btnFaturas).click();
    }

    public void trocarJanelas()
    {
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        assertTrue(driver.findElement(By.xpath("/html/body/section/div/table[1]")).isDisplayed());
    }
}