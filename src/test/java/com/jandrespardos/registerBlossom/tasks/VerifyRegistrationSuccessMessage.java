package com.jandrespardos.registerBlossom.tasks;

import com.jandrespardos.registerBlossom.questions.HavewelcomeMessage;
import com.jandrespardos.registerBlossom.questions.TakeScreenshot;
import com.jandrespardos.registerBlossom.util.ScreenshotUtil;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

public class VerifyRegistrationSuccessMessage  implements Task {
    public static VerifyRegistrationSuccessMessage isVerifyRegistrationSuccessMessage() {
        return new VerifyRegistrationSuccessMessage();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean haveMessage = actor.asksFor(HavewelcomeMessage.isRight());
        actor.attemptsTo(
                Ensure.that(haveMessage).isTrue()
        );



    }
}
