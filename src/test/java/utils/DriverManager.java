package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {
    private static final ThreadLocal<AndroidDriver<MobileElement>> driver = new ThreadLocal<>();

    public static synchronized void setDriver(AndroidDriver<MobileElement> androidDriver) {
        driver.set(androidDriver);
    }

    public static synchronized AndroidDriver<MobileElement> getDriver() {

        return driver.get();
    }

    public static synchronized void killDriver() {
        driver.get().quit();
    }

}
