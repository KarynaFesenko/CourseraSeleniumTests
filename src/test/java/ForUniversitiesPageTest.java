import coursera.pages.ForUniversitiesPage;
import org.junit.jupiter.api.Test;
import utils.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.Tag;

public class ForUniversitiesPageTest extends BaseTest {
    @Epic("For Universities Page")
    @Feature("Navigation")
    @Story("Verify if user can navigate to Universities Page")
    @Severity(SeverityLevel.MINOR)
    @Tag("Smoke")
    @Test
    public void universitiesPageLoading() {
        pageGenerator.getPage(ForUniversitiesPage.class)
                .forUniversitiesLoadPage();
    }
    @Epic("For Universities Page")
    @Feature("Career Opportunities")
    @Story("Verify if user can use the option of learn Career Opportunity")
    @Severity(SeverityLevel.MINOR)
    @Tag("Smoke")
    @Test
    public void learnCareerOpportunityTest() {
        pageGenerator.getPage(ForUniversitiesPage.class)
                .forUniversitiesLoadPage()
                .learCareerOpportunity();
    }
}
