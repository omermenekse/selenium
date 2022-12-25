package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01_sahibinden {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.sahibinden.com/");
        WebElement cookiesbutton1 = driver.findElement(By.xpath("//button[@id='onetrust-reject-all-handler']"));
        cookiesbutton1.click();

      WebElement searchBox= driver.findElement(By.xpath("//input[@id='searchText']"));
       searchBox.sendKeys("notebook"+ Keys.ENTER);
        Thread.sleep(5000);

        WebElement cityselect= driver.findElement(By.xpath("//li[@date-address='city']"));
        cityselect.click();

    }
}
