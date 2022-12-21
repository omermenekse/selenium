package day01_drivers_method_calisma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C01_firefox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\pc\\Desktop\\com.team105\\com.Team105selenium\\src\\drivers\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();

        driver.get("https://www.amazon.com/");

        Thread.sleep(5000);

    }
}
