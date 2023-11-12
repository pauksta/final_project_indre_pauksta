package lt.indre.pom.pages.varleLt;

import lt.indre.pom.pages.Common;
import lt.indre.pom.pages.Locator;
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

    public static void clickOnButtonPrisijungimas() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.buttonPrisijungimas);
    }

    public static void clickOnTextRegistruotis() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.textRegistruotis);
    }

    public static void inputValidElPastas(String email) {
        Common.sendKeysToElement(Locator.Varle.VarleLtWebsite.inputElPastas,
                email
        );
    }

    public static void inputSlaptazodis(String attributeId, String password) {
        Common.sendKeysToElement(
                Locator.Varle.VarleLtWebsite.attributeIdSlaptazodis(attributeId),
                password
        );
    }

    public static void clickToCheckSusipazinauSuNaudojimoTaisyklemis() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.buttonSusiipazinauSuTaisyklemis);
    }

    public static void clickOnButtonRegistruotis() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.buttonRegistruotis);
    }

    public static void clickOnProfile() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.myAccount);
    }

    public static void clickOnButtonManoDuomenys() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.buttonManoDuomenys);
    }

    public static void clickOntextNaikintiPaskyra() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.buttonNaikintiPaskyra);
    }

    public static void clickOnTaipToSumbitDeleteAccount() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.buttonTaipsubmitDeleteAccount);
    }

    public static String readMessagetoSumbitToDeleteAccount() {
        return Common.getTextFromElement(Locator.Varle.VarleLtWebsite.paragraphtoSubmitToDeleteAccount);
    }

    public static void writeDataInPrisijungimasFields(String attributeId, String attribute2Id, String email) {
        Common.sendKeysToElement(Locator.Varle.VarleLtWebsite.attributeIdPrisijungimas(attributeId, attribute2Id),
                email);
    }
    public static void clickOnButtonPrisijungti() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.buttonPrisijungti);
    }

    public static String readMessageAfterUnsuccessfulLogin() {
        return Common.getTextFromElement(Locator.Varle.VarleLtWebsite.messageAfterUnsuccessfulLogin);
    }


}
