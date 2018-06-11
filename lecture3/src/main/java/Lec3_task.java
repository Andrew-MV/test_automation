import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lec3_task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",Lec3_task.class.getResource("chromedriver.exe").getPath());
        WebDriver driver = new ChromeDriver();
        WebDriverWait delay = new WebDriverWait(driver, 10);
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='email']")));
        driver.findElement(By.cssSelector("[name='email']")).sendKeys("webinar.test@gmail.com");
        driver.findElement(By.cssSelector("[name='passwd']")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
}
