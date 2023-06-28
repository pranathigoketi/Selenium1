package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.getTitle();

        driver.get("https://demo.guru99.com/test/radio.html");

        driver.findElement(By.id("vfb-7-3")).click();
        Thread.sleep(2000);


        driver.findElement(By.id("vfb-6-1")).click();
        Thread.sleep(2000);



        driver.close();

    }
}
