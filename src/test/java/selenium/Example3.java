package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Example3 {
    public static void main(String[] args) {

        /* ...Exercise3...
    go to url : https://www.techlistic.com/p/selenium-practice-form.html
    fill the firstname
    fill the lastname
    check the gender
    check the experience
    fill the date
    choose your profession -> Automation Tester
    choose your tool -> Selenium Webdriver
    choose your continent -> Europa
    choose your command  -> Browser Commands
    click submit button
 */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().window().maximize();


        //go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
       WebElement click= driver.findElement(By.xpath("//a[@id='cookieChoiceDismiss']"));
        click.click();

        //driver.manage().deleteAllCookies();

        WebElement firstnae= driver.findElement(By.xpath("//input[@name='firstname']"));
        firstnae.sendKeys("omer");
        WebElement lastname=  driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("omer");
        WebElement male=  driver.findElement(By.xpath("//input[@id='sex-0']"));
        male.click();
        driver.findElement(By.xpath("//input[@id='exp-1']")).click();
        WebElement date= driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("23.12.2022");
        driver.findElement(By.xpath("//input[@id='profession-0']")).click();
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        WebElement pagedown= driver.findElement(By.xpath("//input[@id='tool-2']"));
        pagedown.sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.id("continents")).sendKeys("Europe"+Keys.ENTER);
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
       // driver.findElement(By.xpath("//input[@class='input-file']")).click();


       driver.close();
















    }
}
