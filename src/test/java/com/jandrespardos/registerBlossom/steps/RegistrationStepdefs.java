package com.jandrespardos.registerBlossom.steps;

import com.jandrespardos.registerBlossom.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class RegistrationStepdefs {


    Actor jhon = Actor.named("Jhon");
    @Managed
    WebDriver driver;


    @Before
    public void setupActor() {
        jhon.can(BrowseTheWeb.with(driver));
    }

    @Given("Jhon is on the registration page")
    public void jhon_is_on_the_registration_page() {
        jhon.attemptsTo(
                NavigateToRegistrationPage.onRegistrationPage()
        );

    }


    @When("Jhon enters his first name as {string} and his last name as {string} and his address as {string}")
    public void jhonEntersHisFirstNameAsAndHisLastNameAsAndHisAddressAs(String name, String surname, String address) {
        jhon.attemptsTo(EnterPersonalInfoBasic.withNameSurnameAndAddress(name, surname, address));

    }
    @And("Jhon enters his city as {string} and his state as {string} and his zip code as {string}")
    public void jhonEntersHisCityAsAndHisStateAsAndHisZipCodeAs(String city, String state, String postalCode) {
        jhon.attemptsTo(EnterLocationInformation.withCityStateAndPostalCode(city, state, postalCode));

    }


    @And("Jhon enters his phone number as {string}")
    public void jhonEntersHisPhoneNumberAs(String phone) {
        jhon.attemptsTo(EnterPhoneNumber.withNumber(phone));

    }

    @And("Jhon enters his SSN as {string}")
    public void jhonEntersHisSSNAs(String ssn) {
        jhon.attemptsTo(EnterSsn.withSsn(ssn));

    }
    @And("Jhon enters his username as {string} with random number , his password as {string} and his confirm password as {string}")
    public void jhonEntersHisUsernameAsWithRandomNumberHisPasswordAsAndHisConfirmPasswordAs(String username, String password, String passwordConfirm) {
        jhon.attemptsTo(EnterCredentials.withCredentials(username, password, passwordConfirm));

    }


    @And("Jhon clicks on the register button")
    public void jhonClicksOnTheRegisterButton() {
        jhon.attemptsTo(SubmitForm.clickButton());
    }

    @Then("Jhon should see a registration success message")
    public void jhonShouldSeeARegistrationSuccessMessage() {
        jhon.attemptsTo(VerifyRegistrationSuccessMessage.isVerifyRegistrationSuccessMessage());
    }


    @Then("Jhon takes a screenshot of the registration success message")
    public void jhonTakesAScreenshotOfTheRegistrationSuccessMessage() {
        jhon.attemptsTo(TakeScreenshotTask.ofPage());

    }


}
