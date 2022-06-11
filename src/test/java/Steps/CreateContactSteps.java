package Steps;

import Pages.ContactPage;
import Pages.OthersPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.net.MalformedURLException;

public class CreateContactSteps
{
    public CreateContactSteps() throws MalformedURLException {

    }
    ContactPage c1 = new ContactPage();

    @And("Name field is filled in")
    public void inputNameTxt(){c1.inputNameTxt();}
    @And("Surname field is filled in")
    public void inputsurNameTxt(){c1.inputsurNameTxt();}
    @And("Email field is filled in")
    public void inputEmailTxt(){c1.inputEmailTxt();}
    @And("Phone number field is filled in")
    public void inputPhoneNoTxt(){c1.inputPhoneTxt();}
    @And("Norma No is filled in")
    public void inputNormaNo(){c1.inputNormaNoTxt();}
    @And("Iban Number field is filled in")
    public void inputIbanNoTxt(){c1.inputIbanNo();}
    @And("Tc no is filled in")
    public void inputTcNoTxt(){c1.inputTcNo();}
    @And("City is selected")
    public void selectCity(){c1.selectCity();}
    @And("District is selected")
    public void selectDistrict(){c1.selectDistrict();}
    @And("Address field is filled in")
    public void inputAddressTxt(){c1.inputAddressTxt();}
    @And("Save Contact button is clicked")
    public void clickSaveBtn(){c1.clickSaveBtn();}
    @Then("Contact Creation is verified")
    public void verifyContactCreate(){c1.verifyContactCreate();}

}
