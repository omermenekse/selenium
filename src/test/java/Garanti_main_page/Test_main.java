package Garanti_main_page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class Test_main {
    //Garanti Bankası main page kredi hesaplaması testi yapılacaktır

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        //open Garanti bankası main page
        driver.get("https://www.garantibbva.com.tr/");
        //driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//ul[@class='mainbar__navlist js-mainbar__navlist']")).click();
        WebElement pagedown1= driver.findElement(By.xpath("//a[@href='/krediler/kredi-basvurusu']"));
        pagedown1.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(3000);
        //taşıt kredisi seçeneğini seç
        driver.findElement(By.xpath("(//span[@class='tabs__linktext'])[3]")).click();
        //Aracın durumu 2. el seç
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[text()='2. El']")).click();
        // Kredi limit 150.000 lira gir
        WebElement krediTutari= driver.findElement(By.xpath("//input[@id='js-credit__input-PERSONAL_AUTO']"));
        krediTutari.click();
        krediTutari.sendKeys(Keys.BACK_SPACE);
        krediTutari.sendKeys(Keys.BACK_SPACE);
        krediTutari.sendKeys(Keys.BACK_SPACE);
        krediTutari.sendKeys(Keys.BACK_SPACE);
        krediTutari.sendKeys(Keys.BACK_SPACE);
        krediTutari.sendKeys(Keys.BACK_SPACE);
        krediTutari.sendKeys("150.000");
        //



        Thread.sleep(5000);


        driver.close();





    }

}
