package lt.indre.pom.pages.varleLt;

import lt.indre.pom.pages.Common;
import lt.indre.pom.pages.Locator;
import org.openqa.selenium.By;

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
        Common.clickOnElement(Locator.Varle.ShoppingCart.buttonIKrepseli);
    }

    public static String readMessageAfterItemPutToKrepselis() {
        return Common.getTextFromElement(Locator.Varle.ShoppingCart.paragraphPrekeItraukaIKrepseli);
    }

    public static void clickOnButtonPrekintisToliau() {
        Common.waitElementWhenAvailableCustomised(Locator.Varle.ShoppingCart.buttonPrekintisToliau, 3);
        Common.clickOnElement(Locator.Varle.ShoppingCart.buttonPrekintisToliau);
    }

    public static void clickOnPrekiuKrepselis() {
        Common.waitElementWhenAvailableCustomised(Locator.Varle.ShoppingCart.buttonPrekiuKrepselis, 3);
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
        Common.waitElementWhenAvailableCustomised(Locator.Varle.ShoppingCart.itemDulkiuSiurblysDysonV11, 5);
        Common.clickOnElement(Locator.Varle.ShoppingCart.itemDulkiuSiurblysDysonV11);
    }

    public static String readMessageInKrepselisIsItemDulkiuSiurblysDysonV11() {
        return Common.getTextFromElement(Locator.Varle.ShoppingCart.messageTitleKrepselis) + "\n" +
                Common.getTextFromElement(Locator.Varle.ShoppingCart.messageTitleDulkiuSiurblysDysonV11);

    }
}
