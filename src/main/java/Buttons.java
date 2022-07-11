import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement buttonBtn = driver.findElementByXPath("/html/body/div/div/li[2]/a");
        buttonBtn.click();

        Thread.sleep(3000);
        WebElement dropdown = driver.findElementByXPath("//*[@id=\"btnGroupDrop1\"]");
        dropdown.click();

        Thread.sleep(3000);
        WebElement dropdownItem1 = driver.findElementByXPath("/html/body/div/form/div[3]/div/div/div/div/div/a[1]");
        dropdownItem1.click();

        driver.quit();
    }
}
