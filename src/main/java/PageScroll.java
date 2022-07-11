import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement pageScrollBtn = driver.findElementByXPath("/html/body/div/div/li[11]/a\n");
        pageScrollBtn.click();

        JavascriptExecutor js = (JavascriptExecutor)driver;

        //Approach 1: Scroll to a certain point(specified by number of pixels)
        js.executeScript("window.scrollBy(0,2000)","");

        //Approach 2: Scroll till you find a certain element
        Thread.sleep(2000);
        WebElement paragraph = driver.findElementByXPath("/html/body/div/form/div[1]/div/p[6]");
        js.executeScript("arguments[0].scrollIntoView();",paragraph);

//        Approach 3: Scroll to the end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");


    }
}
