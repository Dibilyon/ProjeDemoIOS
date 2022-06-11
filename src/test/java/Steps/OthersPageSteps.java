package Steps;

import Pages.OthersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class OthersPageSteps
{
    public OthersPageSteps() throws MalformedURLException
    {
    }
    OthersPage o1 = new OthersPage();
    @When("Other button is clicked")
    public void clickOtherBtn(){o1.ClickOthersPageBtn();}
    @And("Create categories button is clicked")
    public void clickCreateCategoryBtn(){o1.addCategoryBtn();}
    @And("Contacts button is clicked")
    public void clickContactsButton(){o1.clickContactBtm();}
    @And("Create contacts button is clicked")
    public void clickCreateContactBtn(){o1.addContactBtm();}
    @When("Products button is clicked")
    public void clickProductsButton(){o1.clickProductBtn();}
    @Then("Create products button is clicked")
    public void clickCreateItemBtm(){o1.addProductBtn();}
}
