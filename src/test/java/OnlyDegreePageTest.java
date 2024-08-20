import coursera.pages.OnlineDegreesPage;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import utils.BaseTest;
import org.junit.jupiter.api.Tag;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;

public class OnlyDegreePageTest extends BaseTest {

    @Epic("For Universities Page")
    @Feature("Filtering")
    @Story("Verify if user can filter universities")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Smoke")
    @Test
    public void selectUniversityByFilterTest(){
        pageGenerator.getPage(OnlineDegreesPage.class)
                .onlineDegreesPageLoadingTest()
                .selectUniversityByFilters();
    }

    @Epic("For Universities Page")
    @Feature("Filtering")
    @Story("Verify if user can select filtered universities")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Smoke")
    @Test
    public void checkFilteredUniversityByCard(){
        pageGenerator.getPage(OnlineDegreesPage.class)
                .chooseFilteredUniversityByCard();

    }

}
