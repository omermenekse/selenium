package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_driverNavigateMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\com.team105\\com.Team105selenium\\src\\drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        //driver.get(); ile aynı işi yapar
        driver.navigate().to("https://www.amazon.com/");


    }
}
