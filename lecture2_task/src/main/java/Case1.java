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
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='email']")));
        driver.findElement(By.cssSelector("[name='email']")).sendKeys("webinar.test@gmail.com");
        driver.findElement(By.cssSelector("[name='passwd']")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println("Login successful");
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.id("employee_infos")));
        driver.findElement(By.id("employee_infos")).click();
        driver.findElement(By.id("header_logout")).click();
        System.out.println("Logout successful");

    }
}
