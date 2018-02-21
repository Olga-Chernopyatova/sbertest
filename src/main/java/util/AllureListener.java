package util;

import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.junit.AllureRunListener;
import steps.BaseSteps;

import static steps.BaseSteps.driver;

public class AllureListener extends AllureRunListener{

    @Override
    public void testFailure (Failure failure) {
        BaseSteps.takeScreenshot();
        super.testFailure(failure);
    }

    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String attachName, String message) {
        return message;
    }
    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot)
                driver).getScreenshotAs(OutputType.BYTES);
    }


    }

