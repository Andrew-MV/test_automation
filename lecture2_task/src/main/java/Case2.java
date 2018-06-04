import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Case2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",Case1.class.getResource("chromedriver1.exe").getPath());
        WebDriver driver = new ChromeDriver();
        WebDriverWait delay = new WebDriverWait(driver, 10);
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='email']")));
        driver.findElement(By.cssSelector("[name='email']")).sendKeys("webinar.test@gmail.com");
        driver.findElement(By.cssSelector("[name='passwd']")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        String init_title = driver.getTitle();
        driver.navigate().refresh();
        Boolean passed = (init_title.equals(driver.getTitle())) ? true : false;
        System.out.println(passed + " on the page: " + init_title);

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        driver.findElement(By.xpath("//ul[@class='menu']/li[3]")).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        init_title = driver.getTitle();
        driver.navigate().refresh();
        passed = (init_title.equals(driver.getTitle())) ? true : false;
        System.out.println(passed + " on the page: " + init_title);

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        driver.findElement(By.xpath("//ul[@class='menu']/li[4]")).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='main-menu']")));
        init_title = driver.getTitle();
        driver.navigate().refresh();
        passed = (init_title.equals(driver.getTitle())) ? true : false;
        System.out.println(passed + " on the page: " + init_title);

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='main-menu']")));
        driver.findElement(By.xpath("//ul[@class='main-menu']/li[5]")).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        init_title = driver.getTitle();
        driver.navigate().refresh();
        passed = (init_title.equals(driver.getTitle())) ? true : false;
        System.out.println(passed + " on the page: " + init_title);

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        driver.findElement(By.xpath("//ul[@class='menu']/li[6]")).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        init_title = driver.getTitle();
        driver.navigate().refresh();
        passed = (init_title.equals(driver.getTitle())) ? true : false;
        System.out.println(passed + " on the page: " + init_title);

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        driver.findElement(By.xpath("//ul[@class='menu']/li[7]")).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        init_title = driver.getTitle();
        driver.navigate().refresh();
        passed = (init_title.equals(driver.getTitle())) ? true : false;
        System.out.println(passed + " on the page: " + init_title);

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        driver.findElement(By.xpath("//ul[@class='menu']/li[9]")).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='main-menu']")));
        init_title = driver.getTitle();
        driver.navigate().refresh();
        passed = (init_title.equals(driver.getTitle())) ? true : false;
        System.out.println(passed + " on the page: " + init_title);

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='main-menu']")));
        driver.findElement(By.xpath("//ul[@class='main-menu']/li[10]")).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        init_title = driver.getTitle();
        driver.navigate().refresh();
        passed = (init_title.equals(driver.getTitle())) ? true : false;
        System.out.println(passed + " on the page: " + init_title);

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        driver.findElement(By.xpath("//ul[@class='menu']/li[11]")).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        init_title = driver.getTitle();
        driver.navigate().refresh();
        passed = (init_title.equals(driver.getTitle())) ? true : false;
        System.out.println(passed + " on the page: " + init_title);

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        driver.findElement(By.xpath("//ul[@class='menu']/li[12]")).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        init_title = driver.getTitle();
        driver.navigate().refresh();
        passed = (init_title.equals(driver.getTitle())) ? true : false;
        System.out.println(passed + " on the page: " + init_title);

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        driver.findElement(By.xpath("//ul[@class='menu']/li[13]")).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        init_title = driver.getTitle();
        driver.navigate().refresh();
        passed = (init_title.equals(driver.getTitle())) ? true : false;
        System.out.println(passed + " on the page: " + init_title);

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        driver.findElement(By.xpath("//ul[@class='menu']/li[15]")).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        init_title = driver.getTitle();
        driver.navigate().refresh();
        passed = (init_title.equals(driver.getTitle())) ? true : false;
        System.out.println(passed + " on the page: " + init_title);

        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        driver.findElement(By.xpath("//ul[@class='menu']/li[16]")).click();
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='menu']")));
        init_title = driver.getTitle();
        driver.navigate().refresh();
        passed = (init_title.equals(driver.getTitle())) ? true : false;
        System.out.println(passed + " on the page: " + init_title);

        driver.quit();

        /*uncomment and fix when everything is ready
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@role='navigation']/ul")));
        WebElement ul = driver.findElement(By.xpath("//nav[@role='navigation']/ul"));
        List<WebElement> list = ul.findElements(By.cssSelector("li"));
        int menu_items_count = list.size();
        System.out.println(menu_items_count);
        int menu_items_count = 16;
        for (int i = 1; i <= menu_items_count; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement ul_loc = driver.findElement(By.cssSelector("ul[class='menu']"));
            List<WebElement> list_loc = ul_loc.findElements(By.cssSelector("li"));
            int menu_items_count_loc = list_loc.size();
            System.out.println(menu_items_count_loc);
            if (menu_items_count_loc == 0) {
                ul_loc = driver.findElement(By.cssSelector("ul[class='main-menu']"));
                list_loc = ul_loc.findElements(By.cssSelector("li"));
                //menu_items_count_loc = list_loc.size();
            }
            System.out.println(menu_items_count_loc);
            WebElement li_loc = list_loc.get(i);
            li_loc.click();
            String init_title = driver.getTitle();
            driver.navigate().refresh();
            Boolean passed = (init_title.equals(driver.getTitle())) ? true : false;
            System.out.println(passed + init_title + driver.getTitle());
        }
        for (int j = 1; j <= menu_items_count_loc; j++) {

                WebElement li1 = list1.get(i);

            }
        } else {
           for(int i=1; i<=menu_items_count; i++){
                WebElement ul1 = driver.findElement(By.cssSelector("ul[class='main-menu']"));
                List<WebElement> list1 = ul1.findElements(By.cssSelector("li"));
                WebElement li1 = list1.get(i);
                li1.click();
                String init_title = driver.getTitle();
                driver.navigate().refresh();
                Boolean passed = (init_title.equals(driver.getTitle())) ? true : false;
                System.out.println(passed + init_title + driver.getTitle());
           }
        }*/


    }
}
