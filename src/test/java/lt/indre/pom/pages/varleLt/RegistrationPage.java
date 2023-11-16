package lt.indre.pom.pages.varleLt;

import lt.indre.pom.pages.Common;
import lt.indre.pom.pages.Locator;
import org.openqa.selenium.By;

public class RegistrationPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }
    public static void acceptLeistiVisusSlapukus() {
        Common.waitElementWhenVisible(Locator.Varle.SetUp.cookies,8);
        Common.clickOnElement(Locator.Varle.SetUp.cookies);
    }

    public static void clickOnRegistracija() {
        Common.clickOnElement(Locator.Varle.Registration.selectRegistracija);
    }

    public static void clickOnTextRegistruotis() {
        Common.clickOnElement(Locator.Varle.Registration.textRegistruotis);
    }

    public static void inputValidElPastas(String email) {
        Common.sendKeysToElement(Locator.Varle.Registration.inputElPastas,
                email
        );
    }

    public static void inputSlaptazodis(String attributeId, String password) {
        Common.sendKeysToElement(
                Locator.Varle.Registration.attributeIdSlaptazodis(attributeId),
                password
        );
    }

    public static void clickOnCheckboxSusipazinauSuNaudojimoTaisyklemis() {
        Common.clickOnElement(Locator.Varle.Registration.checkboxSusipazinauSuTaisyklemis);
    }

    public static void clickOnButtonRegistruotis() {
        Common.clickOnElement(Locator.Varle.Registration.buttonRegistruotis);
    }

    public static void clickOnMyAccountSveiki() {
        Common.clickOnElement(Locator.Varle.Registration.myAccount);
    }

    public static void clickOnManoDuomenys() {
        Common.clickOnElement(Locator.Varle.Registration.manoDuomenys);
    }

    public static void clickOnNaikintiPaskyra() {
        Common.clickOnElement(Locator.Varle.Registration.naikintiPaskyra);
    }

    public static void clickOnTaipToSubmitDeleteAccount() {
        Common.clickOnElement(Locator.Varle.Registration.buttonTaipsubmitDeleteAccount);
    }

    public static String readSveikiAccountName() {
        return Common.getTextFromElement(Locator.Varle.Registration.messageSveikiAccountName);
    }
}