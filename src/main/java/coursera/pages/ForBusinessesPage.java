package coursera.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForBusinessesPage extends BasePage{
    public ForBusinessesPage(WebDriver driver) {
        super(driver);
    }

    String BUSINESS_PAGE_URL = "https://www.coursera.org/business";

    @FindBy(xpath = "//*[@data-track-component='EntWebsiteHow_make_your_talent_your_competitive_advantage']")
    public WebElement MAIN_BANNER;

    @FindBy(xpath = "//*[@class='cds-149 ContentfulButton cds-button-disableElevation cds-button-primary css-3fwzhc']" )
    public WebElement CONTACT_US_BUTTON;

    @FindBy(xpath = "//*[@class='cds-9 BlockLayout-contentGrid css-7opsvk cds-11 cds-grid-item cds-56']")
    public WebElement CONTACT_US_FORM;

    @FindBy(xpath = "//*[@class='cds-149 ContentfulButton cds-button-disableElevation cds-button-primary css-3fwzhc']" )
    public WebElement SEARCH_ELEMENT;

    @FindBy(xpath = "//*[@class='image-wrapper vertical-box']")
    public WebElement CATALOG_CARDS;

    @FindBy(xpath = "//*[@class='cds-9 css-1a7jh55 cds-11 cds-grid-item cds-56 cds-58']" )
    public WebElement REPORT_CARDS;

    public ForBusinessesPage businessPageLoading(){
        driver.get(BUSINESS_PAGE_URL);
        Assertions.assertTrue(MAIN_BANNER.isDisplayed());
        return this;
    }
    public ForBusinessesPage goToContactUs(){
        clickElement(CONTACT_US_BUTTON);
        Assertions.assertTrue(CONTACT_US_FORM.isDisplayed());
        return this;
    }
    public ForBusinessesPage searchCatalog(String name){
        sendKeysToElement(SEARCH_ELEMENT, name);
        Assertions.assertTrue(CATALOG_CARDS.isDisplayed());
        return this;
    }
    public void checkGlobalReports(){
        businessPageLoading();
        clickElement(REPORT_CARDS);
    }
}
