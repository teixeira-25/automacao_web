package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class EoCoreHomePage extends BasePages
{
    private By btnLogout = By.xpath("/html/body/nav/ul/li/a");

    public void EstouNaHome()
    {
        driver.findElement(btnLogout);
    }
}
