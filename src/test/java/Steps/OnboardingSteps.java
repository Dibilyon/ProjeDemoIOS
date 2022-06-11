package Steps;

import Pages.OnboardingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class OnboardingSteps
{
public OnboardingSteps() throws MalformedURLException
{
}
OnboardingPage o1 = new OnboardingPage();

@When("Arrow button on first page is clicked")
    public void clickArrowButtonOnFirstPage(){o1.clickNextBtn();}
    @And("Arrow button on second page is clicked")
    public void clickArrowButtonOnSecondPage(){o1.clickNextBtn();}
    @And("Arrow button on third page is clicked")
    public void clickArrowButtonOnThirdPage(){o1.clickNextBtn();}
    @And("Arrow button on fourth page is clicked")
    public void clickArrowButtonOnFourthPage(){o1.clickNextBtn();}
    @And("Arrow button on fifth page is clicked")
    public void clickArrowButtonOnFifthPage(){o1.clickNextBtn();}
    @Then("Login page is verified")
    public void verifyLoginPage(){o1.verifyLoginPage();}



}
