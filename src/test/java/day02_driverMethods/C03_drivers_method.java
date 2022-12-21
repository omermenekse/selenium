package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_drivers_method {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\com.team105\\com.Team105selenium\\src\\drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getPageSource());

        //pagesource MEOW içeriğini test edin

        String pageSource= driver.getPageSource();
        String expectedKelime= "MEOW";

        if (pageSource.contains(expectedKelime)){
            System.out.println("page source testi PASSED");
        } else{
            System.out.println("Page source testi FAILED, MEOW kelimesi bulunamadi");
        }



    }
}
