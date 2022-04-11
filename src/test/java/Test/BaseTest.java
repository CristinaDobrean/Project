package Test;

import Pages.homepage.HomePage;
import Pages.register.Register;
import Pages.switchTo.Alert;
import Pages.switchTo.Frame;
import Pages.switchTo.Window;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import Pages.BasePage;


public class BaseTest {

    public HomePage homePage = HomePage.getInstance();
    public Register register = Register.getInstance();
    public Alert alert = Alert.getInstance();
    public Window window = Window.getInstance();
    public Frame frames = Frame.getInstance();

    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }

@AfterSuite
    public void tearDown(){
        BasePage.tearDown();
 }
}



