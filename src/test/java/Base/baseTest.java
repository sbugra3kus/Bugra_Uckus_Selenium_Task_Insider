package Base;

import Enums.BrowserType;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class baseTest {
    private static WebDriver webDriver;
    private static final Logger logger = LoggerFactory.getLogger(baseTest.class);

    @BeforeClass
    public static void setupClass() {
        String browser = System.getProperty("browser", "chrome"); // Varsayılan olarak chrome
        BrowserType browserType = BrowserType.valueOf(browser.toUpperCase());

        logger.info("---Test setup is starting---");
        switch (browserType) {
            case CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--disable-popup-blocking");
                chromeOptions.addArguments("start-maximized");
                webDriver = new ChromeDriver(chromeOptions);
                break;
            case EDGE:
                EdgeOptions edgeOptions = new EdgeOptions();
                webDriver = new EdgeDriver(edgeOptions);
                break;
            case FIREFOX:
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                webDriver = new FirefoxDriver(firefoxOptions);
                break;
            case SAFARI:
                SafariOptions safariOptions = new SafariOptions();
                webDriver = new SafariDriver(safariOptions);
                break;
        }

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        logger.info(browser + " driver initialized.");
    }

    @Before
    public void beforeTest() {
        String baseUrl = System.getProperty("baseUrl", "https://useinsider.com/"); // Varsayılan URL
        webDriver.get(baseUrl);
        logger.info("Navigated to: " + baseUrl);
    }

    @AfterClass
    public static void tearDownClass() {
        if (webDriver != null) {
            takeScreenshot("final_state"); // Test tamamlanırken ekran görüntüsü al
            webDriver.quit();
            logger.info("---Test finished---");
        }
    }

    public static void takeScreenshot(String fileName) {
        try {
            File screenshotFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
            File screenshotsFolder = new File("screenshots");
            if (!screenshotsFolder.exists()) {
                screenshotsFolder.mkdir();
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
            String timestamp = LocalDateTime.now().format(formatter);
            String screenshotFileName = "screenshots/" + fileName + "_" + timestamp + ".png";
            FileHandler.copy(screenshotFile, new File(screenshotFileName));
            logger.info("Screenshot taken and saved as: " + screenshotFileName);
        } catch (IOException e) {
            logger.error("Failed to take screenshot: " + e.getMessage());
        }
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
