import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import coursera.pages.HomePage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import utils.BaseTest;


public class HomePageTest extends BaseTest {

    @Epic("Coursera Home Page")
    @Feature("Navigation")
    @Story("Verify that user can navigate to the home page")
    @Severity(SeverityLevel.CRITICAL)
    @Tag("Sanity test")
    @Test
    public void homePageLoadedTest() {
        pageGenerator.getPage(HomePage.class).givenIAmAtHomePage()
                .verifyHomePageIsLoaded();
    }

    @Epic("Coursera Career Page")
    @Feature("Navigation")
    @Story("Verify that user can navigate to the Career Page")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Sanity test")
    @Test
    public void goToFindYourCareerPageTest() {
        pageGenerator.getPage(HomePage.class).goToFindNewCareerPage();
    }

    @Epic("Degrees Page")
    @Feature("Navigation")
    @Story("Verify that user can navigate to the Degrees Page")
    @Severity(SeverityLevel.MINOR)
    @Tag("Sanity test")
    @Test
    public void goToOnlineDegreesPageTest() {
        pageGenerator.getPage(HomePage.class).goToOnlineDegreesPage();
    }

    @Epic("Coursera For Businesses Page")
    @Feature("Navigation")
    @Story("Verify that user can navigate to the For Businesses Page")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Sanity test")
    @Test
    public void ForBusinessesPageTest() {
        pageGenerator.getPage(HomePage.class)
                .givenIAmAtHomePage()
                .goToForBusinessPage();
    }

    @Epic("Coursera For Universities Page")
    @Feature("Navigation")
    @Story("Verify that user can navigate to the For Universities Page")
    @Severity(SeverityLevel.MINOR)
    @Tag("Sanity test")
    @Test
    public void ForUniversitiesPageTest() {
        pageGenerator.getPage(HomePage.class)
                .givenIAmAtHomePage()
                .goToForUniversitiesPage();
    }

    @Epic("Search courses")
    @Feature("Searching")
    @Story("Verify that user can search courses")
    @Severity(SeverityLevel.MINOR)
    @Tag("Sanity test")
    @ParameterizedTest
    @ValueSource(strings = {"QA", "Devops", "Designer"})
    public void checkCourses(String coursesName) {
        pageGenerator.getPage(HomePage.class)
                .givenIAmAtHomePage()
                .searchForCourses(coursesName);
    }
}


