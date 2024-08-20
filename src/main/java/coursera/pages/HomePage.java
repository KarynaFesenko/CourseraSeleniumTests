package coursera.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    //**********Constructor********
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //**********Variables********

    String HOME_PAGE_URL = "https://www.coursera.org/";

    //**********WebElements********
    @FindBy(xpath = "//* [@id= 'search-autocomplete-input']")
    public WebElement SEARCH_FIELD;
    @FindBy(xpath = "//div[@class= 'cds-9 css-1kspkkz cds-10']")
    public WebElement HOME_BANNER;
    @FindBy(xpath = "//* [@data-track-component='page_nav_link_online_career']")
    public WebElement FIND_YOUR_NEW_CAREER;

    @FindBy(how = How.XPATH, using = "//button [@data-track-component= 'explore_button']")
    public WebElement EXPLORE_BUTTON;

    @FindBy(xpath = "//* [@data-track-component='navigation_meta_nav_Business']")
    public WebElement FOR_BUSINESSES;

    @FindBy(xpath = "//* [@data-track-component='navigation_meta_nav_Campus']")
    public WebElement FOR_UNIVERSITIES;
    @FindBy(xpath = "//a[@data-track-component= 'page_nav_link_online_degrees']")
    public WebElement ONLINE_DEGREES;

    //**********PageMethods********

    public HomePage goToHomePage() {
        driver.get(HOME_PAGE_URL);
        Assertions.assertTrue(HOME_BANNER.isDisplayed());
        return this;
    }

    public HomePage givenIAmAtHomePage() {
        goToHomePage();
        return this;
    }

    public HomePage verifyHomePageIsLoaded() {
        Assertions.assertTrue(HOME_BANNER.isDisplayed());
        return this;
    }

    public FindYourCareer goToFindNewCareerPage() {
        driver.get(HOME_PAGE_URL);
        FIND_YOUR_NEW_CAREER.click();
        return new PageGenerator(driver).getPage(FindYourCareer.class);
    }

    public OnlineDegreesPage goToOnlineDegreesPage() {
        driver.get(HOME_PAGE_URL);
        ONLINE_DEGREES.click();
        return new PageGenerator(driver).getPage(OnlineDegreesPage.class);
    }

    public ForBusinessesPage goToForBusinessPage() {
        FOR_BUSINESSES.click();
        return new PageGenerator(driver).getPage(ForBusinessesPage.class);
    }

    public ForUniversitiesPage goToForUniversitiesPage(){
        FOR_UNIVERSITIES.click();
        return new PageGenerator(driver).getPage(ForUniversitiesPage.class);
    }

    public CoursesPage searchForCourses(String course) {
        sendKeysToElement(SEARCH_FIELD, course);
        return new PageGenerator(driver).getPage(CoursesPage.class);
    }

}

