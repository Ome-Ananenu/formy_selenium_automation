import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

        WebDriverWait wait  = new WebDriverWait(driver,20);
        WebElement fileUploadBtn = driver.findElementByXPath(" /html/body/div/div/li[8]/a");
        fileUploadBtn.click();

        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"file-upload-field\"]")));
        field.sendKeys("./images/file-to-upload.png");

    }
}
