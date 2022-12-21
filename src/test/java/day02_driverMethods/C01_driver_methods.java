package day02_driverMethods;

import org.asynchttpclient.filter.ThrottleRequestFilter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_methods {
    public static void main(String[] args) throws InterruptedException {
        /*
        1- Test otomostonu nedir ?
       Manuel olarak klavye , mouse kullanrak yapabılcegımız testleri , yazdıgımız kodlar aracılıgıyla yapmaya denir.
       2- Yazılım testi nedir ? : Yazılım yapmaya baslarken ortaya konulan requırement'lerin karsılanıp , karsılanmadıgının test edilmesidir.
       3- Bunu tespit edebilmek için developer'lar kodlamaya basladıgında gereksınımleri incelemeye başlarız, gereksinimler
       çerçevesinde expected result'ları belirleriz,
       developer'lar kodlarını bıtırıp test envoırement'ına yukledıkten sonra, hazırladıgımız pozıtıf ve negatıf test senaryolarını calıstırarak actual sonucları elde edip ,
       expected result ile actual result aynı mı diye bakarız.Aynı ise testimiz passed , aynı değil ise testimiz failed olur.
       4- Selenium nedir ? Selenium browser'ları otomate edecek toolların calısmasına ımkan tanıyan bir suite'dir
      Selenıum browser'ları otomate eder, bu gucle ne yapacagınız sıze kalmıs
      5- Selenium browser'ları nasıl kontrol eder ? Kullandıgımız programlama dili ile, çalıştıgımız İDE 'de  olusturacagımız
      webdriver sayasinde bilgisayarımızda ıstedıgımız browser'i kullanarak testlerimizi yapabiliriz.
      webdriver sayasinde bilgisayarımızda ıstedıgımız browser'i kullanarak testlerimizi yapabiliriz.
         */
        // Biz browser'lari olusturdugumuz driver sayesinde otomate edebiliyoruz
        // Bunun icin her testin basinda mutlaka driver objesi olusturacagiz
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\com.team105\\com.Team105selenium\\src\\drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        // acilan sayfanin basliginin amazon icerdigini test edin
        driver.get("https://amazon.com/");

        String exceptedKelime= "amazon";

        String actualResult=driver.getTitle();

        if (actualResult.contains(exceptedKelime)){
            System.out.println("TITLE testi PASSED");
        }else {
            System.out.println("Title amazon içermiyor, test FAILED");
            System.out.println(driver.getTitle());
        }

        // gittigimiz sayfanin URL'inin https://www.amazon.com/ oldugunu test edin
        String exceptedUrl= "https://www.amazon.com/";

        String actualUrl= driver.getCurrentUrl();

        if (exceptedUrl.equals(actualUrl)){
            System.out.println("URL testi PASSED");
        }else{
            System.out.println("URL testi FAILED");
            System.out.println(driver.getCurrentUrl());
        }


        //Thread.sleep(5000);

       // driver.close();





    }
}
