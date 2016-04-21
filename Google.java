/**
 * Created by pafkaodessa on 4/20/16.
 */

import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class Google extends BasePageObjects {
    private String selectorFind = "#lst-ib";
    private String selectorClick = "button[name='btnG']";
    private String classNameWikiLink = "h3 a[href*='wikipedia']";

    public void navigateToGoogle() {

        navigate("http://www.google.com.ua");
    }

    public void verifyGooglePage(){

        assertEquals("Google", getTitle());

    }

    public void inputText(String searchText) {

        textSearch(searchText, selectorFind);

    }

    public void startSearchGoogle () {

        clickSelector(selectorClick);

    }

    public boolean verifyWikiLink(){

        if (driver.findElements(By.cssSelector(classNameWikiLink)).size() !=0 ) {

            return true;

        }
        else {

            System.out.println("There isn't Wiki page");
            //Reporter.log("There isn't Wiki page",true);
            return false;
        }

    }

    public void goToWikiPage() {

        clickSelector(classNameWikiLink);
    }


}
