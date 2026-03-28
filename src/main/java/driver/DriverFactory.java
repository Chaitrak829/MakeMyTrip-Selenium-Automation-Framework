package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class DriverFactory {
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
        	
        	ChromeOptions options = new ChromeOptions();
            
            driver.set(new ChromeDriver(options));
        }
        else if(browser.equalsIgnoreCase("firefox"))
		{
			FirefoxOptions options = new FirefoxOptions();
			driver.set(new FirefoxDriver(options));
		}
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitBrowser() {
        driver.get().quit();
        driver.remove();
    }

}
