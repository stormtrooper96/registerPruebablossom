package com.jandrespardos.registerBlossom.tasks;

import com.jandrespardos.registerBlossom.model.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterPhoneNumber implements Task {
    private String phoneNumber;
    public EnterPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public static EnterPhoneNumber withNumber(String phoneNumber) {
        return new EnterPhoneNumber(phoneNumber);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(phoneNumber).into(RegisterPage.phoneNumber)

        );

    }
}
