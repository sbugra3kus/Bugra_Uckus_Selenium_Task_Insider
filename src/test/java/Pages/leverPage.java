package pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static constants.constants.*;

public class leverPage extends BasePage {
    private final Logger logger = LoggerFactory.getLogger(leverPage.class);

    public leverPage(WebDriver webDriver) {
        super(webDriver);
    }
    public void checkLeverPageIsOpened(){
        logger.info("checking lever page is open");
        containsPageUrl("jobs.lever.co/useinsider");
        checkElementText(JOB_LOCATION_TEXT,"Istanbul, Turkiye");
        checkElementText(JOB_DESC_TEXT,"Quality Assurance /");
    }
}
