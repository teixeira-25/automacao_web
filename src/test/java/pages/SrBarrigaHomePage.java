package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class SrBarrigaHomePage extends BasePages
{
    private By msgAlert = By.cssSelector("body > div.alert.alert-success");


    public String pegarMsg()
    {
        return driver.findElement(msgAlert).getText();
    }
}
