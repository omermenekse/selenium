package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_drivers_method {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\com.team105\\com.Team105selenium\\src\\drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("maxsimize boyutları "+ driver.manage().window().getSize());
        System.out.println("maxsimiz position "+driver.manage().window().getPosition());
        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        System.out.println("Fullscrenn boyutları " + driver.manage().window().getSize());
        System.out.println("Fullscrenn position " + driver.manage().window().getPosition());

        // browserı istediğimiz noktaya getirmek

        driver.manage().window().setPosition(new Point(50,100));
        Thread.sleep(3000);

        driver.manage().window().setSize(new Dimension(500,600));



        Thread.sleep(3000);


        driver.close();



    }
}
