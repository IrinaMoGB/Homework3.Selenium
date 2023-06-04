import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Cart {
    public static void addItemToCart() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://shop.tastycoffee.ru");
        WebElement loginButtonHeader = webDriver.findElement(By.xpath(".//a[text()='Войти']"));
        loginButtonHeader.click();

        Thread.sleep(1000);

        WebElement inputNameField = webDriver.findElement(By.xpath(".//input[@id = email]"));
        inputNameField.click();
        inputNameField.sendKeys("irinamo.coffee@gmail.com");

        Thread.sleep(1000);

        WebElement inputPasswordField = webDriver.findElement(By.xpath(".//input[@id = 'password']"));
        inputPasswordField.click();
        inputPasswordField.sendKeys("Ilovecofee1");

        Thread.sleep(1000);

        WebElement linkTextCoffee =
                webDriver.findElement(By.xpath("//a[contains(text(),'Кофе')]"));
        linkTextCoffee.click();

        Thread.sleep(1000);

        WebElement addButton = webDriver.findElement(By.xpath("//a[@onclick='add_in_cart(this);return false;']"));
        addButton.click();

        Thread.sleep(1000);

        WebElement linkTextChocolate =
                webDriver.findElement(By.xpath("//a[contains(text(),'Шоколад и снеки')]"));
        linkTextChocolate.click();

        Thread.sleep(1000);

        WebElement buyButton = webDriver.findElement(By.xpath("(//a[@onclick='add_in_cart(this);return false;'])[2]"));
        buyButton.click();

        Thread.sleep(1000);

        WebElement linkTextCart =
                webDriver.findElement(By.xpath("//a[contains(text(),'Перейти в корзину')]"));
        linkTextCart.click();

        Thread.sleep(3000);

        webDriver.quit();
    }
}
