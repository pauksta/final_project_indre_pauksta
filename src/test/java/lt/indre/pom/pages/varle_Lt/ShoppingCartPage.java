package lt.indre.pom.pages.varle_Lt;

import lt.indre.pom.pages.Common;
import lt.indre.pom.pages.Locator;

public class ShoppingCartPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void acceptLeistiVisusSlapukus() {
        Common.waitElementWhenVisible(Locator.Varle.SetUp.cookies,8);
        Common.clickOnElement(Locator.Varle.SetUp.cookies);
    }

    public static void inputItemTitleInPaieska(String itemTitle) {
        Common.sendKeysToElement(
                Locator.Varle.ShoppingCart.inputPaieska,
                itemTitle
        );
    }

    public static void clickOnPaieskaWithAction() {
        Common.clickEnterButton();

    }

    public static void clickOnButtonIKrepseli() {
        Common.waitElementWhenAvailableCustomised(Locator.Varle.ShoppingCart.buttonIKrepseli,10);
//        Common.clickOnElement(Locator.Varle.ShoppingCart.buttonIKrepseli);
        Common.click(Locator.Varle.ShoppingCart.buttonIKrepseli);
    }


    public static void clickOnButtonPrekintisToliau() {
        Common.waitElementWhenAvailableCustomised(Locator.Varle.ShoppingCart.buttonPrekintisToliau, 10);
        Common.clickOnElement(Locator.Varle.ShoppingCart.buttonPrekintisToliau);
    }

    public static void clickOnPrekiuKrepselis() {
        Common.waitElementWhenAvailableCustomised(Locator.Varle.ShoppingCart.buttonPrekiuKrepselis, 10);
        Common.clickOnElement(Locator.Varle.ShoppingCart.buttonPrekiuKrepselis);

    }

    public static void clickOnItemKavosAparatasDelonghiEcam22() {
        Common.waitElementWhenAvailableCustomised(Locator.Varle.ShoppingCart.itemKavosAparatasDelongiEcam22, 3);
        Common.clickOnElement(Locator.Varle.ShoppingCart.itemKavosAparatasDelongiEcam22);
    }

    public static void clickOnPlusToIncreaseQuantityOfItemKavosAparatasDelonghiEcam22() {
       Common.waitElementWhenAvailableCustomised(Locator.Varle.ShoppingCart.buttonQuantityUp, 3);
        Common.clickOnElement(Locator.Varle.ShoppingCart.buttonQuantityUp);
    }

    public static void clickOnXToRemoveTwoItemsKavosAparatasDelonghiEcam22FromKrepselis() {
        Common.clickOnElement(Locator.Varle.ShoppingCart.buttonRemoveItemFromKrepselis);
    }

    public static String readMessageEmptyBasket() {
        return Common.getTextFromElement(Locator.Varle.ShoppingCart.paragraphEmptyBasket);
    }


    public static void clickOnItemDulkiuSiurblysDysonV11() {
        Common.waitElementWhenVisible(Locator.Varle.ShoppingCart.itemDulkiuSiurblysDysonV11, 8);
        Common.clickOnElement(Locator.Varle.ShoppingCart.itemDulkiuSiurblysDysonV11);
    }

    public static String readMessageInKrepselisIsItemDulkiuSiurblysDysonV11() {
        return Common.getTextFromElement(Locator.Varle.ShoppingCart.messageTitleKrepselis) + "\n" +
                Common.getTextFromElement(Locator.Varle.ShoppingCart.messageTitleDulkiuSiurblysDysonV11);

    }

    public static void clickOnPrekiuKrepselisWithActions() {
        Common.click(Locator.Varle.ShoppingCart.buttonPrekiuKrepselis);
    }

    public static void clickOnXToRemoveItemsWithActions() {
        Common.click(Locator.Varle.ShoppingCart.buttonRemoveItemFromKrepselis);
    }
}
