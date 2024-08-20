package coursera.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineDegreesPage extends BasePage {
    public OnlineDegreesPage(WebDriver driver) {
        super(driver);
    }

    String ONLINE_DEGREE_PAGE_URL = "https://www.coursera.org/degrees";
    @FindBy(xpath = "//*[@class='css-cxybwo cds-ProductCard-partners']")
    public WebElement ONLINE_DEGREE_CARDS;
    @FindBy(xpath = "//span[@class= 'cds-multiSelectController-label css-tvqrra']")
    public WebElement PROGRAM_LEVEL_FILTER;

    @FindBy(xpath = "//*[@class='cds-multiSelectOption-checkboxIcon css-0']")
    public WebElement BACHELORS_DEGREE;

    @FindBy(xpath = "//*[@class='cds-button-label']")
    public WebElement APPLY_BUTTON;

    @FindBy(xpath = "//div [@class= 'cds-ProductCard-base cds-ProductCard-grid css-1gwppjr']")
    public WebElement UNIVERSITY_CARD;

    public OnlineDegreesPage onlineDegreesPageLoadingTest() {
        Assertions.assertTrue(ONLINE_DEGREE_CARDS.isDisplayed());
        return this;
    }
    public void selectUniversityByFilters() {
        driver.get(ONLINE_DEGREE_PAGE_URL);
        clickElement(PROGRAM_LEVEL_FILTER);
        clickElement(BACHELORS_DEGREE);
        clickElement(APPLY_BUTTON);
        Assertions.assertTrue(UNIVERSITY_CARD.isDisplayed());
    }
    public void chooseFilteredUniversityByCard() {
        driver.get(ONLINE_DEGREE_PAGE_URL);
        clickElement(UNIVERSITY_CARD);
        Assertions.assertTrue(ONLINE_DEGREE_CARDS.isDisplayed());
    }
}
