package renastech.day2_Locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import renastech.utilities.WebDriverUtil;

public class c7_driverUtilPractice {

    public static void main(String[] args) {
        //create connection between driver and browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver =new ChromeDriver();
//        driver.get("https://www.google.com");

        WebDriver driver=WebDriverUtil.getDriver("firefox");

        driver.get("https://www.google.com");
        driver.close();

        WebDriver driver2=WebDriverUtil.getDriver("chrome");
        driver2.get("https://www.facebook.com");
        driver2.close();

        //WebDriver driver3=WebDriverUtil.getDriver("CHROME")// WORKS
        WebDriver driver3=WebDriverUtil.getDriver("EDGE");// WORKS
        driver3.get("https://www.facebook.com");
    }
}
