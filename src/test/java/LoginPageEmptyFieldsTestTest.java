// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LoginPageEmptyFieldsTestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void loginPageEmptyFieldsTest() {
    driver.get("https://test-1.365pronto.com/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    {
      WebElement element = driver.findElement(By.cssSelector(".mat-stroked-button:nth-child(1) > .mat-button-wrapper"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.xpath("//span[contains(.,\'Log in\')]")).click();
    driver.findElement(By.cssSelector(".mat-button-wrapper")).click();
    assertThat(driver.findElement(By.id("mat-error-0")).getText(), is(" Please enter an email address "));
    assertThat(driver.findElement(By.id("mat-error-1")).getText(), is("Please enter a password"));
  }
}