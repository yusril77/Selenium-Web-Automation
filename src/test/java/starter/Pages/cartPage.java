package starter.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage extends PageObject {

    WebDriver driver =getDriver();

    private final By cartQuantity = By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[1]");
    private final By checkoutIcon = By.cssSelector("#checkout");
    private final By removeItem = By.id("remove-test.allthethings()-t-shirt-(red)");
    private final By continueShopping = By.id("continue-shopping");
    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public void clickButton(){
        driver.findElement(checkoutIcon).click();
    }

    public String CartQuantity(){
        return driver.findElement(cartQuantity).getText();
    }

    public void selectRemove(){
        driver.findElement(removeItem).click();
    }

    public void clickContinueButton(){
        driver.findElement(continueShopping).click();
    }
}