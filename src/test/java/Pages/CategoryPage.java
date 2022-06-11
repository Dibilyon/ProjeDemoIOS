package Pages;

import Utils.Driver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.List;

import static Pages.HelperClass.generateString;
import static Pages.HelperClass.verifyPage;

public class CategoryPage
{
    public CategoryPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }
    HelperClass h1 = new HelperClass();

    @iOSXCUITFindBy(accessibility = "inpt_name")
    private IOSElement inputNameTxt;
    @iOSXCUITFindBy(accessibility = "btn_category_icon")
    private IOSElement categoryIconBtn;
    @iOSXCUITFindBy(accessibility = "btn_category_color")
    private IOSElement categoryColorBtn;
    @iOSXCUITFindBy(accessibility = "Kaydet")
    private IOSElement saveBtn;
    @iOSXCUITFindBy(className = "XCUIElementTypeCell")
    private List<IOSElement> elementList;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable")
    private IOSElement content;


    public void inputNameTxt()
    {
        inputNameTxt.sendKeys(generateString(6));
    }
    public void clickIconBtn()
    {
        categoryIconBtn.click();

    }
    public void selectRandomIcon()
    {
       h1.randomElementSelect(elementList);
    }
    public void clickColorBtn()
    {categoryColorBtn.click();}

    public void selectRandomColor()
    {
        h1.randomElementSelect(elementList);
    }
    public void clickSaveBtn()
    {
        saveBtn.click();
    }
    public void verifyCategoryCreate()
    {
        verifyPage(content,"Category Creation");
    }

}
