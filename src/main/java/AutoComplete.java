import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement autoCompleteBtn = driver.findElementByXPath("/html/body/div/div/li[1]/a");
        autoCompleteBtn.click();
    }
}
