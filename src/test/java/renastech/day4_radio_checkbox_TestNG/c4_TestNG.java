package renastech.day4_radio_checkbox_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class c4_TestNG {

    //@BeforeMethod
//    @AfterMethod
//    @Test

    @BeforeMethod
    public void setup(){//this method will run before each test method
        System.out.println("Before Method is Running");
    }
    @AfterMethod
    public void closing(){ //this method will run after each test method
        System.out.println("After Method is running");
    }

    @Test
    public void TC1_test(){
        System.out.println("Test1 is running");
    }

    @Test
    public void TC3_test(){
        System.out.println("Test3 is running");
    }

    @Test
    public void TC2_test(){
        System.out.println("Test2 is running");
    }



}
