package coursera.pages;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursesPage extends BasePage{
    public CoursesPage(WebDriver driver) {
        super(driver);
    }
    String SEARCH_PAGE_URL = "https://www.coursera.org/search?";
    @FindBy(xpath = "//* [@class='cds-9 css-1oe69pk cds-11 cds-grid-item cds-56 cds-81']")
    public WebElement coursesCards;
    @FindBy(xpath = "//*[@aria-label='Search by keyword']")
    public WebElement SKILLS_SEARCH;
    @FindBy(xpath = "//*[@class='cds-ProductCard-base cds-ProductCard-grid css-1gwppjr']")
    public WebElement SKILLS_CARDS;

    public CoursesPage coursesPageLoading(){
        driver.get(SEARCH_PAGE_URL);
        Assertions.assertTrue(coursesCards.isDisplayed());
        return this;
    }
    public CoursesPage searchSkills(String skillsName){
        sendKeysToElement(SKILLS_SEARCH, skillsName);
        Assertions.assertTrue(SKILLS_CARDS.isEnabled());
        return this;
    }
}
