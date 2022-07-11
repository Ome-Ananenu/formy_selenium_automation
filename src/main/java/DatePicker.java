import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement datePickerBtn = driver.findElementByXPath("/html/body/div/div/li[4]/a");
        datePickerBtn.click();

//        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement dateInputField = driver.findElementByXPath("//*[@id=\"datepicker\"]");
        dateInputField.click();

        Thread.sleep(3000);
        WebElement backBtn = driver.findElementByXPath("/html/body/div[2]");
        backBtn.click();

    }
}
