package lt.indre.pom.pages.varle_Lt;

import lt.indre.pom.pages.Common;
import lt.indre.pom.pages.Locator;

public class WishlistPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void acceptLeistiVisusSlapukus() {
        Common.waitElementWhenVisible(Locator.Varle.SetUp.buttonCookies, 8);
        Common.clickOnElement(Locator.Varle.SetUp.buttonCookies);
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
        Common.waitElementWhenAvailableCustomised(Locator.Varle.WishList.itemSoyssSampunasOleoItense, 3);
        Common.clickOnElement(Locator.Varle.WishList.itemSoyssSampunasOleoItense);
    }

    public static void clickOnHeartSymbolToPutItemSoyssSampunasOleoItemToPatikusiosPrekes() {
        Common.waitElementWhenAvailableCustomised(Locator.Varle.WishList.checkboxSymbolHeart, 3);
        Common.clickOnElement(Locator.Varle.WishList.checkboxSymbolHeart);
    }

    public static void clickOnVarleLogoToReturnVarleMainPage() {
        Common.waitElementWhenAvailableCustomised(Locator.Varle.WishList.logoVarle, 3);
        Common.clickOnElement(Locator.Varle.WishList.logoVarle);
    }

    public static void clickOnPrisijungimas() {
        Common.clickOnElement(Locator.Varle.SetUp.labelPrisijungimas);
    }

    public static void writeDataInPrisijungimasFields(String attributeId, String attribute2Id, String email) {
        Common.sendKeysToElement(Locator.Varle.SetUp.attributeIdPrisijungimas(attributeId, attribute2Id),
                email);
    }

    public static void clickOnButtonPrisijungti() {
        Common.clickOnElement(Locator.Varle.SetUp.buttonPrisijungti);
    }

    public static void clickOnPatikusiosPrekes() {
        Common.waitElementWhenAvailableCustomised(Locator.Varle.WishList.buttonPatikusiosPrekes,5);
        Common.clickOnElement(Locator.Varle.WishList.buttonPatikusiosPrekes);
    }

    public static String readMessagePatikusiosPrekes() {
        return Common.getTextFromElement(Locator.Varle.WishList.messagePatikusiosPrekes)
                + "\n" +
                Common.getTextFromElement(Locator.Varle.WishList.titleSoyssSampunasOleoIntense);
    }

    public static void clickPasalintiToRemoveItemSoyssSampunasFromWishlist() {
        Common.clickOnElement(Locator.Varle.WishList.labelPasalinti);
    }

    public static String readMessageEmtyWishlist() {
        return Common.getTextFromElement(Locator.Varle.WishList.messageEmptyWishlist);
    }


}
