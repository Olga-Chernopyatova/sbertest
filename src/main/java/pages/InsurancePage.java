package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurancePage {

    @FindBy(xpath = "//div[contains(@class,'b-form-active-box')]")
    WebElement sendButton;

    @FindBy(xpath = "//span[contains(text(),'Оформить')]")
    WebElement sendButton;

    public InsurancePage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }
}
