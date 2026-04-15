package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.DriverFactory;
import pages.HomePage;
import pages.HotelsPage;
import utils.PropertyReaderUtil;

public class BaseTest {
	
	public WebDriver driver;
    public HomePage hp;
    public HotelsPage hotelsPage;

    @BeforeMethod
    public void setup() throws IOException {

        DriverFactory.initDriver(PropertyReaderUtil.getProperty("browser"));

        driver = DriverFactory.getDriver();

        driver.manage().window().maximize();
        driver.get(PropertyReaderUtil.getProperty("testurl"));

        hp = new HomePage(driver);
        hotelsPage = new HotelsPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitBrowser();
    }

}
