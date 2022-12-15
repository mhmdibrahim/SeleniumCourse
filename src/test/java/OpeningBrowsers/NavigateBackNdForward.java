package OpeningBrowsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackNdForward {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("https://laancare123.atlassian.net/jira/software/c/projects/LC/issues");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        //driver.quit();
    }
}
