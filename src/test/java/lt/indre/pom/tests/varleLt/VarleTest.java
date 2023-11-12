package lt.indre.pom.tests.varleLt;

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
}
