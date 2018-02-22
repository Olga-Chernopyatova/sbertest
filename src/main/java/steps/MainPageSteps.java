package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

import static steps.BaseSteps.driver;


public class MainPageSteps {

    @Step ("выбран пункт меню {0}")
    public static void selectMenuItem(String menuItem) {
        new MainPage(driver).selectMainMenu(menuItem);}

    @Step ("выбран вид страхования {0}")
    public static void selectMenuInsurance(String menuItem) {
        new MainPage(driver).selectSubMenu(menuItem);}

}
