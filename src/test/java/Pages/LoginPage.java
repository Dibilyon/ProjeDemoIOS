package Pages;

import Utils.Driver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static Pages.HelperClass.scroll;
import static Pages.HelperClass.verifyPage;

public class LoginPage
{
    public LoginPage()throws MalformedURLException
    {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);

    }
    @iOSXCUITFindBy(accessibility ="btn_login" )
    private IOSElement loginBtn;
    @iOSXCUITFindBy(accessibility = "inpt_phone")
    private IOSElement phoneTxt;
    @iOSXCUITFindBy(accessibility = "Beni Hatırla")
    private IOSElement beniHatirlachckbox;
    @iOSXCUITFindBy(accessibility = "btn_continue")
    private IOSElement btnContinue;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    private IOSElement password1;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private IOSElement password2;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther")
    private IOSElement password3;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther")
    private IOSElement password4;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther")
    private IOSElement password5;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeOther")
    private IOSElement password6;
    @iOSXCUITFindBy(accessibility = "Şifremi Unuttum")
    private IOSElement forgotpw;
    @iOSXCUITFindBy(accessibility = "Norma.HomeView")
    private IOSElement homePageHeader;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"view_code\"`]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    private IOSElement otp1;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"view_code\"`]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private IOSElement otp2;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"view_code\"`]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther")
    private IOSElement otp3;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"view_code\"`]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther")
    private IOSElement otp4;
    @iOSXCUITFindBy(accessibility = "Giden")
    private IOSElement test;
    @iOSXCUITFindBy(accessibility = "Para Transferi")
    private IOSElement btnMoneyTransfer;



    @iOSXCUITFindBy(accessibility = "inpt_id_no")
    private IOSElement inputTC;
    public void clickLoginBtn(){loginBtn.click();}
    public void inputPhoneTxt()
    {
        phoneTxt.sendKeys("5412000005");

    }
    public void clickContinueBtn()
    {
        btnContinue.click();
    }
    public void inputPassword()
    {
        password1.sendKeys("1");
        password2.sendKeys("1");
        password3.sendKeys("2");
        password4.sendKeys("2");
        password5.sendKeys("3");
        password6.sendKeys("3");
    }
    public void inputOtp()
    {
        otp1.sendKeys("1");
        otp2.sendKeys("2");
        otp3.sendKeys("3");
        otp4.sendKeys("4");

    }
    public void verifyHomePage() {
        verifyPage(homePageHeader,"Login");

    }
    public void scrollToGiderler()
    {

            scroll(test,"down");
            scroll(btnMoneyTransfer,"up");
    }

}
