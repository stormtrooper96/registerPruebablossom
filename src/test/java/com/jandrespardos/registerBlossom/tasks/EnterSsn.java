package com.jandrespardos.registerBlossom.tasks;

import com.jandrespardos.registerBlossom.model.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterSsn implements Task {
    private String ssn;

    public EnterSsn(String ssn) {
        this.ssn = ssn;
    }
    public static EnterSsn withSsn(String ssn) {
        return new EnterSsn(ssn);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(ssn).into(RegisterPage.ssn)
        );
    }
}
