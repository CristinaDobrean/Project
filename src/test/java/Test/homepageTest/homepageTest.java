package Test.homepageTest;

import Test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Pages.BasePage.sleep;
public class homepageTest extends BaseTest {

    @Test
    public void testLogoIsDisplayed() {
        Assert.assertTrue(homePage.checkLogo(), "Logo is not diplayed");
        homePage.clickSignInButton();
        sleep(5 * 1000L);
        homePage.clickBack();
        homePage.clickSkipSignInButton();
        homePage.clickBack();
        homePage.checkEmailField("adresa@email.com");
        sleep(5000);
        homePage.clickNextButton();
        homePage.clickBack();
        homePage.clickSignInButton();
        sleep(5000);
        homePage.signIn("Name", "Password");
        sleep(5000);
    }
}

