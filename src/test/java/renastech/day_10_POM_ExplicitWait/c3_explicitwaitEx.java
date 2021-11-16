package renastech.day_10_POM_ExplicitWait;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.Pages.SeleniumPracticeExplicitWaitPage;
import renastech.base.TestBase2;
import renastech.utilities.BrowserUtils;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

public class c3_explicitwaitEx extends TestBase2 {

    //go to http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
        //click on timer
    //verify webdriver text gets present

    SeleniumPracticeExplicitWaitPage seleniumPracticeExplicitWaitPage; //null
    @Test
    public void tc1(){
        seleniumPracticeExplicitWaitPage=new SeleniumPracticeExplicitWaitPage();
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("selenium_practice_url"));
        //seleniumPracticeExplicitWaitPage.timerButton.click();
        seleniumPracticeExplicitWaitPage.getDefaultText();
        seleniumPracticeExplicitWaitPage.clickTimerButton();
        seleniumPracticeExplicitWaitPage.getDefaultText();
       //BrowserUtils.wait(5);
        WebElement actualText=seleniumPracticeExplicitWaitPage.getWebDriverText();
        seleniumPracticeExplicitWaitPage.getDefaultText();

        Assert.assertEquals(actualText.getText(),"WebDriver" , "Webdriver text is not present on the page!!");
    }
}
