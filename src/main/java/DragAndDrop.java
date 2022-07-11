import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement dragAndDropBtn = driver.findElementByXPath("/html/body/div/div/li[5]/a");
        dragAndDropBtn.click();

        Actions act = new Actions(driver);


        Thread.sleep(2000);
        driver.navigate().refresh();
        WebElement sourceElem = driver.findElementById("image");
        WebElement targetElem = driver.findElementByXPath("//*[@id=\"box\"]");

        act.dragAndDrop(sourceElem,targetElem).build().perform();

        driver.quit();
    }
}
