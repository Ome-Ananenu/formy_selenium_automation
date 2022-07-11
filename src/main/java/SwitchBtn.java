import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBtn {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        WebElement switchWindowBtn = driver.findElementByXPath("/html/body/div/div/li[13]/a");
        switchWindowBtn.click();

        Thread.sleep(2000);
        driver.findElementById("alert-button").click();

        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(2000);
        driver.quit();
    }
}
