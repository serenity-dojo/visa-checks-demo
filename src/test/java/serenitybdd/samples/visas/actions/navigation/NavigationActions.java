package serenitybdd.samples.visas.actions.navigation;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class NavigationActions extends UIInteractionSteps {
    @Step("Open the visa check home page")
    public void toTheVisaCheckHomePage() {
        openPageNamed("visa.check.application");
        $(VisaCheckHomePage.START_NOW_BUTTON).click();
        $(CookieConfirmationPanel.ACCEPT_ALL_COOKIES).click();
        $(CookieConfirmationPanel.HIDE_COOKIE_OPTIONS).click();
    }
}
