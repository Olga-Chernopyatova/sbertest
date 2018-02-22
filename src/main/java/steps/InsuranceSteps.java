package steps;

import pages.InsurancePage;
import ru.yandex.qatools.allure.annotations.Step;

public class InsuranceSteps {

    @Step("выполнен выбор суммы страховой защиты  Минимальная")
    public void selectMenuCoverage(){
        new InsurancePage(BaseSteps.getDriver()).activeButton.click();
    }


    @Step("выполнено нажатие на Оформить")
    public void selectMenuSubmit() {
            new InsurancePage(BaseSteps.getDriver()).sendButton.click();
    }


    @Step("выплнено нажатие - Оформить Онлайн")
    public void stepClickToBanner(){
        new InsurancePage(BaseSteps.getDriver()).bannerBtn.click();
    }

    @Step("выплнено переключение в новое окно")
    public void stepSwitchToWindow(){
        for (String winHandle : BaseSteps.getDriver().getWindowHandles()) {
            BaseSteps.getDriver().switchTo().window(winHandle);
        }
    }


}
