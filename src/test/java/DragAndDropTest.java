import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DragAndDropTest {
    private WebDriver driver;
//    private String baseUrl;
//    private WebElement element;


    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Test
    public void testUntitled() throws Exception {

        DragAndDropTest test = new DragAndDropTest();
        test.setUp();

        Thread.sleep(3000);
        WebElement buttonBtn = driver.findElement(By.xpath("/html/body/div/div/li[2]/a"));
        buttonBtn.click();

        Thread.sleep(3000);
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"btnGroupDrop1\"]"));
        dropdown.click();

        Thread.sleep(3000);
        WebElement dropdownItem1 = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/div/div/a[1]"));
        dropdownItem1.click();


    }

//    @After
//    public void tearDown() throws Exception {
//        driver.quit();
//    }
}
