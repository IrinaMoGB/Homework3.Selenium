import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Community {
    public static void coffeeCommunity() throws InterruptedException {
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

        WebElement searchButton = webDriver.findElement(By.xpath("//input[@name='community_q']"));
        searchButton.click();

        Thread.sleep(1000);

        WebElement searchInput = webDriver.findElement(By.cssSelector(".search-community__input"));
        searchInput.sendKeys("эфиопия");

        searchButton.click();

        Thread.sleep(3000);

        WebElement channelsButton = webDriver.findElement(By.xpath("//a[contains(text(),'Каналы')]"));
        channelsButton.click();

        Thread.sleep(1000);

        webDriver.quit();
    }
}
