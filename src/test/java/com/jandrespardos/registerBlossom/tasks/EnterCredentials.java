package com.jandrespardos.registerBlossom.tasks;

import com.jandrespardos.registerBlossom.model.RegisterPage;
import com.jandrespardos.registerBlossom.util.RandomNumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Date;
import java.util.Random;

public class EnterCredentials implements Task {
    private String username;
    private String password;
    private String confirmPassword;

    public EnterCredentials(String username, String password, String confirmPassword) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }




    public static EnterCredentials withCredentials(String username, String password, String confirmPassword) {
        return new EnterCredentials(username, password, confirmPassword);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username+ RandomNumber.generateRandomNumber(1, 999)).into(RegisterPage.userName),
                Enter.theValue(password).into(RegisterPage.password),
                Enter.theValue(confirmPassword).into(RegisterPage.confirmPassword));

    }
}
