package lt.indre.pom.pages.varle_Lt;

import lt.indre.pom.pages.Common;
import lt.indre.pom.pages.Locator;

public class LoginPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }
    public static void acceptLeistiVisusSlapukus() {
        Common.waitElementWhenVisible(Locator.Varle.SetUp.buttonCookies,8);
        Common.clickOnElement(Locator.Varle.SetUp.buttonCookies);
    }

    public static void clickOnPrisijungimas() {
        Common.clickOnElement(Locator.Varle.Login.labelPrisijungimas);

    }
    public static void writeDataInPrisijungimasFields(String attributeId, String attribute2Id, String email) {
        Common.sendKeysToElement(Locator.Varle.Login.attributeIdPrisijungimas(attributeId, attribute2Id),
                email);
    }
    public static void clickOnButtonPrisijungti() {
        Common.clickOnElement(Locator.Varle.Login.buttonPrisijungti);
    }

    public static String readMessageAfterUnsuccessfulLogin() {
        return Common.getTextFromElement(Locator.Varle.Login.messageAfterUnsuccessfulLogin);
    }


}
