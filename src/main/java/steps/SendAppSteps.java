package steps;

import pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

import static junit.framework.TestCase.assertTrue;

public class SendAppSteps {
    public void checkPageTitle() {
    }

    public void fillFields(HashMap<String, String> testData) {
    }

    public void checkFillFields(HashMap<String, String> testData) {
    }

    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value){
        new SendAppPage().fillField(field, value);
    }

    @Step("поле {0} заполнено значением {1}")
    public void checkFillField(String field, String value){
        String actual = new SendAppPage().getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));
    }
    @Step("в поле {0} присутствует сообщение об ошибке {1}")
    public void checkErrorMessageField(String field, String value){
        new SendAppPage().checkFieldErrorMessage(field, value);
    }
    @Step("заголовок страницы - Страхование путешественников равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = new SendAppPage().title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("заполняются поля")
    public void fillFields(HashMap<String, String> fields);

    @Step("поля заполнены верно")
    public void checkFillFields(HashMap<String, String> fields);
    }

}
