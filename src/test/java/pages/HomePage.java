package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Locators
    By closePopup = By.xpath("//span[@data-cy='closeModal']");
    By hotelsMenu = By.xpath("//span[text()='Hotels']");
    By city = By.id("city");
    By cityInput = By.xpath("//input[@placeholder='Where do you want to stay?']");
    By mumbaiOption = By.xpath("//p[contains(text(),'Mumbai')]");
    By searchButton = By.id("hsw_search_button");

    public void searchHotelsInMumbai() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));

        // Close login popup (if present)
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(closePopup)).click();
        } catch (Exception e) {
            System.out.println("Popup not displayed");
        }

        // Click Hotels
        wait.until(ExpectedConditions.elementToBeClickable(hotelsMenu)).click();

        // Click city field
        wait.until(ExpectedConditions.elementToBeClickable(city)).click();

        // Enter Mumbai
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityInput)).sendKeys("Mumbai");

        // Select Mumbai option
        wait.until(ExpectedConditions.elementToBeClickable(mumbaiOption)).click();

        // Wait for Search button to be clickable
        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(searchButton));

        // Scroll to the button (important for MakeMyTrip)
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchBtn);

        // Click using JavaScript (prevents intercepted click error)
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchBtn);
    }

}
