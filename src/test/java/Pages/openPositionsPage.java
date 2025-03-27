package Pages;

import Base.basePage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static Constants.constants.*;

public class openPositionsPage extends basePage {
    private final Logger logger = LoggerFactory.getLogger(openPositionsPage.class);

    public openPositionsPage(WebDriver webDriver) {
        super(webDriver);
    }
    public openPositionsPage checkOpenPositionPageIsOpen(){
        logger.info("checking open positions page is open");
        checkPageTitle(OPEN_POSITION_PAGE_TITLE);
        checkElementText(OPEN_POSITION_H3,"All open positions");
        return this;
    }
    public openPositionsPage checkDepartmentIsQualityAssurance(){
        logger.info("checking the department select menu value is quality assurance");
        checkElementAttribute(DEPARTMENT,"title","Quality Assurance");
        return this;
    }
    public openPositionsPage changeLocationToIstanbul(){
        logger.info("changing the location to Istanbul, Turkey");
        click(LOCATION_SELECT_DROPDOWNMENU);
        hoverElement(POSITION_ALL);
        hoverElement(LOCATION_SELECT_MENU);
        click(LOCATION_SELECT_MENU);
        return this;
    }
    public openPositionsPage checkAllJobsIsInIstanbul(){
        logger.info("checking all listed jobs are in Istanbul");
        scrollUntilVisible(POSITION_LOCATION_TEXT);
        checkElementText(POSITION_LOCATION_TEXT,"Istanbul, Turkiye");
        return this;
    }
    public openPositionsPage checkAllDepartmentContainsQA(){
        logger.info("checking all listed jobs are in quality assurance department");
        scrollUntilVisible(POSITION_DEPARTMENT_TEXT);
        checkElementText(POSITION_DEPARTMENT_TEXT,"Quality Assurance");
        checkListText(POSITION_DEPARTMENT_TEXT,"Quality Assurance");
        return this;
    }
    public openPositionsPage clickViewRole() {
        logger.info("clicking the view role");
        scrollUntilVisible(JOB_CARD);
        hoverElement(JOB_CARD);
        click(VIEW_ROLE);
        return this;
    }
    public openPositionsPage redirectToLeverPage(){
        logger.info("redirect to the lever page");
        switchNewTab();
        return this;
    }
}
