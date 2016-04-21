/**
 * Created by pafkaodessa on 4/20/16.
 */
import org.openqa.selenium.By;
import org.testng.Reporter;


public class Wikipedia extends BasePageObjects {
    private String logoSelector = "#p-logo";

    public void verifyWikiPage(){

        if (driver.findElements(By.cssSelector(logoSelector)).size() !=0 ) {

            // Reporter.log("This is a Wiki page",true);
            System.out.println("This is a Wiki page");

        }

        else Reporter.log("This is not a Wiki page",true);

    }

}
