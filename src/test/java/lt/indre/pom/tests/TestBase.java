package lt.indre.pom.tests;

import lt.indre.pom.pages.Common;
import lt.indre.pom.utilities.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class TestBase {
    @BeforeMethod
    public abstract void setUp();


    @AfterMethod
    public void tearDown() {
        Common.quitDriver();
    }

}
