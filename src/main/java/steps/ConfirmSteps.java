package steps;

import pages.ConfirmPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

public class ConfirmSteps {

    @Step("выполнено нажатие на Оформить онлайн")
    public static void stepGoToInsurancePage(){
        new ConfirmPage().sendAppBtn.click();
    }

    @Step("заголовок страницы - Страхование путешественников равен {0}")
    public static void checkPageTitle(String expectedTitle){
        String actualTitle = new ConfirmPage().title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

}
