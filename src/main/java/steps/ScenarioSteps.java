package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();

    ConfirmSteps confirmSteps = new ConfirmSteps();

    InsuranceSteps insuranceSteps = new InsuranceSteps();

    SendAppSteps sendAppSteps = new SendAppSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String menuItem){
        mainPageSteps.selectMenuItem(menuItem);
    }

    @When("^выбран вид страхования \"(.+)\"$")
    public void selectMenuInsurance(String menuName){
        mainPageSteps.selectMenuInsurance(menuName);
    }

    @When("^выполнено нажати на кнопку Оформить онлайн$")
    public void clickBtnSendApp(){
        confirmSteps.stepGoToInsurancePage();
    }

    @When ("выполнен выбор суммы страховой защиты Минимальная")
    public void selectMenuCoverage() {
        insuranceSteps.selectMenuCoverage();
    }

    @When("выполнено нажатие на Оформить")
    public void stepClickToBanner() {
        insuranceSteps.stepClickToBanner();
    }

    @When("выплнено переключение в новое окно")
    public void stepSwitchToWindow(){
        insuranceSteps.stepSwitchToWindow();
    }

    @When("заполняются поля:")
    public void fillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> sendAppSteps.fillField(field, value));

    }
}