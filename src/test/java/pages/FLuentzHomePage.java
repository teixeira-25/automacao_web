package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class FLuentzHomePage extends BasePages
{
    private By btnHome = By.xpath("//*[@id=\"top_menu\"]/div/button");

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
