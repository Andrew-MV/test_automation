import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

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
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        WebElement catalogue = driver.findElement(By.xpath("//ul[@class='menu']/li[4]"));
        Actions builder = new Actions(driver);
        builder.moveToElement(catalogue).build().perform();
        WebElement category = driver.findElement(By.xpath("//ul[@class='menu']/li[4]/ul/li[2]"));
        builder.click(category).build().perform();
        By locator1 = By.xpath("//div[@class='btn-toolbar']/ul/li[1]");
        delay.until(ExpectedConditions.visibilityOfElementLocated(locator1));
        driver.findElement(locator1).click();
        By locator2 = By.id("name_1");
        delay.until(ExpectedConditions.visibilityOfElementLocated(locator2));
        driver.findElement(locator2).sendKeys("category1");
        driver.findElement(By.id("category_form_submit_btn")).click();
        By locator3 = By.xpath("//div[@class='alert-success']");
        delay.until(ExpectedConditions.visibilityOfElementLocated(locator3));
        
        //System.out.println(driver.findElement(locator3).getText());
    }
}
