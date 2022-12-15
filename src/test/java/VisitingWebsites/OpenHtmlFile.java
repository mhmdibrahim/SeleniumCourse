package VisitingWebsites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenHtmlFile {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file://C:\\Users\\abdellatif-mohamed\\IdeaProjects\\selenium_Course\\src\\test\\resources\\HISS - لان اتش اس.html");

    }
}
