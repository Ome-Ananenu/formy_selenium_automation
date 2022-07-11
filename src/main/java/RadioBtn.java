import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement radioBtn = driver.findElementByXPath("/html/body/div/div/li[12]/a\n");
        radioBtn.click();

        Thread.sleep(2000);
        driver.findElementByXPath("/html/body/div/div[2]/input").click();

        Thread.sleep(2000);
        driver.quit();
    }
}
