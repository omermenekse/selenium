package day01driversethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_gets {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\com.team105\\com.Team105selenium\\src\\drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(5000);

        driver.close();



        // firefox veya opera ile çalışacaksak onların driverları indireceğiz
/*
        1- Selenium jar dosyalarini ve chromedriver'ini manuel olarak sisteme
        tanitmis olduk.

        Eger firefox veya safari ile calismamiz gerekirse bu defa da
        onlarin driver'larini indirip, manuel olarak
        9.satirda olan driver'lari tanimlamaliyiz.

        2- 12.satirda ChromeDriver() constructor'ini kullanarak bir obje olusturduk
        bu objeyi kullanmasak bile
        bu satirdan dolayi bos bir browser acilir

        3- driver.get(url) driver'i yazdigimiz url'e goturur
        url yazarken www yazmasak dahi calisir
        ancak https:// yazmazsak method calismaz.

        2- 12. satırda boş bir chromeDriver() construtor ını kullanarak bir obje oluşturduk
        bu objeyi kullanmasak bilr bu satırdan dolayı boş bir browser açılır


*/




    }
}
