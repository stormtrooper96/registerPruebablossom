package com.jandrespardos.registerBlossom.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TakeScreenshot implements Question<byte[]> {

    public static TakeScreenshot ofPage() {
        return new TakeScreenshot();
    }

    @Override
    public byte[] answeredBy(Actor actor) {
        return  actor.recall("SCREENSHOT");
    }
}
