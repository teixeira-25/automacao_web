package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class AlertasComponentePage extends BasePages
{
    private By msgAlert = By.xpath("/html/body/div[1]/div[1]");

    public String pegarMsg()
    {
        return driver.findElement(msgAlert).getText();
    }
}
