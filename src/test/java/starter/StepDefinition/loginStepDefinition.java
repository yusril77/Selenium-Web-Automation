package starter.StepDefinition;

import io.cucumber.java.bs.I;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.inventoryPage;
import starter.Pages.loginPage;

import static org.junit.Assert.*;

public class loginStepDefinition {

    loginPage loginPage;
    inventoryPage InventoryPage;

    @Given("I already on log in page")
    public void IAlreadyOnLoginPage(){
        loginPage.open();
    }

    @When("I input username {string}")
    public void IInputUsername(String username){

        loginPage.InputUsername(username);
    }

    @And("I input password {string}")
    public void IInputPassword(String password){

        loginPage.InputPassword(password);
    }

    @And("I click login button")
    public void IClickLoginButton(){

        loginPage.clickButton();
    }

    @Then("Should be directed to Inventory Page")
    public void ShouldbeDirectedtoInventoryPage(){
        assertEquals("https://www.saucedemo.com/inventory.html", InventoryPage.getUrl());
        assertEquals("PRODUCTS", InventoryPage.getHeaderTittle());
        assertTrue(InventoryPage.isCartVisible());

    }

    @Given("I already logged in")
    public void IAlreadyLoggedIn(){
        loginPage.open();
        loginPage.InputUsername("standard_user");
        loginPage.InputPassword("secret_sauce");
        loginPage.clickButton();

    }
}
