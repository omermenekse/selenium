package day02_driverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_driver_findelement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\com.team105\\com.Team105selenium\\src\\drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //aramaKutusu.click();
        aramaKutusu.sendKeys("Java");
        aramaKutusu.clear();
        Thread.sleep(3000);

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();


        // sonuç elementini yazdırmak için





        Thread.sleep(3000);

        driver.close();










    }
}
