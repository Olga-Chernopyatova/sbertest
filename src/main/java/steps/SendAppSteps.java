package steps;

import org.junit.Assert;
import pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

import static junit.framework.TestCase.assertTrue;

public class SendAppSteps {


    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value){
        new SendAppPage(BaseSteps.getDriver()).fillField(field, value);
    }

    @Step("поле {0} заполнено значением {1}")
    public void checkFillField(String field, String value){
        String actual = new SendAppPage(BaseSteps.getDriver()).getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));
    }
    @Step("присутствует сообщение об ошибке {1}")
    public void checkErrorMessageField(String value){
        new SendAppPage(BaseSteps.getDriver()).checkFieldErrorMessage(value);
    }

    @Step("выполнено нажатие на - Продолжить")
    public void stepSubmitForm(){
        new SendAppPage(BaseSteps.getDriver()).sendBtn.click();
    }


    @Step("заполняются поля")
    public void fillFields(HashMap<String, String> fields) {
        fields.forEach((field, value) ->
                new SendAppPage(BaseSteps.getDriver()).fillField(field, value));
    }



    @Step("поля заполнены верно")
    public void checkFillFields(HashMap<String, String> fields){
        fields.forEach((field, value) ->
                Assert.assertEquals( value, new SendAppPage(BaseSteps.getDriver()).getFillField(field)));

    }

}
