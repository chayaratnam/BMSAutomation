package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver(String browser) {
        if(driver.get() == null) {
            WebDriverManager.chromedriver().setup();
            driver.set(new ChromeDriver());
            driver.get().manage().window().maximize();
        }
        return driver.get();
    }

    public static void quitDriver() {
        if(driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
