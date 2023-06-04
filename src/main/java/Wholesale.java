import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Wholesale {
    public static void wholesaleCustomers() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://shop.tastycoffee.ru");

        WebElement searchButton = webDriver.findElement(By.xpath("//a[contains(text(),'Оптовый   "));
        searchButton.click();

        Thread.sleep(1000);

        WebElement inputNameField = webDriver.findElement(By.xpath(".//input[@id = email]"));
        inputNameField.click();
        inputNameField.sendKeys("merzlyakovairinka1995@gmail.com");

        Thread.sleep(1000);

        WebElement inputPasswordField = webDriver.findElement(By.xpath("//input[@name='password']"));
        inputPasswordField.click();
        inputPasswordField.sendKeys("qwerty123");

        Thread.sleep(1000);

        WebElement linkTextBusinessCoffee =
                webDriver.findElement(By.xpath("//a[contains(text(),'Кофе для бизнеса')"));
        linkTextBusinessCoffee.click();

        Thread.sleep(1000);

        WebElement linkTextGetPrices =
                webDriver.findElement(By.xpath("//div[@id='get-prices']"));
        linkTextGetPrices.click();

        Thread.sleep(3000);

        WebElement linkTextAboutCompany =
                webDriver.findElement(By.xpath("//a[contains(text(),'О компании')]"));
        linkTextAboutCompany.click();

        Thread.sleep(1000);

        webDriver.quit();
    }
}
