package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {

        /*...Exercise1...
    Create a new class under Q1 create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.google.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/
    Navigate back to google
    Navigate forward to amazon
    Refresh the page
    Close/Quit the browser
    And last step : print "All Ok" on console
     */




        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        //Open google home page https://www.google.com/.
        driver.get("https://www.google.com/");
        //    On the same class, Navigate to amazon home page https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);
        //Navigate back to google
        driver.navigate().back();
        Thread.sleep(2000);
        //Navigate forward to amazon
        driver.navigate().forward();
        Thread.sleep(2000);
        //  Refresh the page
        driver.navigate().refresh();
        Thread.sleep(2000);
        // Close/Quit the browser
        driver.close();
        System.out.println("All ok");





    }

}
