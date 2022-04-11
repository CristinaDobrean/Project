package Test.switchToTest;
import org.testng.annotations.Test;
import Test.BaseTest;

import static Pages.BasePage.driver;
import static Pages.BasePage.getBaseUrl;

public class FrameTest extends BaseTest{
    private String newUrl = getBaseUrl()+ "Frames.html";

    @Test
    public void CheckFrames() {
        driver.get(newUrl);
        frames.clickSingleFrame();
        frames.clickMultipleFrame();
    }
}

