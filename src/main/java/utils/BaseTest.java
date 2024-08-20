package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import coursera.pages.PageGenerator;

import java.time.Duration;
@ExtendWith(CustomTestWatcher.class)
public class BaseTest {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static PageGenerator pageGenerator;

    @BeforeEach
    public void setupClass(){
        WebDriverManager.chromedriver().clearDriverCache();
        WebDriverManager.chromedriver().setup();
        ChromeOptions options =  new ChromeOptions();
        options.addArguments("--start-maximized");
//        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        pageGenerator = new PageGenerator(driver);
        CustomTestWatcher watcher = new CustomTestWatcher();
        watcher.setDriver(driver);
    }

    @AfterEach
    public void TearDown(){
        driver.quit();

    }

}
