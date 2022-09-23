package starter.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPageOne extends PageObject {

    WebDriver driver =getDriver();

    private final By headerTittle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By firstNameField = By.id("first-name");
    private final By lastNameField = By.id("last-name");
    private final By zipCode = By.xpath("//*[@id=\"postal-code\"]");
    private final By continueButton = By.cssSelector("#continue");

    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public String getHeaderTittle(){
        return driver.findElement(headerTittle).getText();
    }

    public void InputFirstName(String firstname){
        driver.findElement(firstNameField).sendKeys(firstname);
    }

    public void InputLastName(String lastname){
        driver.findElement(lastNameField).sendKeys(lastname);
    }

    public void IInputZipCode(int zip){
        driver.findElement(zipCode).sendKeys(Integer.toString(zip));
    }

    public void clickButton(){
        driver.findElement(continueButton).click();
    }
}
