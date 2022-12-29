package utils;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.util.Properties;

public class CapabilityUtil {

    public Properties prop;

    public void readProperties() throws IOException {


        AutomationProperties au = new AutomationProperties("app_conf.properties");
        this.prop = au.readAll();
        System.out.println("----->PROPERTIES<-----");
        System.out.println("-----> "+prop.toString());
        System.out.println("----------------------");
    }

    public DesiredCapabilities setDesiredCapabilitiesFromConfig(DesiredCapabilities desiredCapabilities) throws Exception {
        desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("deviceName", prop.getProperty("deviceName"));
        desiredCapabilities.setCapability("udid", prop.getProperty("udid"));
//        desiredCapabilities.setCapability("udid", ce.getDeviceIdFormDevice());
        desiredCapabilities.setCapability("platformName", prop.getProperty("platformName"));
        desiredCapabilities.setCapability("platformVersion", prop.getProperty("platformVersion"));
        desiredCapabilities.setCapability("appPackage", prop.getProperty("appPackage"));
        desiredCapabilities.setCapability("appActivity", prop.getProperty("appActivity"));
        desiredCapabilities.setCapability("automationName", prop.getProperty("automationName"));

        return desiredCapabilities;
    }


    public DesiredCapabilities getDesiredCapabilities(String deviceName,String udid,String platformName, String platformVersion, String appPackage,String appActivity,String automationName) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("deviceName", deviceName);
        desiredCapabilities.setCapability("udid", udid);
        desiredCapabilities.setCapability("platformVersion", platformVersion);
        desiredCapabilities.setCapability("platformName", platformName);
        desiredCapabilities.setCapability("appPackage", appPackage);
        desiredCapabilities.setCapability("appActivity", appActivity);
        desiredCapabilities.setCapability("automationName", automationName);
        desiredCapabilities.setCapability("skipUnlock", "true");
        desiredCapabilities.setCapability("noReset", "false");
        return desiredCapabilities;
    }
}
