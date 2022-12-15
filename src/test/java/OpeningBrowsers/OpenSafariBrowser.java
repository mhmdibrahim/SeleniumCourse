package OpeningBrowsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenSafariBrowser {
    public static void main(String[] args) {
        WebDriverManager.safaridriver().setup();
        WebDriver driver = new SafariDriver();
    }
}
