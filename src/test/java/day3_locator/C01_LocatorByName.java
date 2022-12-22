package day3_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_LocatorByName {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\com.team105\\com.Team105selenium\\src\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(" https://www.amazon.com/");

        WebElement aramakutusu1= driver.findElement(By.name("field-keywords"));
        aramakutusu1.sendKeys("Nutella"+ Keys.ENTER);

        Thread.sleep(5000);
        driver.close();

// class attribute genellikler aynı özelliklerdeki farklı elementleri bulmak için kullanılır.






    }
}
