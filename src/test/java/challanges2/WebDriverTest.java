package challanges2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebDriverTest {

    WebDriver driver;

    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "/Users/hannabaronina/Documents/automation_drivers/chromedriver4");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
        dropdown.selectByVisibleText("Amazon Devices");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("test");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.id("glow-ingress-line1")).click();
        driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("94040");
        driver.findElement(By.id("GLUXZipUpdate")).click();
        driver.findElement(By.id("a-autoid-3")).click();
        WebElement first = new WebDriverWait(driver, Duration.ofSeconds(10)).until
                (ExpectedConditions.elementToBeClickable(By.id("glow-ingress-block")));
        String postalCode = driver.findElement(By.id("glow-ingress-block")).getText();
        String expectedPostalCode = "Deliver to\n" +
                "Mountain ... 94040\u200C";
        Assert.assertEquals(expectedPostalCode, postalCode);


    }

}
