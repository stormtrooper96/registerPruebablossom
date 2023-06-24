package com.jandrespardos.registerBlossom.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


public class NavigateToRegistrationPage implements Task {

    public static NavigateToRegistrationPage onRegistrationPage() {
        return new NavigateToRegistrationPage();
    }


    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Open.browserOn().thePageNamed("webdriver.base.url")
        );
    }

}
