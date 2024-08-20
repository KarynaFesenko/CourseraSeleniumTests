package coursera.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindYourCareer extends BasePage {
    public FindYourCareer(WebDriver driver) {
        super(driver);
    }

    String FIND_YOUR_CAREER_PAGE_URL = "https://www.coursera.org/career-academy/?trk_ref=globalnav";
    @FindBy(xpath = "//div[@class= 'cds-9 css-fm49zv cds-10 cds-13']")
    public WebElement FIND_YOUR_CAREER_PAGE_BANNER;
    @FindBy(xpath = "//span[text() = 'Explore Careers']")
    public WebElement EXPLORE_CAREERS_BUTTON;
    @FindBy(xpath = "//div[@class='slick-slide slick-active slick-current']")
    public WebElement YOUTUBE_VIDEO;
    @FindBy(xpath = "//button[@data-track-component='view_all_career_cards']")
    public WebElement VIEW_ALL_BUTTON;
    @FindBy(xpath = "//h2[@class='cds-119 cds-Typography-base css-19j4xn8 cds-121']")
    public WebElement FREQUENTLY_ASKED_QUESTIONS_ELEMENT;
    @FindBy(xpath = "//button[@id='cds-react-aria-15-accordion-header']")
    public WebElement QUESTION_ELEMENT;

    @FindBy(xpath = "//* [@data-track-app= 'unified_career_academy']")
    public WebElement CAREER_CARDS;

    public FindYourCareer findCareerPageLoaded() {
        driver.get(FIND_YOUR_CAREER_PAGE_URL);
        Assertions.assertTrue(FIND_YOUR_CAREER_PAGE_BANNER.isDisplayed());
        return this;
    }
    public FindYourCareer checkCareerYoutubeVideo() {
        clickElement(YOUTUBE_VIDEO);
        Assertions.assertTrue(YOUTUBE_VIDEO.isDisplayed());
        return this;
    }
    public FindYourCareer findACareer() {
       clickElement(EXPLORE_CAREERS_BUTTON);
        Assertions.assertTrue(EXPLORE_CAREERS_BUTTON.isDisplayed());
        return this;
    }
    public FindYourCareer frequentlyAskedQuestions() {
        clickElement(FREQUENTLY_ASKED_QUESTIONS_ELEMENT);
        Assertions.assertTrue(QUESTION_ELEMENT.isDisplayed());
        return this;
    }
    public FindYourCareer viewAllCareerOptions(){
        clickElement(VIEW_ALL_BUTTON);
        Assertions.assertTrue(CAREER_CARDS.isDisplayed());
        return this;
    }
}
