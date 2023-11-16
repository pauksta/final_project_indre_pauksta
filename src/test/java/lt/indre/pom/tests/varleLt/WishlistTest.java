package lt.indre.pom.tests.varleLt;

import lt.indre.pom.pages.varleLt.WishlistPage;
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

    @Test (priority =1)
    public void testaddItemSyossSampunasOleoIntenseToWishlist() {
        String itemTitle = "Syoss Šampūnas Oleo Intense";
        String expectedMessage = "Patikusios prekės (1)\nSyoss Šampūnas Oleo Intense, 440ml";
        String actualMessage;

        WishlistPage.inputItemTitleSoyssSampunasOleoItenseInPaieska(itemTitle);
        WishlistPage.clickOnPaieskaWithAction();
        WishlistPage.clickOnItemSoyssSampunasOleoItense();
        WishlistPage.clickOnHeartSymbolToPutItemSoyssSampunasOleoItemToPatikusiosPrekes();
        WishlistPage.clickOnVarleLogoToReturnVarleMainPage();
        WishlistPage.clickOnPatikusiosPrekes();
        actualMessage = WishlistPage.readMessagePatikusiosPrekes();

        Assert.assertTrue(
                actualMessage.contains(expectedMessage),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualMessage, expectedMessage
                )
        );
    }

    @Test (priority =2)
    public  void testremoveItemSoyssSampunasOleoIntenseFromWishlist(){

        String expectedResult = "Tavo patikusių prekių sąrašas yra tuščias, norėdamas pridėti prekių į šį sąrašą ieškok ženkliuko";
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
