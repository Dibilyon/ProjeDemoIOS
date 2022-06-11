package Steps;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class LoginSteps
{
    public LoginSteps() throws MalformedURLException
    {
    }
    LoginPage l1 = new LoginPage();

    @When("Login button is clicked")
    public void clickLoginBtn(){l1.clickLoginBtn();}
    @And("Phone number field is filled")
    public void InputPhoneNo(){l1.inputPhoneTxt();}
    @And("Continue button is clicked")
    public void clickContinueBtn(){l1.clickContinueBtn();}
    @And("Password is filled in")
    public void inputPassword(){l1.inputPassword();}
    @And("Otp is filled in")
    public void inputOtp(){l1.inputOtp();}
    @And("Home Page is verified")
    public void verifyHomePage(){l1.verifyHomePage();}
    @And("Scroll to Giderler")
    public void scrollToGiderler(){l1.scrollToGiderler();}
}
