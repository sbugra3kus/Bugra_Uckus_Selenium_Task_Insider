package Pages;

import Base.basePage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static Constants.constants.*;

public class careersPage extends basePage {
    private final Logger logger = LoggerFactory.getLogger(careersPage.class);

    public careersPage(WebDriver webDriver) {
        super(webDriver);
    }
    public careersPage checkCareerPageIsOpened(){
        logger.info("checking career page is open");
        checkPageUrl(CAREERS_PAGE_URL);
        checkPageTitle(CAREERS_PAGE_TITLE);
        return this;
    }
    public careersPage isOurLocationsBlockVisible(){
        logger.info("checking our locations block is visible");
        checkElementDisplayed(OUR_LOCATIONS_SECTION);
        checkElementDisplayed(OUR_LOCATION_SECTION_TITLE);
        checkElementDisplayed(LOCATION_SLIDER);
        return this;
    }
    public careersPage isLifeAtInsiderBlockVisible(){
        logger.info("checking life at insider block is visible");
        checkElementDisplayed(LIFE_AT_INSIDER_SECTION);
        checkElementDisplayed(LIFE_AT_INSIDER_SECTION_TITLE);
        return this;
    }
    public void isTeamsBlockVisible(){
        logger.info("checking team block is visible");
        checkElementDisplayed(TEAM_SECTION);

    }
    public careersPage navigateQualityAssurance(){
        navigateUrl(QA_CAREER_PAGE_URL);
        return this;
    }
    public careersPage checkQACareerPageIsOpen(){
        checkPageTitle(QA_CAREER_PAGE_TITLE);
        checkElementDisplayed(QA_PAGE_H1_ELEMENT);
        return this;
    }
    public void clickSeeAllQAJobs(){
        click(SEE_ALL_QA_JOBS_BUTTON);
    }

}
