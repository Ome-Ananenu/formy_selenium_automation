import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

                driver.navigate().refresh();
//        Conditional Commands(Returns true or false)
//        isDisplayed() : Can be used to check if an element on the web page is displayed
//        isEnabled() : Can be used to check if an element on the web page is enabled
//        isSelected() : This can only be used to check if a checkbox or radio button is selected



//Navigation Commands
//        navigate().to(URL) ---> Same as driver.get()
//        navigate.back()
//        navigate.forward()
//        navigate.refresh()

//        Browser commands
//        close() -> close currently open browser(one browser)
//        quit() -> close multiple browsers
//        Links
    }
}
