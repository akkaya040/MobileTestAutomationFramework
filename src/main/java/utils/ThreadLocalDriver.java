package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ThreadLocalDriver {
    private static final ThreadLocal<AndroidDriver<MobileElement>> driver = new ThreadLocal<>();

    public static synchronized void setDriver(AndroidDriver<MobileElement> driver) {
        ThreadLocalDriver.driver.set(driver);
    }

    public static synchronized AndroidDriver<MobileElement> getDriver() {

        return driver.get();
    }
}
