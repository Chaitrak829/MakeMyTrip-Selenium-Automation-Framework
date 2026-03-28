package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelsPage {
	
    WebDriver driver;
    
    By hotelsList = By.xpath("//div[contains(@class,'listingRow')]//span[contains(@class,'wordBreak')]");

    public HotelsPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getAllHotels() throws Exception {

        Thread.sleep(6000);

        // Scroll to load hotels
        for (int i = 0; i < 7; i++) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1200)");
            Thread.sleep(2000);
        }

        List<WebElement> hotels = driver.findElements(hotelsList);

        List<String> hotelNames = new ArrayList<>();

        for (WebElement hotel : hotels) {
            hotelNames.add(hotel.getText());
        }

        return hotelNames;
    }

}
