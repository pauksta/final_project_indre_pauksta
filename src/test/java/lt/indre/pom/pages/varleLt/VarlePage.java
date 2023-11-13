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

    public static void clickOnCheckboxSusipazinauSuNaudojimoTaisyklemis() {
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
    public static void writeItemTitleInPaieska(String itemTitle) {
        Common.sendKeysToElement(
                Locator.Varle.VarleLtWebsite.inputPaieska,
                itemTitle
        );
    }
    public static void clickOnRequiredFirstItemTitle() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.requiredFirstItemTitle);
    }
    public static void clickOnButtonIKrepseli() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.buttonIKrepseli);
    }
    public static String readMessageAfterItemPutToKrepselis() {
        return Common.getTextFromElement(Locator.Varle.VarleLtWebsite.paragraphPrekeItraukaIKrepseli);
    }
    public static void clickOnbuttonPrekintisToliau() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.buttonPrekintisToliau);
    }
    public static void clickOnPrekiuKrepselis() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.buttonPrekiuKrepselis);
    }
    public static void clickOnItem() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.kavosaparatas);
    }
    public static void clickOnPlusToIncreaseQuantityOfItem() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.buttonQuantityUp);
    }
    public static void clickOnXToRemoveItemsFromKrepselis() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.buttonRemoveItemFromKrepselis);
    }
    public static String readMessageEmptyBasket() {
        return Common.getTextFromElement(Locator.Varle.VarleLtWebsite.paragraphEmptyBasket);
    }
    public static void clickOnButtonVisosPrekes() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.buttonVisosPrekes);
    }
    public static void clickOnCategoryTelefonaiFotoVideo() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.categoryTelefonaiFotoVideo);
    }

    public static void inputCategoryTitle(String categoryTitle) {
        Common.sendKeysToElement(Locator.Varle.VarleLtWebsite.inputCategoryTitle,
                categoryTitle
        );
    }

    public static void clickOnCategoryMobiliejiTelefonai() {
        Common.clickOnElement(Locator.Varle.VarleLtWebsite.inputMobiliejiTelefonai);
    }


}
