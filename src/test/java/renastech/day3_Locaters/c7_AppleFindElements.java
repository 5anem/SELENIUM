package renastech.day3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

import java.util.List;

public class c7_AppleFindElements {
    //1. Open Chrome browser
    //2. Go to https://www.apple.com
    //3. Click to iPhone
    //4. Print out the texts of all links
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver("Chrome");
        driver.get("https://www.apple.com");

        //3. Click to iPhone

        //xpath has abilty to go also from child parent
        //to child to parent use /..
        driver.findElement(By.xpath("//span[.='iPhone']/..")).click();

        //4. Print out the texts of all links
        //print out all links
        //count of links that doesnt have text
        //count of links that has text
        //a tag has all the link

        List<WebElement> allLinks =driver.findElements(By.xpath("//body//a"));

        int linkWithText=0; //to count elements that has text
        int linkwithoutText=0; //to count elements that doenst have text

        for (WebElement eachLink : allLinks){
            String elementsToText=eachLink.getText(); //"" "Airtag"
            System.out.println(elementsToText);

            if (elementsToText.isEmpty()){
                linkwithoutText++;
            }else {
                linkWithText++;
            }
        }

        System.out.println("linkWithText = " + linkWithText);
        System.out.println("linkwithoutText = " + linkwithoutText);
        System.out.println("allLinks.size() = " + allLinks.size());


    }
}
