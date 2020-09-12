package serenitybdd.samples.visas.actions.application;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class ApplicationResults extends UIInteractionSteps {
    public String heading() {
        return $(ApplicationResultPage.RESULT_HEADING).getText();
    }
}
