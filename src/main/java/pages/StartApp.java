package pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartApp {
    public static void start() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();

    }
}
