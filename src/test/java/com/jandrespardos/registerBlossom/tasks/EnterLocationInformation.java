package com.jandrespardos.registerBlossom.tasks;

import com.jandrespardos.registerBlossom.model.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterLocationInformation implements Task {
    private String city;
    private String state;
    private String postalCode;


    public EnterLocationInformation(String city, String state, String postalCode) {
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }
    public static EnterLocationInformation withCityStateAndPostalCode(String city, String state, String postalCode) {
        return new EnterLocationInformation(city, state, postalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(RegisterPage.city),
                Enter.theValue(state).into(RegisterPage.state),
                Enter.theValue(postalCode).into(RegisterPage.zipCode)
        );
    }
}
