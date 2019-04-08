package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thomas on 2016-06-15.
 */
public class ContactSearchPageIOS implements ContactSearchPage {

    public ContactSearchPageIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "Search for contact")
    public MobileElement searchFieldDefault;

    @FindBy(xpath = "//*[@name=\"Search results\"]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    public MobileElement firstSearchResultName;

    public void search(String name) {
        searchFieldDefault.click();
        searchFieldDefault.sendKeys(name);
    }

    public MobileElement getFirstSearchResult() {
        return firstSearchResultName;
    }
}
