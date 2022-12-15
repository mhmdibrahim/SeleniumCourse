package GetElementSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementByID {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.navigate().to("http://18.197.85.177:5104/ForgotPassword");
        //driver.findElement(By.className("button__text")).click();
       String text = driver.findElement(By.id("forgotPassEmail")).getText();
        System.out.println("the text is :"+text);
        driver.quit();
    }
}
