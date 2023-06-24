package com.jandrespardos.registerBlossom.questions;

import com.jandrespardos.registerBlossom.model.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class HavewelcomeMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return RegisterPage.registerMessage.resolveFor(actor).isDisplayed();
    }
    public static HavewelcomeMessage isRight(){
        return new HavewelcomeMessage();
    }
}
