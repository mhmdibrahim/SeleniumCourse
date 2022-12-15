package OpeningBrowsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlSelenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://laancare123.atlassian.net/jira/software/c/projects/LC/issues");
        String url = driver.getCurrentUrl();
        System.out.println("the Current url is :"+url);
        String title = driver.getTitle();
        System.out.println("the title is :"+title);
    }
}
