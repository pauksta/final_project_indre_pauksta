package lt.indre.pom.tests.varleLt;

import lt.indre.pom.pages.varleLt.ShoppingCartPage;
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
    public void testAddItemDulkiuSiurblysDysonV11ToShoppingCart() {

        String itemTitle = "Dulkių siurblys Dyson V11 ";
        String expectedResult = "Krepšelis\nDulkių siurblys Dyson V11 Absolute";
        String actualResult;

        ShoppingCartPage.inputItemTitleInPaieska(itemTitle);
        ShoppingCartPage.clickOnPaieskaWithAction();
        ShoppingCartPage.clickOnItemDulkiuSiurblysDysonV11();
        ShoppingCartPage.clickOnButtonIKrepseli();
        ShoppingCartPage.clickOnButtonPrekintisToliau();
        ShoppingCartPage.clickOnPrekiuKrepselis();
        actualResult = ShoppingCartPage.readMessageInKrepselisIsItemDulkiuSiurblysDysonV11();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }

    @Test
    public void testDeleteTwoItemsKavosAparatasDeLonghiEcam22FromShoppingCart() {
        String expectedResult = "Krepšelis\nTuščias";
        String actualResult;
        String itemTitle = "Kavos aparatas DeLonghi ECAM22.110.SB";

        ShoppingCartPage.inputItemTitleInPaieska(itemTitle);
        ShoppingCartPage.clickOnPaieskaWithAction();
        ShoppingCartPage.clickOnItemKavosAparatasDelonghiEcam22();
        ShoppingCartPage.clickOnPlusToIncreaseQuantityOfItemKavosAparatasDelonghiEcam22();
        ShoppingCartPage.clickOnButtonIKrepseli();
        ShoppingCartPage.clickOnButtonPrekintisToliau();
        ShoppingCartPage.clickOnPrekiuKrepselis();
        ShoppingCartPage.clickOnXToRemoveTwoItemsKavosAparatasDelonghiEcam22FromKrepselis();
        actualResult = ShoppingCartPage.readMessageEmptyBasket();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );

    }
}
