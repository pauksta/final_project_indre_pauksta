package lt.indre.pom.tests.varle_Lt;

import lt.indre.pom.pages.varle_Lt.ShoppingCartPage;
import lt.indre.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        ShoppingCartPage.openChrome("https://www.varle.lt/");
        ShoppingCartPage.acceptLeistiVisusSlapukus();
    }

    @Test
    public void testAddItemDulkiuSiurblysDysonV10ToShoppingCart() {

        String itemTitle = "Dulkių siurblys Dyson V10 ";
        String expectedResult = "Krepšelis\nDulkių siurblys Dyson V10 Absolute";
        String actualResult;

        ShoppingCartPage.inputItemTitleInPaieska(itemTitle);
        ShoppingCartPage.clickOnPaieskaWithAction();
        ShoppingCartPage.clickOnItemDulkiuSiurblysDysonV10();
        ShoppingCartPage.clickOnButtonIKrepseliWithActions();
        ShoppingCartPage.clickOnButtonPrekintisToliau();
        ShoppingCartPage.clickOnPrekiuKrepselis();
        actualResult = ShoppingCartPage.readMessageInKrepselisIsItemDulkiuSiurblysDysonV10();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }

    @Test
    public void testDeleteTwoItemsKavosAparatasDeLonghiEcam22FromShoppingCart() {

        String itemTitle = "Kavos aparatas DeLonghi ECAM22.110.SB";
        String expectedResult = "Krepšelis\nTuščias";
        String actualResult;

        ShoppingCartPage.inputItemTitleInPaieska(itemTitle);
        ShoppingCartPage.clickOnPaieskaWithAction();
        ShoppingCartPage.clickOnItemKavosAparatasDelonghiEcam22();
        ShoppingCartPage.clickOnPlusToIncreaseQuantityOfItemKavosAparatasDelonghiEcam22();
        ShoppingCartPage.clickOnButtonIKrepseliWithActions();
        ShoppingCartPage.clickOnButtonPrekintisToliau();
        ShoppingCartPage.clickOnPrekiuKrepselis();
        ShoppingCartPage.clickOnXToRemoveTwoItemsKavosAparatasDelonghiEcam22FromKrepselis();
        actualResult = ShoppingCartPage.readMessageEmptyShoppingCart();

        Assert.assertTrue(
               actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );

    }
}
