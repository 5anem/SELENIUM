package renastech.day2_Locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_GoogleNameLocater {
    //TASK: Google search
    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Write “orange” in search box
    //4- Click google search button
    //5- Verify title:
    //Expected: Title should start with “orange” word
    //6-navigate back
    //7-write banana in search box
    //8-verify title contains banana.

    //1.Name:
    // This locator will be looking into the whole HTML code and return the webelement
    // with matching name attribute value
    // --this one will find and return the first webelemt it finds.
    //
    // syntax : driver.findElement(By.name("name attribute value")).

    public static void main(String[] args) throws InterruptedException {
        //go to google
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        // //    //2- Go to: https://google.com
        driver.get("https://www.google.com");

        //3- Write “orange” in search box
        //driver.findElement(By.name("q")).sendKeys("orange");
        //WebElement searchBox=driver.findElement(By.name("Qasdasd"));//no such element exception
        WebElement searchBox=driver.findElement(By.name("q"));//no such element exception
        //findelement will return you webelement
        searchBox.sendKeys("orange");

        Thread.sleep(2000);
        //4- Click google search button
        WebElement googleSearchButton= driver.findElement(By.name("btnK"));
        googleSearchButton.click();

        //5- Verify title:
        //Expected: Title should start with “orange” word
        String expectedTitle="orange";
        String actualTitle=driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Passed For Orange");
        }else {
            System.out.println("Failed For Orange !!!!");
            System.out.println("actualTitle = " + actualTitle);
        }
        Thread.sleep(2000);

        //6-navigate back
        driver.navigate().back();

        Thread.sleep(2000);
        //7-write banana in search box
        driver.findElement(By.name("q")).sendKeys("banana" + Keys.ENTER );
        //8-verify title contains banana.
        String expectedTitle2="banana";
        String actualTitle2=driver.getTitle();

        if (actualTitle2.startsWith(expectedTitle2)){
            System.out.println("Passed For Banana");
        }else {
            System.out.println("Failed For Banana !!!!");
            System.out.println("actualTitle = " + actualTitle2);
        }

        driver.close();


    }
}
