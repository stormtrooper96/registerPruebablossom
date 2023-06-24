package com.jandrespardos.registerBlossom.tasks;

import com.jandrespardos.registerBlossom.model.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SubmitForm implements Task {


    public static SubmitForm clickButton() {
        return new SubmitForm();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(RegisterPage.registerButton.waitingForNoMoreThan(Duration.ofSeconds(10)))
    );

    }
}
