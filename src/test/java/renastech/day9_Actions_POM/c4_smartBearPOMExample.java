package renastech.day9_Actions_POM;

import org.testng.annotations.Test;
import renastech.Pages.SmartBearLoginPage;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

public class c4_smartBearPOMExample extends TestBase2 {

    //to be able to work with page you need create an instance from page
    //so you can have access to methods and webelements
    SmartBearLoginPage smartBearLoginPage;

    @Test
    public void TC1_smartBearPossitiveLoginVerification(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));

        smartBearLoginPage = new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_username"),
                PropertiesReadingUtil.getProperties("SmartBear_password"));


    }
}
