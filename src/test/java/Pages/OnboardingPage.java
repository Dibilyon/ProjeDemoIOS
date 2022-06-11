package Pages;

import Utils.Driver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static Pages.HelperClass.verifyPage;

public class OnboardingPage
{
    public OnboardingPage()throws MalformedURLException
    {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);

    }
    @iOSXCUITFindBy (accessibility = "btn_next")
    private IOSElement nextBtn;
    @iOSXCUITFindBy(accessibility ="btn_login" )
    private IOSElement loginBtn;



    public void clickNextBtn()
    {
        nextBtn.click();
    }
    public void verifyLoginPage()
    {
        verifyPage(loginBtn,"Onboarding complete");
    }


}
