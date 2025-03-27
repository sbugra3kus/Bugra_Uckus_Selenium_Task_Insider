package Constants;

import org.openqa.selenium.By;

public class constants {
    public static final String BASE_URL = "https://useinsider.com/";
    public static final String HOME_PAGE_TITLE = "#1 Leader in Individualized, Cross-Channel CX — Insider";
    public static final By COMPANY_BUTTON = By.xpath("//a[normalize-space()='Company']");
    public static final By CAREERS_BUTTON = By.cssSelector("a[href='https://useinsider.com/careers/']");
    public static final By ACCEPT_COOKIES = By.id("wt-cli-accept-all-btn");
    public static final String CAREERS_PAGE_URL = "https://useinsider.com/careers/";
    public static final String CAREERS_PAGE_TITLE = "Ready to disrupt? | Insider Careers";
    public static final By OUR_LOCATIONS_SECTION = By.id("career-our-location");
    public static final By OUR_LOCATION_SECTION_TITLE = By.xpath("//h3[normalize-space()='Our Locations']");
    public static final By LOCATION_SLIDER = By.id("location-slider");
    public static final By LIFE_AT_INSIDER_SECTION = By.cssSelector("section[data-id='a8e7b90']");
    public static final By LIFE_AT_INSIDER_SECTION_TITLE = By.xpath("//h2[normalize-space()='Life at Insider']");
    public static final By TEAM_SECTION = By.xpath("//a[contains(.,'See all teams')]");
    public static final String QA_CAREER_PAGE_URL = "https://useinsider.com/careers/quality-assurance/";
    public static final String QA_CAREER_PAGE_TITLE = "Insider quality assurance job opportunities";
    public static final By QA_PAGE_H1_ELEMENT = By.xpath("//h1[normalize-space()='Quality Assurance']");
    public static final By SEE_ALL_QA_JOBS_BUTTON = By.cssSelector("a[href='https://useinsider.com/careers/open-positions/?department=qualityassurance']");
    public static final By JOB_LOCATION_TEXT = By.xpath("//div[@class='sort-by-time posting-category medium-category-label width-full capitalize-labels location']");
    public static final By JOB_DESC_TEXT = By.xpath("//div[@class='sort-by-team posting-category medium-category-label capitalize-labels department']");
    public static final String OPEN_POSITION_PAGE_TITLE = "Insider Open Positions | Insider";
    public static final By OPEN_POSITION_H3 = By.cssSelector(".mb-2");
    public static final By DEPARTMENT = By.id("select2-filter-by-department-container");
    public static final By LOCATION_SELECT_DROPDOWNMENU = By.xpath("//span[contains(@aria-labelledby,'select2-filter-by-location-container')]");
    public static final By LOCATION_SELECT_MENU = By.xpath("//li[contains(@class, 'select2-results__option') and contains(text(), 'Istanbul, Turkiye')]");
    public static final By POSITION_LOCATION_TEXT = By.xpath("//*[@class='position-location text-large']");
    public static final By POSITION_DEPARTMENT_TEXT = By.cssSelector(".position-department.text-large.font-weight-600.text-primary");
    public static final By JOB_CARD = By.xpath("(//p[contains(@class, 'position-title')])[1]");
    public static final By VIEW_ROLE = By.xpath("(//a[text()='View Role'])[1]");
    public static final By POSITION_ALL = By.id("select2-filter-by-location-results");
}
