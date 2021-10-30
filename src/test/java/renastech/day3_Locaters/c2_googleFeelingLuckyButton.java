package renastech.day3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import renastech.utilities.WebDriverUtil;

public class c2_googleFeelingLuckyButton {
    //TASK: Google Feeling lucky button
    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Write "apple" in search box
    //click i am feeling lucky button
    //Verify title contains Apple

    public static void main(String[] args) throws InterruptedException {
        //1- Open a chrome browser
        WebDriver driver=WebDriverUtil.getDriver("chrome");

        //2- Go to: https://google.com
        driver.get("https://www.google.com");
        //3- Write "apple" in search box
        //driver.findElement(By.name("q")).sendKeys("Apple");   works

        //driver.findElement(By.className("gLFyf gsfi")).sendKeys("Apple");
        //having spaces in classname will make your code fail
        //you can remove one part see if it is unique you can locate
        driver.findElement(By.className("gLFyf")).sendKeys("Apple");
        Thread.sleep(1000);

        //click i am feeling lucky button
        driver.findElement(By.className("RNmpXc")).click();

        //Verify title contains Apple

        String actualTitle=driver.getTitle();
        String expectedTitle="Apple";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("lucky button passed");
        }else{
            System.out.println("lucky button failed");
            System.out.println("actualTitle = " + actualTitle);
        }

        driver.close();
    }
}
