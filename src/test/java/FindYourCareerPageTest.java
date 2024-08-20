import coursera.pages.FindYourCareer;
import io.qameta.allure.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.BaseTest;

public class FindYourCareerPageTest extends BaseTest {

    @Epic("Find Career Page")
    @Feature("Career video")
    @Story("Verify that youtube video  about career is loading")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Sanity test")
    @Test
    public void checkCareerYoutubeVideoTest() {
        pageGenerator.getPage(FindYourCareer.class)
                .findCareerPageLoaded()
                .checkCareerYoutubeVideo();
    }

    @Epic("Find Career Page")
    @Feature("Career options")
    @Story("Verify career options")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Sanity test")
    @Test
    public void findCareerTest() {
        pageGenerator.getPage(FindYourCareer.class)
                .findCareerPageLoaded()
                .findACareer();
    }

    @Epic("Find Career Page")
    @Feature("Q&A")
    @Story("Verify questions and answers on them")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Sanity test")
    @Test
    public void frequentlyAskedQuestionsTest() {
        pageGenerator.getPage(FindYourCareer.class)
                .findCareerPageLoaded()
                .frequentlyAskedQuestions();
    }

    @Epic("Find Career Page")
    @Feature("Different career options")
    @Story("Verify that user can load more career options")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Sanity test")
    @Test
    public void viewAllCareerOptionsTest() {
        pageGenerator.getPage(FindYourCareer.class)
                .findCareerPageLoaded()
                .viewAllCareerOptions();
    }

}
