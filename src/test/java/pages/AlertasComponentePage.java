package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class AlertasComponentePage extends BasePages
{
    private By msgAlert1 = By.id("toast_notification");
    //private By msgAlert2 = By.xpath("/html/body/div[2]");

    public String pegarMsg1()
    {
        return driver.findElement(msgAlert1).getText();
    }
    //public String pegarMsg2()
    //{
    //    return driver.findElement(msgAlert2).getText();
    //}
}
