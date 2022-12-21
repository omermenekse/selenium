package day01driversethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Findelement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("iphone");

        searchBox.sendKeys("notebook");
        searchBox.submit();


        Thread.sleep(5000);

        driver.close();

    }
}
