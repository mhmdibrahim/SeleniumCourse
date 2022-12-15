package GetElementSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementByClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
      //  driver.navigate().to("http://18.197.85.177:5104/ForgotPassword");
        //String className = driver.findElement(By.className("form-label")).getText();
       // String className = driver.findElement(By.tagName("label")).getText();
        //String className = driver.findElement(By.linkText("Back to Login")).getText();
        //String className = driver.findElement(By.partialLinkText("to Login")).getText();
        //String className = driver.findElement(By.xpath("//button")).getText();
        /* xpath exepression
        $x("//button[@class='back-login']")
        at console $x(//tag name)
        at console $x(//div[h3='value'])
        //tagName[@attribute='value']
        $x("//*[@class='back-login']")
        $x("//*[text()='Email']") important part
         */
        //String className = driver.findElement(By.xpath("//*[text()='Email']")).getText(); important apart
        //String className = driver.findElement(By.xpath("//*contains[text(),'Email']")).getText();
        driver.get("file:C:\\Users\\abdellatif-mohamed\\IdeaProjects\\selenium_Course\\src\\test\\resources\\WebSPA.html");
        String className = driver.findElement(By.xpath("//*[@data-testid='test-example']")).getText();
        System.out.println("Name of text is "+className);
        driver.quit();
    }
}
