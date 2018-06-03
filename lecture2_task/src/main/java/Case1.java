import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",Case1.class.getResource("chromedriver.exe").getPath());
        WebDriver driver = new ChromeDriver();

    }
}
