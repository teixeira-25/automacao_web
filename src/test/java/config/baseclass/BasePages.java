package config.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePages
{
    protected WebDriver driver;

    public BasePages()
    {
        this.driver = BaseSteps.browser;
    }

}
