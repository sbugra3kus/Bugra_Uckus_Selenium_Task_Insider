package Base;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class baseRules {

    public static TestWatcher createScreenshotRule(baseTest baseTest) {
        return new TestWatcher() {
            @Override
            protected void failed(Throwable e, Description description) {
                WebDriver driver = baseTest.getWebDriver();
                BufferedImage screenshot = Shutterbug.shootPage(driver, Capture.FULL).getImage();

                String screenshotFileName = "screenshots/" + description.getDisplayName() + ".png";
                File folder = new File("screenshots");
                boolean folderCreated = folder.mkdirs();

                if (!folderCreated) {
                    System.err.println("Klasör oluşturulamadı!");
                }

                try {

                    ImageIO.write(screenshot, "PNG", new File(screenshotFileName));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        };
    }
}
