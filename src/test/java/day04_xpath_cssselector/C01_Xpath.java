package day04_xpath_cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\com.team105\\com.Team105selenium\\src\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButon= driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButon.isDisplayed()){
            System.out.println("Delete buton görünürlük testi PASSED");
        }else {
            System.out.println("Delete buton görünürlük testi FAILED");
        }
        Thread.sleep(3000);
        //4- Delete tusuna basin
        deleteButon.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElementText= driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveElementText.isDisplayed()){
            System.out.println("Add remove element text displayed test is PASSED");
        }else{
            System.out.println("Add remove element text displayed test is FAILED");
        }


        Thread.sleep(5000);
        driver.close();

    }
}
