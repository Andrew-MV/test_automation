import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Case1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",Case1.class.getResource("chromedriver1.exe").getPath());
        WebDriver driver = new ChromeDriver();
        WebDriverWait delay = new WebDriverWait(driver, 10);
        driver.get("http://clients.qatestlab.com/login");
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='loginv2']")));
        driver.findElement(By.cssSelector("[name='loginv2']")).sendKeys("0986198437");
        driver.findElement(By.cssSelector("[name='passwordv2']")).sendKeys("Andrew55");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='am-navbar-collapse']/ul/li[1]")));
        driver.findElement(By.xpath("//div[@id='am-navbar-collapse']/ul/li[1]")).click();
        driver.findElement(By.xpath("//div[@id='am-navbar-collapse']/ul/li[1]/ul/li[2]")).click();

    }
}
