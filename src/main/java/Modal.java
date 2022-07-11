import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement modalBtn = driver.findElementByXPath("/html/body/div/div/li[10]/a\n");
        modalBtn.click();

        Thread.sleep(2000);
        driver.findElementById("modal-button").click();

        Thread.sleep(2000);
        driver.findElementById("close-button").click();

        Thread.sleep(2000);
        driver.quit();
    }
}
