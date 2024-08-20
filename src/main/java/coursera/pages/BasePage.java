package coursera.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.parallel.Execution;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends PageGenerator {
    WebDriverWait wait;
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public BasePage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    void clickElement(WebElement element) {
        logger.info("Clicking on element" + element);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        } catch (Exception error) {
            logger.error("Error occurred while clicking on element" + element);
            error.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }
    public WebElement waitForElement(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void sendKeysToElement(WebElement element, String keys){
        logger.info("Keys have been sent to the element");
        try{
            wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(keys);
        }
        catch(Exception error){
            logger.error("Error occurred while sending keys to element" + element);
        }
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(keys);
    }
    }
