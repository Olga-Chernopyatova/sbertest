package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendAppPage {

    @FindBy(name="insured0_surname")
    WebElement insured0_surname;

    @FindBy(name="insured0_name")
    WebElement insured0_name;

    @FindBy(name = "insured0_birthDate")
    WebElement insured0_birthDate;

    @FindBy(name = "surname")
    WebElement surname;

    @FindBy(name = "name")
    WebElement name;

    @FindBy(name = "middlename")
    WebElement middlename;

    @FindBy(name = "birthDate")
    WebElement birthDate;

    @FindBy(name = "male")
    WebElement male;

    @FindBy(name = "passport_series")
    WebElement passport_series;

    @FindBy(name = "passport_number")
    WebElement passport_number;

    @FindBy(name = "issueDate")
    WebElement issueDate;

    @FindBy(name = "issuePlace")
    WebElement issuePlace;

    @FindBy(xpath = "//*[contains(text(),'Продолжить')]")
    WebElement sendBtn;

    public SendAppPage(WebDriver driver){

        PageFactory.initElements(driver, this);
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOf(sendBtn));

    }


}
