package lt.indre.pom.tests.varleLt;

import lt.indre.pom.pages.varleLt.RegistrationPage;
import lt.indre.pom.pages.varleLt.WishlistPage;
import lt.indre.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        RegistrationPage.openChrome("https://www.varle.lt/");
        RegistrationPage.acceptLeistiVisusSlapukus();

    }


    @Test(priority = 1)
    public void testAccountRegistrationWithValidEmail() {
        String email = "bandymas20@gmail.com";
        String password = "1234";
        String expectedMessage = "Sveiki,";
        String actualMessage;

        RegistrationPage.clickOnRegistracija();
        RegistrationPage.clickOnTextRegistruotis();
        RegistrationPage.inputValidElPastas(email);
        RegistrationPage.inputSlaptazodis("password1", password);
        RegistrationPage.inputSlaptazodis("password2", password);
        RegistrationPage.clickOnCheckboxSusipazinauSuNaudojimoTaisyklemis();
        RegistrationPage.clickOnButtonRegistruotis();
        actualMessage = RegistrationPage.readSveikiAccountName();
//        RegistrationPage.clickOnMyAccountSveiki();

        Assert.assertTrue(
                actualMessage.contains(expectedMessage),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualMessage, expectedMessage
                )
        );
    }

    @Test(priority = 2)
    public void testDeleteAccount() {
        String email = "bandymas20@gmail.com";
        String password = "1234";
        String expectedResult = "Registracija";
        String actualResult;

        RegistrationPage.clickOnPrisijungimas();
        RegistrationPage.writeDataInPrisijungimasFields("email", "login", email);
        RegistrationPage.writeDataInPrisijungimasFields("password", "password", password);
        RegistrationPage.clickOnButtonPrisijungti();
        RegistrationPage.clickOnManoDuomenys();
        RegistrationPage.clickOnNaikintiPaskyra();
        RegistrationPage.clickOnTaipToSubmitDeleteAccount();
        actualResult = RegistrationPage.readTextRegistracija();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );


    }
}

