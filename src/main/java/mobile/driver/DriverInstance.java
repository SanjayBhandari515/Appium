package mobile.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverInstance {

    private static DriverInstance instance=null;
    private AppiumDriver<MobileElement> driver;

    private DriverInstance(){

    }

    public static DriverInstance getInstance(){
        if(instance==null){
            instance = new DriverInstance();
        }
        return instance;
    }

    public AppiumDriver<MobileElement> openApplication(){

        try {
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability("deviceName", "HUAWEI Y9 2019");
            cap.setCapability("udid", "DEFNW18C21008717");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "9");

            cap.setCapability("appPackage", "in.testdemo.map");
            cap.setCapability("appActivity", "in.testdemo.map.MainActivity");
            //cap.setCapability("appActivity", "com.google.android.gms.common.api.GoogleApiActivty");
            cap.setCapability("skipDeviceInitialization", "true");
            cap.setCapability("skipServerInstallation", "true");
            cap.setCapability("noReset", "true");

            driver = new AppiumDriver<MobileElement>(url, cap);
            System.out.println("Application Started Successfully!!");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return driver;
    }

}
