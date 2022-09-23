package starter.StepDefinition;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.*;

import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class addCartStepDefinition {

    inventoryPage InventoryPage;
    cartPage CartPage;
    checkoutPageOne CheckOutPageOne;
    checkoutPageTwo CheckOutPageTwo;
    checkoutCompletePage CheckOutCompletePage;
    @When("I select an item {string}")
    public void ISelectAnItems(String item){
        InventoryPage.addItem(item);
    }

    @Then("Item should be added")
    public void ItemShouldBeAdded(){
        assertTrue(InventoryPage.removeIcon());
    }

    @When("I click Cart icon")
    public void IClickCartIcon(){
        InventoryPage.clickIcon();
    }

    @And("I redirected to Cart Page")
    public void IRedirectedToCartPage(){
        assertEquals("https://www.saucedemo.com/cart.html", CartPage.getUrl());
        assertEquals("QTY", CartPage.CartQuantity());
    }

    @And("I click Checkout button")
    public void IClickCheckoutButton(){
        CartPage.clickButton();
    }

    @And("I redirected to Checkout page one")
    public void IRedirectedToCheckoutPageOne(){
        assertEquals("https://www.saucedemo.com/checkout-step-one.html",CheckOutPageOne.getUrl());
    }

    @And("I input first name {string}")
    public void IInputFirstName(String firstname){
        CheckOutPageOne.InputFirstName(firstname);
    }

    @And("I input last name {string}")
    public void IInputLastName(String lastname){
        CheckOutPageOne.InputLastName(lastname);
    }

    @And("I input zip {int}")
    public void IInputZipCode(int zip){
        CheckOutPageOne.IInputZipCode(zip);
    }

    @And("I click continue button")
    public void IClickContinueButton(){
        CheckOutPageOne.clickButton();
    }

    @And("I redirected to Checkout page two")
    public void IRedirectedToCheckoutPageTwo(){
        assertEquals("https://www.saucedemo.com/checkout-step-two.html", CheckOutPageTwo.getUrl());
        assertEquals("CHECKOUT: OVERVIEW", CheckOutPageTwo.getHeaderTittle());
    }

    @Then("I click finish button")
    public void IClickFinishButton(){
        CheckOutPageTwo.clickButton();
    }

    @And("I redirected to Checkout complete page")
    public void IRedirectedToCheckoutCompletePage(){
        assertEquals("THANK YOU FOR YOUR ORDER", CheckOutCompletePage.getCompleteHeader());
    }
}