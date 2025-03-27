package test;

import Base.baseTest;
import pages.careersPage;
import pages.homePage;
import pages.leverPage;
import pages.openPositionsPage;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class seleniumTaskRunner extends baseTest {
    private final Logger logger = LoggerFactory.getLogger(seleniumTaskRunner.class);
    homePage homePage;
    careersPage careersPage;
    openPositionsPage openPositionsPage;
    leverPage leverPage;
    @Before
    public void install(){
        homePage = new homePage(getWebDriver());
        careersPage = new careersPage(getWebDriver());
        openPositionsPage = new openPositionsPage(getWebDriver());
        leverPage = new leverPage(getWebDriver());

    }
    @Test
    public void goToCareerPageTest(){
        logger.info("Go to career page test is starting");
        homePage.navigateHomePage()
                .checkHomePageIsOpened()
                .acceptCookies()
                .clickCompany()
                .clickCareers();
        careersPage.checkCareerPageIsOpened()
                .isOurLocationsBlockVisible()
                .isLifeAtInsiderBlockVisible()
                .isTeamsBlockVisible();
        logger.info("Go to career page test finished");
    }
    @Test
    public void selectQAJobTest() {
        logger.info("select qa job test is starting");
        careersPage.navigateQualityAssurance();
        homePage.acceptCookies();
        careersPage.checkQACareerPageIsOpen()
                .clickSeeAllQAJobs();
        openPositionsPage.checkOpenPositionPageIsOpen()
                .checkDepartmentIsQualityAssurance()
                .changeLocationToIstanbul()
                .checkAllJobsIsInIstanbul()
                .checkAllDepartmentContainsQA()
                .clickViewRole()
                .switchNewTab();
        leverPage.checkLeverPageIsOpened();
        logger.info("select qa job test finished");
    }

}

