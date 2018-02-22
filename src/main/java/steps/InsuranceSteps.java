package steps;

import pages.InsurancePage;
import ru.yandex.qatools.allure.annotations.Step;

public class InsuranceSteps {

    @Step("выполнен выбор суммы страховой защиты  Минимальная")
    public static void selectMenuCoverage(){
        new InsurancePage(BaseSteps.getDriver()).activeButton.click();
    }


    @Step("выполнено нажатие на Оформить")
    public static void stepClickToBanner() {
            new InsurancePage(BaseSteps.getDriver()).bannerBtn.click();
    }

    @Step("выплнено переключение в новое окно")
    public static void stepSwitchToWindow(){
        for (String winHandle : BaseSteps.getDriver().getWindowHandles()) {
            BaseSteps.getDriver().switchTo().window(winHandle);
        }
    }


}
