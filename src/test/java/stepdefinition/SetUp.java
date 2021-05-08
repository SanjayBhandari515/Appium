package stepdefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mobile.driver.DriverInstance;
import org.junit.Before;

public class SetUp {

    private DriverInstance automation = DriverInstance.getInstance();
    private AppiumDriver<MobileElement> driver;

    @Before
    public AppiumDriver driver(){
        driver = automation.openApplication();
        return driver;
    }

}
