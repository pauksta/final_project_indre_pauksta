package lt.indre.pom.tests.varleLt;

import lt.indre.pom.pages.Common;
import lt.indre.pom.pages.varleLt.VarlePage;
import lt.indre.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VarleTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        VarlePage.openChrome("https://www.varle.lt/");
        VarlePage.acceptLeistiVisusSlapukus();
    }

    @Test
    public void testAccountRegistrationWithValidEmail() {
        String email = "bandymas1@gmail.com";
        String password = "1234";
        String expectedMessage = "Ar tikrai norite ištrinti savo Varlė.lt paskyrą?";
        String actualMessage;

        VarlePage.clickOnButtonPrisijungimas();
        VarlePage.clickOnTextRegistruotis();
        VarlePage.inputValidElPastas(email);
        VarlePage.inputSlaptazodis("password1", password);
        VarlePage.inputSlaptazodis("password2", password);
        VarlePage.clickToCheckSusipazinauSuNaudojimoTaisyklemis();
        VarlePage.clickOnButtonRegistruotis();
        VarlePage.clickOnProfile();
        VarlePage.clickOnButtonManoDuomenys();
        VarlePage.clickOntextNaikintiPaskyra();
        actualMessage = VarlePage.readMessagetoSumbitToDeleteAccount();
        VarlePage.clickOnTaipToSumbitDeleteAccount();

        Assert.assertTrue(
                actualMessage.contains(expectedMessage),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualMessage, expectedMessage
                )
        );
    }

    @Test
    public void testLoginToAccountWithNonExistingAccountInfo() {
        String email = "fake@gmail.com";
        String password = "123";
        String expectedMessage = "Pateiktas el. pašto adresas ir/arba slaptažodis yra neteisingi.";
        String actualMessage;

        VarlePage.clickOnButtonPrisijungimas();
        VarlePage.writeDataInPrisijungimasFields("email", "login", email);
        VarlePage.writeDataInPrisijungimasFields("password", "password", password);
        VarlePage.clickOnButtonPrisijungti();
        actualMessage = VarlePage.readMessageAfterUnsuccessfulLogin();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testPutItemToKrepselis() {
        String expectedResult = "Prekė įtraukta į krepšelį";
        String actualResult;
        String itemTitle = "Dulkių siurblys Dyson V11 ";

        VarlePage.writeItemTitleInPaieska(itemTitle);
        Common.clickEnterButton();
        VarlePage.clickOnRequiredFirstItemTitle();
        VarlePage.clickOnButtonIKrepseli();
        actualResult = VarlePage.readMessageAfterItemPutToKrepselis();
        VarlePage.clickOnbuttonPrekintisToliau();
        VarlePage.clickOnPrekiuKrepselis();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }

    @Test
    public void testDeleteItemsFromPrekiuKrepselis() {
        String expectedResult = "Krepšelis\nTuščias";
        System.out.println(expectedResult);
        String actualResult;
        String itemTitle = "Kavos aparatas DeLonghi ECAM22.110.SB";

        VarlePage.writeItemTitleInPaieska(itemTitle);
        Common.clickEnterButton();
        VarlePage.clickOnItem();
        VarlePage.clickOnPlusToIncreaseQuantityOfItem();
        VarlePage.clickOnButtonIKrepseli();
        VarlePage.clickOnbuttonPrekintisToliau();
        VarlePage.clickOnPrekiuKrepselis();
        VarlePage.clickOnXToRemoveItemsFromKrepselis();
        actualResult = VarlePage.readMessageEmptyBasket();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }



}
