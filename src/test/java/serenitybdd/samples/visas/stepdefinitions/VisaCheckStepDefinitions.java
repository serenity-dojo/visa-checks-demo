package serenitybdd.samples.visas.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitybdd.samples.visas.actions.application.ApplicationResults;
import serenitybdd.samples.visas.actions.application.VisaApplicationActions;
import serenitybdd.samples.visas.actions.navigation.NavigationActions;

import static org.assertj.core.api.Assertions.assertThat;

public class VisaCheckStepDefinitions {

    @Steps
    NavigationActions navigate;

    @Steps
    VisaApplicationActions theApplicant;

    @Steps
    ApplicationResults resultInfo;

    @Given("^(?:.*) wants to travel to the UK$")
    public void openVisaCheckHomePage() {
        navigate.toTheVisaCheckHomePage();
    }

    @When("^(?:.*) has a passport from (.*)$")
    public void passportFrom(String country) {
        theApplicant.hasAPassportFrom(country);
    }

    @When("^(?:.*) is coming to the UK for (.*)$")
    public void declarePurpose(String purpose) {
        theApplicant.isComingToTheUKFor(purpose);
    }

    @When("^(?:.*) is coming to the UK to (.*) for (.*)$")
    public void declarePurposeAndDuraction(String purpose, String duration) {
        theApplicant.isComingToTheUKFor(purpose);
        theApplicant.plansToStayInTheUKFor(duration);
    }

    @And("^(?:.*) (is|is not) travelling with or visiting a partner in the UK$")
    public void travellingWithOrVistingAParterInTheUK(String isOrIsNot) {
        theApplicant.isTravellingWithOrVisitingAPartner(isOrIsNot.equalsIgnoreCase("is"));
    }

    @Then("he/she should be told {string}")
    public void shouldSeeMessage(String expectedMessage) {
        assertThat(resultInfo.heading()).contains(expectedMessage);
    }
}
