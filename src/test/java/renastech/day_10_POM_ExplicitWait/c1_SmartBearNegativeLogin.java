package renastech.day_10_POM_ExplicitWait;

import org.openqa.selenium.WebElement;
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


}
