package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_windowsHandleDegeri {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\com.team105\\com.Team105selenium\\src\\drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        System.out.println(driver.getWindowHandle());

        driver= new ChromeDriver();

        driver.get("https://www.amazon.com/");

        Thread.sleep(3000);

        driver.close();


    }
}
