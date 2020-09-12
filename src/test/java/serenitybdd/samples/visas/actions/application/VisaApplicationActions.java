package serenitybdd.samples.visas.actions.application;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class VisaApplicationActions extends UIInteractionSteps {

    @Step("Applicant has a passport from {0}")
    public void hasAPassportFrom(String country) {
        $(ApplicationForm.COUNTRY_DROPDOWN).selectByVisibleText(country);
        $(ApplicationForm.NEXT_STEP_BUTTON).click();
    }


    @Step("Applicant is coming to the UK for {0}")
    public void isComingToTheUKFor(String purpose) {
        $(ApplicationForm.purposeOptionFor(purpose)).click();
        $(ApplicationForm.NEXT_STEP_BUTTON).click();
    }

    @Step("Applicant plans to stay in the UK for {0}")
    public void plansToStayInTheUKFor(String duration) {
        $(ApplicationForm.durationOptionFor(duration)).click();
        $(ApplicationForm.NEXT_STEP_BUTTON).click();
    }

    @Step("Applicant is travelling with or visiting a partner: {0}")
    public void isTravellingWithOrVisitingAPartner(boolean isTravellingWithPartner) {
        $(ApplicationForm.travellingWithPartnerOption(isTravellingWithPartner)).click();
        $(ApplicationForm.NEXT_STEP_BUTTON).click();
    }
}
