import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement dropdownBtn = driver.findElementByXPath("/html/body/div/div/li[6]/a");
        dropdownBtn.click();

        Thread.sleep(2000);
        WebElement dropDown = driver.findElementByXPath("//*[@id=\"dropdownMenuButton\"]");
        dropDown.click();

        driver.findElementByXPath("/html/body/div/div/div/a[4]").click();

        Thread.sleep(1000);
        driver.quit();
    }
}
