package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        /* ...Exercise2...
 1 - Driver olusturalim
 2 - Java class'imiza chromedriver.exe'yi tanitalim
 3 - Driver'in tum ekrani kaplamasini saglayalim
 4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
     söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
 5 - "https://www.otto.de" adresine gidelim
 6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
 7 - Title ve url'nin "OTTO" kelimesini icerip icermedigini kontrol edelim
 8 - Ardindan "https://wisequarter.com/" adresine gidelim
 9 - Bu adresin basligini ve Url alalim ve "Quarter" kelimesini icerip icermedigini
     kontrol edelim
 10- Bir onceki web sayfamiza geri donelim
 11- Sayfayi yenileyelim
 12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
 13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //5 - "https://www.otto.de" adresine gidelim
        driver.get("https://www.otto.de");
        //6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim

        String ottoTitle= driver.getTitle();
        String ottoURl= driver.getCurrentUrl();
        //7 - Title ve url'nin "OTTO" kelimesini icerip icermedigini kontrol edelim

        String expectedOtto= "OTTO";
        String actualTitle= driver.getTitle();
        String actualURL= driver.getCurrentUrl();
        if (actualTitle.contains(expectedOtto)){
            System.out.println("Otto title test PASSED");
        }else {
            System.out.println("Otto title test FAILED");
        }

        if (actualURL.contains(expectedOtto)){
            System.out.println("Otto URL test PASSED");
        }else {
            System.out.println("Otto URL test FAILED");
        }
        //8 - Ardindan "https://wisequarter.com/" adresine gidelim
        driver.navigate().to("https://www.wisequarter.com/");
        //9 - Bu adresin basligini ve Url alalim ve "Quarter" kelimesini icerip icermedigini
       // kontrol edelim
        String expectedwise= "Quarter";
        String actualTitle1= driver.getTitle();

        String actualURL1= driver.getCurrentUrl();
        if (actualTitle1.contains(expectedwise)){
            System.out.println("WiseQuarter title test PASSED");
        }else {
            System.out.println("WiseQuarter title test FAILED");
        }

        if (actualURL1.contains(expectedwise)){
            System.out.println("WiseQuarter URL test PASSED");
        }else {
            System.out.println("WiseQuarter URL test FAILED");
        }
// 10- Bir onceki web sayfamiza geri donelim
        driver.navigate().back();
        //11- Sayfayi yenileyelim
        driver.navigate().refresh();

        //12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().forward();

        //13- En son adim olarak butun sayfalarimizi kapatmis olalim
        Thread.sleep(2000);
        driver.quit();




    }
}
