package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendAppPage {
    // сделал поля public, чтобы обратиться к ним из степов
    @FindBy(name="insured0_surname")
    public WebElement insured0_surname;

    @FindBy(name="insured0_name")
    public WebElement insured0_name;

    @FindBy(name = "insured0_birthDate")
    public WebElement insured0_birthDate;

    @FindBy(name = "surname")
    public WebElement surname;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "middlename")
    public WebElement middlename;

    @FindBy(name = "birthDate")
    public WebElement birthDate;

    @FindBy(name = "male")
    public WebElement male;

    @FindBy(name = "passport_series")
    public WebElement passport_series;

    @FindBy(name = "passport_number")
    public WebElement passport_number;

    @FindBy(name = "issueDate")
    public WebElement issueDate;

    @FindBy(name = "issuePlace")
    public WebElement issuePlace;

    @FindBy(xpath = "//*[contains(text(),'Продолжить')]")
    public WebElement sendBtn;

    //Добавила элемент для сообщения об ошибке
    @FindBy(xpath = "//div[@ng-show='tryNext && myForm.$invalid']")
    public WebElement error;

    public SendAppPage(WebDriver driver){

        PageFactory.initElements(driver, this);
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOf(sendBtn));

    }

    //метод для заполнения полей, field должно соответствовать ключу который ты запсала в HashMap testData в тесте
    public void fillField(String field, String value) {
        switch (field) {
            case "insured0_surname":
                fillField(insured0_surname, value);
                break;
            case "insured0_name":
                fillField(insured0_name, value);
                break;
            case "insured0_birthDate":
                fillField(insured0_birthDate, value);
                break;
            case "surname":
                fillField(surname, value);
                break;
            case "name":
                fillField(name, value);
                break;
            case "middlename":
                fillField(middlename, value);
                break;
            case "birthDate":
                fillField(birthDate, value);
                break;
            case "passport_series":
                fillField(passport_series, value);
                break;
            case "passport_number":
                fillField(passport_number, value);
                break;
            case "issueDate":
                fillField(issueDate, value);
                break;
            case "issuePlace":
                fillField(issuePlace, value);
                break;

            default:
                throw new AssertionError("Поле '" + field + "' отсутствует на странице");
        }
    }


    //метод для получения значения полей, field должно соответствовать ключу который ты запсала в HashMap testData в тесте

    public String getFillField(String field) {
        switch (field) {
            case "insured0_surname":
                return insured0_surname.getAttribute("value");
            case "insured0_name":
                return insured0_name.getAttribute("value");
            case "insured0_birthDate":
                return insured0_birthDate.getAttribute("value");
            case "surname":
                return surname.getAttribute("value");
            case "name":
                return name.getAttribute("value");
            case "middlename":
                return middlename.getAttribute("value");
            case "birthDate":
                return birthDate.getAttribute("value");
            case "passport_series":
                return passport_series.getAttribute("value");
            case "passport_number":
                return passport_number.getAttribute("value");
            case "issueDate":
                return issueDate.getAttribute("value");
            case "issuePlace":
                return issuePlace.getAttribute("value");

            default:
                throw new AssertionError("Поле '" + field + "' отсутствует на странице");
        }
    }

    //проверка того , что появилось сообщение об ошибке
    public void checkFieldErrorMessage(String value) {
        String actualValue = error.getText();
        Assert.assertTrue(String.format("Получено значение [%s]. Ожидаем [%s]", actualValue, value),
                actualValue.contains(value));
    }


    protected void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }
}
