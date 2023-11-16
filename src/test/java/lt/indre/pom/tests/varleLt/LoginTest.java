package lt.indre.pom.tests.varleLt;

import lt.indre.pom.pages.varleLt.LoginPage;
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

        String expectedMessage = "Pateiktas el. pašto adresas ir/arba slaptažodis yra neteisingi.";
        String actualMessage;

        LoginPage.clickOnPrisijungimas();
        LoginPage.writeDataInPrisijungimasFields("email", "login", email);
        LoginPage.writeDataInPrisijungimasFields("password", "password", password);
        LoginPage.clickOnButtonPrisijungti();
        actualMessage = LoginPage.readMessageAfterUnsuccessfulLogin();

        Assert.assertEquals(actualMessage, expectedMessage);
    }


}
