package serenitybdd.samples.visas.actions.application;

import org.openqa.selenium.By;

class ApplicationForm {
    private static final String RADIO_BUTTON = "//label[.='%s']";

    static final By COUNTRY_DROPDOWN = By.id("response");
    static final By NEXT_STEP_BUTTON = By.xpath("//button[.='Next step']");

    static By purposeOptionFor(String purpose) {
        return By.xpath(String.format(RADIO_BUTTON, purpose));
    }

    static By durationOptionFor(String duration) {
        return By.xpath(String.format(RADIO_BUTTON, duration));
    }

    static By travellingWithPartnerOption(boolean yesNo) {
        return By.xpath(String.format(RADIO_BUTTON, yesNo ? "Yes" : "No"));
    }
}
