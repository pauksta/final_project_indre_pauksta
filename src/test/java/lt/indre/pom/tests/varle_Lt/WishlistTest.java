package lt.indre.pom.tests.varle_Lt;

import lt.indre.pom.pages.varle_Lt.WishlistPage;
import lt.indre.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WishlistTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        WishlistPage.openChrome("https://www.varle.lt/");
        WishlistPage.acceptLeistiVisusSlapukus();

        String email = "abc@gmail.com";
        String password = "123456";
        WishlistPage.clickOnPrisijungimas();
        WishlistPage.writeDataInPrisijungimasFields("email", "login", email);
        WishlistPage.writeDataInPrisijungimasFields("password", "password", password);
        WishlistPage.clickOnButtonPrisijungti();
    }

    @Test(priority = 1)
    public void testAddItemSyossSampunasOleoIntenseToWishlist() {
        String itemTitle = "Syoss Šampūnas Oleo Intense";
        String expectedResult = "Patikusios prekės (1)\nSyoss Šampūnas Oleo Intense, 440ml";
        String actualResult;

        WishlistPage.inputItemTitleSoyssSampunasOleoItenseInPaieska(itemTitle);
        WishlistPage.clickOnPaieskaWithAction();
        WishlistPage.clickOnItemSoyssSampunasOleoItense();
        WishlistPage.clickOnHeartSymbolToPutItemSoyssSampunasOleoItemToPatikusiosPrekes();
        WishlistPage.clickOnVarleLogoToReturnVarleMainPage();
        WishlistPage.clickOnPatikusiosPrekes();
        actualResult = WishlistPage.readMessagePatikusiosPrekes();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }

    @Test(priority = 2)
    public void testRemoveItemSoyssSampunasOleoIntenseFromWishlist() {

        String expectedResult =
                "Tavo patikusių prekių sąrašas yra tuščias, norėdamas pridėti prekių į šį sąrašą ieškok ženkliuko";
        String actualResult;

        WishlistPage.clickPasalintiToRemoveItemSoyssSampunasFromWishlist();
        actualResult = WishlistPage.readMessageEmtyWishlist();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );

    }

}
