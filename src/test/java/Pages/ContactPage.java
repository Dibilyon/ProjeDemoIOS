package Pages;

import Utils.Driver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static Pages.HelperClass.*;

public class ContactPage
{
    public ContactPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }
    HelperClass h1 = new HelperClass();

    @iOSXCUITFindBy(accessibility = "inpt_name")
    private IOSElement nameTxt;
    @iOSXCUITFindBy(accessibility = "inpt_surname")
    private IOSElement surNameTxt;
    @iOSXCUITFindBy(accessibility = "inpt_email")
    private IOSElement emailTxt;
    @iOSXCUITFindBy(accessibility = "inpt_phone")
    private IOSElement phoneTxt;
    @iOSXCUITFindBy(accessibility = "inpt_norma_no")
    private IOSElement normaNoTxt;
    @iOSXCUITFindBy(accessibility = "inpt_iban")
    private IOSElement ibanTxt;
    @iOSXCUITFindBy(accessibility = "inpt_id_no")
    private IOSElement tcNoTxt;
    @iOSXCUITFindBy(accessibility = "btn_city")
    private IOSElement btnCity;
    @iOSXCUITFindBy(accessibility = "btn_district")
    private IOSElement btnDistrict;
    @iOSXCUITFindBy(accessibility = "inpt_address")
    private IOSElement addressTxt;
    @iOSXCUITFindBy(accessibility = "btn_done")
    private IOSElement toolbarCloseBtn;
    @iOSXCUITFindBy(accessibility = "btn_continue")
    private IOSElement btnSave;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private IOSElement content;



    public void inputNameTxt(){nameTxt.sendKeys(generateString(8));}
    public void inputsurNameTxt(){surNameTxt.sendKeys(generateString(6));}
    public void inputEmailTxt()
    {
        emailTxt.sendKeys(generateString(6)+"@test.com");
    scroll(tcNoTxt,"down");
    }
    public void inputPhoneTxt()
    {
        phoneTxt.sendKeys("543"+getRandomNumber(7));
    }
    public void inputNormaNoTxt()
    {
        normaNoTxt.sendKeys(getRandomNumber(10));
    }
    public void inputIbanNo(){ibanTxt.sendKeys(getRandomNumber(26));}
    public void inputTcNo(){
        tcNoTxt.sendKeys("20315185926");

        scroll(addressTxt,"down");}
    public void selectCity(){btnCity.click();
        h1.setPickerWheel("ADANA",Order.NEXT);

        toolbarCloseBtn.click();}
    public void selectDistrict(){btnDistrict.click();
        h1.setPickerWheel("ÇUKUROVA",Order.NEXT);
        toolbarCloseBtn.click();}
    public void inputAddressTxt()
    {
        addressTxt.sendKeys(generateString(40));
    }
    public void clickSaveBtn(){
        btnSave.click();
    }
    public void verifyContactCreate(){
        verifyPage(content,"Contact Creation");
    }









}
