package starter.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class inventoryPage extends PageObject {

    WebDriver driver =getDriver();

    private final By headerTittle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By cartIcon = By.cssSelector("#shopping_cart_container > a");
    private final By removeIcon = By.cssSelector("#remove-sauce-labs-onesie");
    private final By sortingDropDown = By.className("product_sort_container");
    private final By activeOption = By.className("active_option");
    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public String getHeaderTittle(){
        return driver.findElement(headerTittle).getText();
    }

    public boolean isCartVisible(){
        return driver.findElement(cartIcon).isDisplayed();
    }

    public void addItem(String item){
        driver.findElement(By.id(item)).click();
    }

    public boolean removeIcon(){
        return driver.findElement(removeIcon).isDisplayed();
    }

    public void clickIcon(){
        driver.findElement(cartIcon).click();
    }

    public void selectSortItem(String sortBy){

        Select dropdown= new Select(driver.findElement(sortingDropDown));

        dropdown.selectByValue(sortBy);
    }

    public String getActiveOption(){
        return driver.findElement(activeOption).getText();
    }
}