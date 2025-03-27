package pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static constants.constants.*;

public class homePage extends BasePage {
    private final Logger logger = LoggerFactory.getLogger(homePage.class);

    public homePage(WebDriver webDriver) {
        super(webDriver);
    }

    public homePage navigateHomePage(){
        logger.info("Navigating to home page");
        navigateUrl(BASE_URL);
        return this;
    }
    public homePage checkHomePageIsOpened(){
        logger.info("checking the home page is open");
        checkPageUrl(BASE_URL);
        checkPageTitle(HOME_PAGE_TITLE);
        return this;
    }
    public homePage acceptCookies(){
        logger.info("click the accept cookies");
        click(ACCEPT_COOKIES);
        return this;
    }
    public homePage clickCompany(){
        logger.info("click the company button");
        click(COMPANY_BUTTON);
        return this;
    }
    public void clickCareers(){
        logger.info("click the careers button");
        click(CAREERS_BUTTON);
    }

}


