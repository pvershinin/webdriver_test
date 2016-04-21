/**
 * Created by pafkaodessa on 4/20/16.
 */


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyTestWebdiver extends Driver {

    @BeforeMethod
    public void startTest() throws IOException {

        //startWebDriverFirefox();
        startWebDriverChrome();

    }

    @AfterMethod
    public void stopTest() {
        stopWebDriver();
    }

    @Test
    public void MyTest() {

        Google pageGoogle = new Google();
        Wikipedia pageWiki = new Wikipedia();

        pageGoogle.navigateToGoogle();
        pageGoogle.verifyGooglePage();
        pageGoogle.inputText("cat");
        pageGoogle.startSearchGoogle();

        if (pageGoogle.verifyWikiLink()) {

            pageGoogle.goToWikiPage();
            pageWiki.verifyWikiPage();

        }

    }

}
