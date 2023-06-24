package com.jandrespardos.registerBlossom.model;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
   public static Target firtsName = Target.the("Input Firtsname")
            .located(By.xpath("//*[@id='customer.firstName']"));
    public static   Target lastName = Target.the("Input Lastname")
            .located(By.xpath("//*[@id='customer.lastName']"));
    public static  Target address = Target.the("Input Address")
            .located(By.xpath("//*[@id='customer.address.street']"));
    public static Target city = Target.the("Input City")
        .located(By.xpath("//*[@id='customer.address.city']"));
    public static Target state = Target.the("Input State")
        .located(By.xpath("//*[@id='customer.address.state']"));
    public static Target zipCode = Target.the("Input ZipCode")
        .located(By.xpath("//*[@id='customer.address.zipCode']"));
    public static Target phoneNumber = Target.the("Input PhoneNumber")
        .located(By.xpath("//*[@id='customer.phoneNumber']"));
    public static Target ssn = Target.the("Input SSN")
        .located(By.xpath("//*[@id='customer.ssn']"));
    public static Target userName = Target.the("Input UserName")
        .located(By.xpath("//input[@id='customer.username']"));
    public static Target password = Target.the("Input Password")
        .located(By.xpath("//input[@id='customer.password']"));
    public static Target confirmPassword = Target.the("Input ConfirmPassword")
        .located(By.xpath("//input[@id='repeatedPassword']"));
    public static Target registerButton = Target.the("Click RegisterButton")
        .located(By.xpath("//input[@value='Register']"));
    public static Target registerMessage = Target.the("RegisterMessage")
        .located(By.xpath("//h1[contains(text(),'Welcome')]"));


}
