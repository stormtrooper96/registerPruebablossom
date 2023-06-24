package com.jandrespardos.registerBlossom.tasks;

import com.jandrespardos.registerBlossom.model.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterPersonalInfoBasic implements Task {
    private final String firstName;
    private final String lastName;
    private final String address;


    public EnterPersonalInfoBasic(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public static EnterPersonalInfoBasic withNameSurnameAndAddress(String firstName, String lastName, String address) {
        return new EnterPersonalInfoBasic(firstName, lastName, address);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(RegisterPage.firtsName),
                Enter.theValue(lastName).into(RegisterPage.lastName),
                Enter.theValue(address).into(RegisterPage.address)
        );
    }
}