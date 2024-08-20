import coursera.pages.CoursesPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import utils.BaseTest;

public class CoursesPageTest extends BaseTest {

    //    @Epic("For Universities Page")
    //    @Feature("Navigation")
    //    @Story("Verify if user can navigate to Universities Page")
    //    @Severity(SeverityLevel.MINOR)
    //    @Tag("Smoke")

    @Test
    public void coursePageLoadingTest() {
        pageGenerator.getPage(CoursesPage.class)
                .coursesPageLoading();
    }

    @ParameterizedTest
    @ValueSource(strings = {"strategy", "data base", "java"})
    public void searchSkillsTest(String skills) {
        pageGenerator.getPage(CoursesPage.class)
                .coursesPageLoading().searchSkills(skills);
    }
}
