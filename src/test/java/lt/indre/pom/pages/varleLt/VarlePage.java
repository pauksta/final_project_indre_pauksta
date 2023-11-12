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

    public static void inputValidElPastas(String elPastas) {
        Common.sendKeysToElement(Locator.Varle.VarleLtWebsite.inputElPastas,
                elPastas
        );
    }

    public static void inputSlaptazodis(String attributeId, String slaptazodis) {
        Common.sendKeysToElement(
                Locator.Varle.VarleLtWebsite.attributeIdSlaptazodis(attributeId),
                slaptazodis
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
}
