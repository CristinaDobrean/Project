package Pages.homepage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Pages.BasePage;


public class HomePage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    public static HomePage instance;

    private By logo = By.id("logo");
    private By signInButton = By.id("btn1");
    private By skipSignInButton = By.id("btn2");
    private By emailField = By.id("email");
    private By nextButton = By.id("enterimg");

    //SignIn page
    private By usernameBy = By.xpath("//input[@ng-model='Email']");
    private By passwordBy = By.xpath("//input[@ng-model='Password']");
    private By loginUser = By.id("enterbtn");


    private HomePage(){
    }

    public static HomePage getInstance(){
        if (instance== null){
            instance = new HomePage();
        }
        return instance;
    }

    public boolean checkLogo(){
        LOG.info("Check if Logo is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public void clickSignInButton (){
        LOG.info("Click sign in button");
        driver.findElement(signInButton).click();
    }

    public void clickSkipSignInButton(){
        LOG.info("Click skip sign in button");
        driver.findElement(skipSignInButton).click();
    }

    public void clickBack(){
        LOG.info("Click the browser back button");
        driver.navigate().back();
    }

    public void checkEmailField(String email){
        LOG.info("Check email field");
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickNextButton(){
        LOG.info("Click Next button");
        driver.findElement(nextButton).click();
    }

    public void  signIn(String userName, String password){
        LOG.info("Sign in user");
        driver.findElement(usernameBy).sendKeys(userName);
        driver.findElement(passwordBy).sendKeys(password);
        driver.findElement(loginUser).click();
    }

}