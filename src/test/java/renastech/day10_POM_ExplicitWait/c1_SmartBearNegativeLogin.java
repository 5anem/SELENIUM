package renastech.day10_POM_ExplicitWait;

import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.Pages.SmartBearLoginPage;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

public class c1_SmartBearNegativeLogin extends TestBase2 {
    SmartBearLoginPage smartBearLoginPage;//null object

    //enter wrong username
    //enter wrong password
    //verify text is present Invalid Login or Password.
    @Test
    public void TC1_SBNegativeTest(){
        smartBearLoginPage=new SmartBearLoginPage();
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_invalid_username")
                ,PropertiesReadingUtil.getProperties("SmartBear_invalid_password"));

        String expectedMessage="Invalid Login or Password.";
//        WebElement statusElement=smartBearLoginPage.getStatusMassegeElement();
//        String actualText=statusElement.getText();
        String actualText2=smartBearLoginPage.getStatusMessage();

        Assert.assertEquals(expectedMessage,actualText2,"negative login failed!!!!");


    }

    //we extend TestBase2 with logic of inheritence
        //we get before and after method
    //we create page class
        //and we stored webelements and some usefull methods
    //create an object from page to be able to call webelements and methods
    //you navigate your url
    //then you pass username ,password and click on login button with one method that we created under SMLogin Page
    //then we verified text after we try to logged in with a method that again we create under SMLogin Page
}
