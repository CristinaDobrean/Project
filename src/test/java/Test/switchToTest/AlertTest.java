package Test.switchToTest;
import org.testng.annotations.Test;
import Test.BaseTest;

import static Pages.BasePage.driver;
import static Pages.BasePage.getBaseUrl;
public class AlertTest extends BaseTest{
    private String newUrl = getBaseUrl()+ "Alerts.html";

    @Test
    public void checkAlerts(){
        driver.get(newUrl);

        //Alert with OK
        alert.clickAlertTabWithOk();
        alert.clickOkButtonOnAlert();

        //Alert with Cancel
        alert.clickAlertTabWithCancel();
        alert.clickCancelButtonOnAlert();

        //Alert with TextBox
        alert.clickAlertTabWithTextBox();
        alert.sendDataToAlert("Vine primavara");
        alert.clickOkButtonOnAlert();
    }
}
