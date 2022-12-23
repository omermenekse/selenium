package Day05_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ZeroTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        //1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");
        //2- arama kutusunu locate edelim
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        //3- “Samsung headphones” ile arama yapalim
        searchBox.sendKeys(("Samsung headphones")+ Keys.ENTER);
        //4- Bulunan sonuc sayisini yazdiralim

        WebElement sonucYaziElementi= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println( sonucYaziElementi.getText());
        //5- Ilk urunu tiklayalim




        //6- Sayfadaki tum basliklari yazdiralim





        Thread.sleep(5000);
        driver.close();

    }
}