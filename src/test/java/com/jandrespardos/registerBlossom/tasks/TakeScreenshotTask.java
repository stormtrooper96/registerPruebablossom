package com.jandrespardos.registerBlossom.tasks;

import com.jandrespardos.registerBlossom.questions.TakeScreenshot;
import com.jandrespardos.registerBlossom.util.ScreenshotUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class TakeScreenshotTask  implements Task {
    public static TakeScreenshotTask ofPage() {
        return new TakeScreenshotTask();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getDriver();
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        actor.remember("SCREENSHOT", screenshot);
        String filePath = "target/screenshot.png";
        ScreenshotUtil.saveScreenshot(screenshot, filePath);
    }
}
