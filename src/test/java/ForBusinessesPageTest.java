import coursera.pages.FindYourCareer;
import coursera.pages.ForBusinessesPage;
import org.junit.jupiter.api.Test;
import utils.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.Tag;

public class ForBusinessesPageTest extends BaseTest {
    @Epic("Businesses Page")
    @Feature("Navigation")
    @Story("Verify if user can navigate to Businesses Page ")
    @Severity(SeverityLevel.MINOR)
    @Tag("Smoke")
    @Test
    public void businessPageLoadingTest() {
        pageGenerator.getPage(ForBusinessesPage.class).businessPageLoading();
    }

    @Epic("Businesses Page")
    @Feature("Contact us option")
    @Story("Verify if user can use Contact Us option")
    @Severity(SeverityLevel.MINOR)
    @Tag("smoke")
    @Test
    public void goToContactUsTest() {
        pageGenerator.getPage(ForBusinessesPage.class)
                .businessPageLoading()
                .goToContactUs();
    }

    @Epic("Businesses Page")
    @Feature("Search elements")
    @Story("Verify if user can search elements from Catalog")
    @Severity(SeverityLevel.MINOR)
    @Tag("Smoke")
    @Test
    public void searchCatalogTest() {
        pageGenerator.getPage(ForBusinessesPage.class)
                .businessPageLoading()
                .searchCatalog("Computer Science");
    }

    @Epic("Businesses Page")
    @Feature("Reports")
    @Story("Verify is user can open reports")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Smoke")
    @Test
    public void checkGlobalReportsTest() {
        pageGenerator.getPage(ForBusinessesPage.class)
                .businessPageLoading()
                .checkGlobalReports();
    }

}
