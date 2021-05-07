package com.opencart.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverRepository {
    public static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();
    public static WebDriver webDriver;

    public DriverRepository() {
    }

    public static void downLoadWebDriver() {
        WebDriverManager.chromedriver().setup();
    }

    public static void instanceWebBrowser() {
        webDriver = new ChromeDriver();
        DRIVERS.set(webDriver);
    }

    public static void closeBrowser(){
        webDriver.quit();
    }
}
