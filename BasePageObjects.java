/**
 * Created by pafkaodessa on 4/20/16.
 */

import org.openqa.selenium.By;

public class BasePageObjects extends Driver {


    public void navigate (String url) {

        driver.get(url);
    }

    public String getTitle() {

        return driver.getTitle();

    }

    public void textSearch (String text, String selectorFind) {

        driver.findElement(By.cssSelector(selectorFind)).sendKeys(text);

    }
    public void clickSelector (String selectorClick) {

        driver.findElement(By.cssSelector(selectorClick)).click();

    }


}
