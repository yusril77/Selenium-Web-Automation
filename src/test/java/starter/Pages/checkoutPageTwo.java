package starter.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPageTwo extends PageObject {

    WebDriver driver =getDriver();

    private final By headerTittle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By finishButton = By.cssSelector("#finish");

    public String getHeaderTittle(){
        return driver.findElement(headerTittle).getText();
    }

    public void clickButton(){
        driver.findElement(finishButton).click();
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
