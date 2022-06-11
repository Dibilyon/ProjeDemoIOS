package Pages;

import Utils.Driver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class OthersPage
{
    public OthersPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);

    }
    @iOSXCUITFindBy(accessibility = "btn_other")
    private IOSElement otherBtn;
    @iOSXCUITFindBy(accessibility = "view_category")
    private IOSElement categoryBtn;
    @iOSXCUITFindBy(accessibility = "view_contact")
    private IOSElement contactBtn;
    @iOSXCUITFindBy(accessibility = "view_product")
    private IOSElement productBtn;
    @iOSXCUITFindBy(accessibility = "Kategori Ekle")
    private IOSElement addCategoryBtn;
    @iOSXCUITFindBy(accessibility = "Kontak Ekle")
    private IOSElement addContactBtn;
    @iOSXCUITFindBy(accessibility = "Ürün Ekle")
    private IOSElement addProductBtn;

    public void ClickOthersPageBtn()
    {
        otherBtn.click();
    }
    public void clickCategoryBtn() {categoryBtn.click();}
    public void clickContactBtm(){contactBtn.click();}
    public void clickProductBtn(){productBtn.click();}
    public void addCategoryBtn() {addCategoryBtn.click();}
    public void addContactBtm(){addContactBtn.click();}
    public void addProductBtn(){addProductBtn.click();}



}

