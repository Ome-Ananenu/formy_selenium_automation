import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

        driver.findElementByXPath("/html/body/div/div/li[3]/a\n").click();

        Thread.sleep(3000);
        WebElement checkbox1 = driver.findElementByXPath("//*[@id=\"checkbox-1\"]");
        checkbox1.click();

        Thread.sleep(2000);
        WebElement checkbox2 = driver.findElementByXPath("//*[@id=\"checkbox-2\"]");
        checkbox2.click();
    }
}
