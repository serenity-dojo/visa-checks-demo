package serenitybdd.samples.visas.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

import static org.assertj.core.api.Assertions.assertThat;

public class PostCodeStepDefinitions {

    String postCode;

    @Given("a postcode {}")
    public void aPostcode(String postCode) {
        this.postCode = postCode;
    }

    @When("I check the validity of the postcode")
    public void iCheckTheValidityOfThePostcode() {
        SerenityRest.given()
                .pathParam("postcode", postCode)
                .when().get("http://api.postcodes.io/postcodes/{postcode}");
    }

    @Then("the response status should be {int}")
    public void theResponseStatusShouldBeStatus(int expectedStatus) {
        assertThat(SerenityRest.lastResponse().statusCode()).isEqualTo(expectedStatus);
    }
}
