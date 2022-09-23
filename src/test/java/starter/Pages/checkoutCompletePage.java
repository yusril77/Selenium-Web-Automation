package starter.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutCompletePage extends PageObject {

    WebDriver driver =getDriver();

    private final By completeHeader = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");

    public String getCompleteHeader(){
        return driver.findElement(completeHeader).getText();
    }
}
