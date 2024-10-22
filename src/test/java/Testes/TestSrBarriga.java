package Testes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSrBarriga
{
    @Test
    public void teste() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://seubarriga.wcaquino.me");
        Thread.sleep(3000);
        driver.quit();
        driver = null;
    }
}
