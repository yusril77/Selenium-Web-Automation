package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.cartPage;
import starter.Pages.inventoryPage;
import static org.junit.Assert.*;

public class sortStepDefinition {

    inventoryPage InventoryPage;
    cartPage CartPage;

    @When("I clicked sorting {string}")
    public void IClickedSortingIcon(String sortBy){
        InventoryPage.selectSortItem(sortBy);
    }

    @Then("The products should automatically sorted to {string}")
    public void TheProductsShouldAutomaticallySorted(String sortBy){
        assertEquals("NAME (Z TO A)", InventoryPage.getActiveOption());
    }

    @And("I remove one item")
    public void IRemove(){
        CartPage.selectRemove();
    }

    @And("I click continue shopping buttons")
    public void clickContinueButton(){
        CartPage.clickContinueButton();
    }
}