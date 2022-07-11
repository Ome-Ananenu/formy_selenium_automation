import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebForm {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement webFormBtn = driver.findElementByXPath("/html/body/div/div/li[14]/a");
        webFormBtn.click();

        WebForm.submitForm(driver);

        WebElement submitBtn = driver.findElementByXPath("/html/body/div/form/div/div[8]/a");
        submitBtn.click();

        Thread.sleep(2000);
        driver.quit();

    }

    public static void submitForm(ChromeDriver driver) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        Thread.sleep(2000);
        driver.findElementById("first-name").sendKeys("Kuwego");

        Thread.sleep(2000);
        driver.findElementById("last-name").sendKeys("Backoffice");


        Thread.sleep(2000);
        driver.findElementById("job-title").sendKeys("developer");

        driver.findElementById("radio-button-2").click();

        driver.findElementById("checkbox-2").click();

        WebElement selectMenu = driver.findElementById("select-menu");
        selectMenu.click();

        driver.findElementByXPath("//*[@id=\"select-menu\"]/option[3]").click();

        WebElement datePicker = driver.findElementById("datepicker");
        datePicker.click();

        driver.findElementByXPath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[5]").click();

    }
}
