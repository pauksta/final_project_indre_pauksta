package lt.indre.pom.tests.varle_Lt;

import lt.indre.pom.pages.varle_Lt.LoginPage;
import lt.indre.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openChrome("https://www.varle.lt/");
        LoginPage.acceptLeistiVisusSlapukus();
    }

    @DataProvider(name = "nonExistAccountInfo")
    public Object[][] provideNonExistAccountInfoToFields() {
        return new Object[][]{
                {"fake@gmail.com", "123"},
                {" ", "abda"},
        };
    }

    @Test(dataProvider = "nonExistAccountInfo")
    public void testNegativeLoginToAccountWithNonExistAccountInfo(String email, String password) {

        String expectedResult = "Pateiktas el. pašto adresas ir/arba slaptažodis yra neteisingi.";
        String actualResult;

        LoginPage.clickOnPrisijungimas();
        LoginPage.writeDataInPrisijungimasFields("email", "login", email);
        LoginPage.writeDataInPrisijungimasFields("password", "password", password);
        LoginPage.clickOnButtonPrisijungti();
        actualResult = LoginPage.readMessageAfterUnsuccessfulLogin();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }


}
