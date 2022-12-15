package OpeningBrowsers;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://laancare123.atlassian.net/jira/software/c/projects/LC/issues");
        String pagesource = driver.getPageSource();
        System.out.println("Page source is"+pagesource);

       // driver.quit(); close all window tabs
        driver.close();  //close current tab only
    }
}
