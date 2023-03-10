package GetElementSelenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.sql.Driver;
import java.time.Duration;

public class AddProduct {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://staging.mazaady.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("test22@gmail.com");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("123456789");
        WebElement login=driver.findElement(By.className("btn-login"));
        login.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(250));
        WebElement hover = driver.findElement(By.xpath("//*[@id=\"top-header-main\"]/div/div/div[2]/div/div/div[2]/a"));
        hover.click();
        WebElement addproduct = driver.findElement(By.linkText("Add Product"));
        addproduct.click();
        /* another ways to select add product button
        WebElement addproduct = driver.findElement(By.xpath("//a[contains(@href,'https://staging.mazaady.com/add-product')]"));
        WebElement addproduct = driver.findElement(By.xpath("//*[contains(@name,'btn')])");
        WebElement addproduct = driver.findElement(By.xpath("//*[contains(text(),'Add Product')]"));
        new WebDriverWait(driver,Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(addproduct));
        */

        // first Step (1)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
        WebElement nextStep=driver.findElement(By.className("continue"));
        nextStep.click();

        // Second Step (2)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

        // Add Aution Name
       WebElement autionName=driver.findElement(By.xpath("//*[@id=\"step-2\"]/span/div[2]/div[3]/div/span[2]/input"));
        //WebElement autionName=driver.findElement(By.name("title"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        autionName.sendKeys("aution name");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

        //Select Main Category
        WebElement mainCategory=driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input"));
         mainCategory.sendKeys("CARS , MOTORCYCLES & ACCESSORIES");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
        // Select Sub Category
        WebElement subCategories=driver.findElement(By.xpath("//*[@id=\"vs4__combobox\"]/div[1]/input"));
        subCategories.sendKeys("Cars");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));

        //Select Process Type
        WebElement process_type=driver.findElement(By.xpath("//*[@id=\"vs10__combobox\"]/div[1]/input"));
        process_type.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));

        // Select Brand
        WebElement brand=driver.findElement(By.xpath("//*[@id=\"vs11__combobox\"]/div[1]/input"));
        brand.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
        // Transmission Type
        WebElement transmission_type=driver.findElement(By.xpath("//*[@id=\"vs12__combobox\"]/div[1]/input"));
        transmission_type.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();

        // Fuel Type
        WebElement fuel_type=driver.findElement(By.xpath("//*[@id=\"vs13__combobox\"]/div[1]/input"));
        fuel_type.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();

        //Select Condition
        WebElement condition=driver.findElement(By.xpath("//*[@id=\"vs14__combobox\"]/div[1]/input"));
        condition.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
        //Select Color
        WebElement color=driver.findElement(By.xpath("//*[@id=\"vs15__combobox\"]/div[1]/input"));
        color.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));

        //Add Odometer
        WebElement Odometer=driver.findElement(By.xpath("//*[@id=\"step-2\"]/span/div[2]/div[4]/div/span/div[10]/div/div/input"));
        Odometer.sendKeys("12");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));

        //Select Odometer Unit
        WebElement odmeter_unit=driver.findElement(By.xpath("//*[@id=\"vs16__combobox\"]/div[1]/input"));
        odmeter_unit.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //Select Cylinders
        WebElement Cylinders=driver.findElement(By.xpath("//*[@id=\"vs17__combobox\"]/div[1]/input"));
        Cylinders.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //Select Drive
        WebElement Drive=driver.findElement(By.xpath("//*[@id=\"vs18__combobox\"]/div[1]/input"));
        Drive.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //Add VIN #
        WebElement vin=driver.findElement(By.xpath("//*[@id=\"step-2\"]/span/div[2]/div[4]/div/span/div[14]/div/div/input"));
        vin.sendKeys("3");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //Select Country Made
        WebElement country_made=driver.findElement(By.xpath("//*[@id=\"vs19__combobox\"]/div[1]/input"));
        country_made.sendKeys("Egypt");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //Add Quantity
        WebElement quantity=driver.findElement(By.xpath("//*[@id=\"step-2\"]/span/div[2]/div[5]/div/span[2]/input"));
        quantity.sendKeys("3");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //Add Auction Details
        WebElement aution_details=driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p/br"));
        aution_details.click();
        aution_details.sendKeys("Auction Details");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));


    }

}
