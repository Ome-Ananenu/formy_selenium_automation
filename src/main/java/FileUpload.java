import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement fileUploadBtn = driver.findElementByXPath(" /html/body/div/div/li[8]/a");
        fileUploadBtn.click();

        Thread.sleep(2000);
        WebElement field = driver.findElementByXPath("//*[@id=\"file-upload-field\"]");
        field.sendKeys("./images/file-to-upload.png");

    }
}
