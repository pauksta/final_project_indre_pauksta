package lt.indre.pom.tests.varleLt;

import lt.indre.pom.pages.varleLt.VarlePage;
import lt.indre.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;

public class VarleTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        VarlePage.openChrome("https://www.varle.lt/");
        VarlePage.acceptLeistiVisusSlapukus();
    }
}
