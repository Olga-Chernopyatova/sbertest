package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();

    ConfirmSteps dmsSteps = new ConfirmSteps();

    InsuranceSteps insuranceSteps = new InsuranceSteps();

    SendAppSteps sendAppSteps = new SendAppSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String menuItem){
        MainPageSteps.selectMenuItem(menuItem);
    }

    @When("^выбран вид страхования \"(.+)\"$")
    public void selectMenuInsurance(String menuName){
        MainPageSteps.selectMenuInsurance(menuName);
    }

    @When("^выполнено нажати на кнопку Оформить онлайн$")
    public void clickBtnSendApp(){
        ConfirmSteps.stepGoToInsurancePage();
    }

    @When ("выполнен выбор суммы страховой защиты  Минимальная")
    public void selectMenuCoverage() {
    InsuranceSteps.selectMenuCoverage();
    }

    @When("выполнено нажатие на Оформить")
    public void stepClickToBanner() {
        InsuranceSteps.stepClickToBanner();
    }

    @When("выплнено переключение в новое окно")
    public void stepSwitchToWindow(){
        InsuranceSteps.stepSwitchToWindow();
    }

    @When("заполняются поля")
    public void fillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> SendAppSteps.fillField(field, value));

    }
}