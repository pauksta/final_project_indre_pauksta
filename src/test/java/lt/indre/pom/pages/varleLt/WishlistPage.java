package lt.indre.pom.pages.varleLt;

import lt.indre.pom.pages.Common;
import lt.indre.pom.pages.Locator;

public class WishlistPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void acceptLeistiVisusSlapukus() {
        Common.waitElementWhenVisible(Locator.Varle.SetUp.cookies,8);
        Common.clickOnElement(Locator.Varle.SetUp.cookies);
    }

    public static void inputItemTitleSoyssSampunasOleoItenseInPaieska(String itemTitle) {
        Common.sendKeysToElement(
                Locator.Varle.WishList.inputInPaieska, itemTitle
        );
    }

    public static void clickOnPaieskaWithAction() {
        Common.clickEnterButton();

    }

    public static void clickOnItemSoyssSampunasOleoItense() {
        Common.clickOnElement(Locator.Varle.WishList.itemSoyssSampunasOleoItense);
    }

    public static void clickOnHeartSymbolToPutItemSoyssSampunasOleoItemToPatikusiosPrekes() {
        Common.clickOnElement(Locator.Varle.WishList.checkboxSymbolHeart);


    }

    public static void clickOnVarleLogoToReturnVarleMainPage() {
        Common.clickOnElement(Locator.Varle.WishList.logoVarle);
    }

    public static void clickOnPrisijungimas() {
        Common.clickOnElement(Locator.Varle.WishList.selectPrisijungimas);
    }

    public static void writeDataInPrisijungimasFields(String attributeId, String attribute2Id, String email) {
        Common.sendKeysToElement(Locator.Varle.WishList.attributeIdPrisijungimas(attributeId, attribute2Id),
                email);
    }

    public static void clickOnButtonPrisijungti() {
        Common.clickOnElement(Locator.Varle.WishList.buttonPrisijungti);
    }

    public static void clickOnPatikusiosPrekes() {
        Common.clickOnElement(Locator.Varle.WishList.selectPatikusiosPrekes);
    }

    public static String readMessagePatikusiosPrekes() {
        return Common.getTextFromElement(Locator.Varle.WishList.textPatikusiosPrekes)
                + "\n" +
                Common.getTextFromElement(Locator.Varle.WishList.titleSoyssSampunasOleoIntense);
    }

    public static void clickOnHeartSymbolToRemoveItemFromWishlist() {
        Common.clickOnElement(Locator.Varle.WishList.heartSymbol);
    }

    public static void clickButtonAtsijungti() {
        Common.clickOnElement(Locator.Varle.WishList.buttonAtsijungti);
    }

    public static void clickPasalintiToRemoveItemFromWishlist() {
        Common.clickOnElement(Locator.Varle.WishList.labelPasalinti);
    }

    public static String readMessageEmtyWishlist() {
        return Common.getTextFromElement(Locator.Varle.WishList.messageEmtyWishlist);
    }

    public static void clickButtonAtsijungtiWithActions() {
        Common.leftClickWithActions(Locator.Varle.WishList.buttonAtsijungti);
    }
}