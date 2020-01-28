package ua.ukrposhta;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {
    public ChromeDriver driver;
    @Before
    public void OpenMainPage(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zoho.com/");
    }
    @After
    public void Close(){
        driver.quit();
    }
}
