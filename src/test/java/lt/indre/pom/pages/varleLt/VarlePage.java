package lt.indre.pom.pages.varleLt;

import lt.indre.pom.pages.Common;
import org.openqa.selenium.By;

public class VarlePage {
        public static void openChrome(String url) {
            Common.setUpChrome();
            Common.openUrl(url);
        }
    public static void acceptLeistiVisusSlapukus() {
        By locator = By.xpath("//button [@id = 'CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll' ]");
        Common.waitElementWhenVisible(locator, 8);
        Common.clickOnElement(locator);
    }
}
