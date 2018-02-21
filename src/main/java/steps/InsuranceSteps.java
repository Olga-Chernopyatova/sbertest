package steps;

import pages.InsurancePage;
import ru.yandex.qatools.allure.annotations.Step;

public class InsuranceSteps {

    @Step("выполнен выбор суммы страховой защиты  Минимальная")
    public void selectMenuCoverage(){
        new InsurancePage().sendAppBtn.click();
    }

    public void selectMenuSubmit() {
    }

    public void goToSendAppPage() {
    }

    @Step("выполнено нажатие на Оформить")
    public void selectMenuSubmit() {
            new InsurancePage().sendAppBtn.click();
    }


}
