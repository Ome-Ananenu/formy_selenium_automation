import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyAndMousePress {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement btn = driver.findElementByXPath("/html/body/div/div/li[9]/a");
        btn.click();

        Thread.sleep(2000);
        driver.findElementById("name").sendKeys("Formy Auth");

        driver.quit();

    }
}
