import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledAndDisabled {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement enabledAndDisabledBtn = driver.findElementByXPath("/html/body/div/div/li[7]/a\n");
        enabledAndDisabledBtn.click();


        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.querySelector(\"input[placeholder = 'Disabled input here...']\").disabled = false");

        driver.findElementById("disabledInput").sendKeys("Hello");

        js.executeScript("document.querySelector(\"input[placeholder = 'Input here...']\").disabled = true");

        Thread.sleep(2000);
        driver.quit();
    }
}
