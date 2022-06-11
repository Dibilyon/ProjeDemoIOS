package Steps;

import Pages.CategoryPage;
import Pages.OthersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class CreateCategorySteps {

    public CreateCategorySteps() throws MalformedURLException {

    }
    CategoryPage cc = new CategoryPage();
    OthersPage o1 = new OthersPage();
    @When("Add Category Button is clicked")
    public void createCategoryBtnClick(){o1.addCategoryBtn();}
    @And("Category name is filled in")
    public void inputCategoryName(){cc.inputNameTxt();}
    @And("Icon select button is clicked")
    public void clickCategoryIconSelectBtn(){cc.clickIconBtn();}
    @And("Icon is selected randomly")
    public void randomIconSelect(){cc.selectRandomIcon();}
    @And("Color select button is clicked")
    public void clickCategoryColorSelectBtn(){cc.clickColorBtn();}
    @And("Color is selected randomly")
    public void randomColorSelect(){cc.selectRandomColor();}
    @And("Save button is clicked")
    public void clickSaveBtn(){cc.clickSaveBtn();}
    @Then("Category Creation is verified")
    public void verifyCategoryCreate(){cc.verifyCategoryCreate();}

}
