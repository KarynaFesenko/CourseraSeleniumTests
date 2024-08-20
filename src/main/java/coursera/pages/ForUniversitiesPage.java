package coursera.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForUniversitiesPage extends BasePage{
    public ForUniversitiesPage(WebDriver driver) {
        super(driver);
    }

    String FOR_UNIVERSITIES_URL = "https://www.coursera.org/campus";
     @FindBy(xpath = "//* [@class='cds-149 ContentfulButton cds-button-disableElevation cds-button-primary css-3fwzhc']")
    public WebElement CONTACT_US_BUTTON;
     @FindBy(xpath = "//*[@data-track-component='EntWebsiteHow_c4c_homepage_hero_content']")
    public WebElement MAIN_BANNER;
     @FindBy(xpath = "//div[@class='useFloatingLabels css-esaiwz']")
    public WebElement CONTACT_SALES_TEAM_FORM;

    public ForUniversitiesPage forUniversitiesLoadPage(){
        driver.get(FOR_UNIVERSITIES_URL);
        Assertions.assertTrue(MAIN_BANNER.isDisplayed());
        return this;
    }
    public ForUniversitiesPage learCareerOpportunity(){
        clickElement(CONTACT_US_BUTTON);
        Assertions.assertTrue(CONTACT_SALES_TEAM_FORM.isDisplayed());
        return this;
    }

}
