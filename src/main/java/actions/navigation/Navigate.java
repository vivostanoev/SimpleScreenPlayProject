package actions.navigation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navigate implements Task {
    private PageNavigation navigatePage;

    public Navigate(PageNavigation url){
        this.navigatePage = url;
    }

    @Step("{0} navigates to #section")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(this.navigatePage.url())
        );
    }

    public static Performable to(PageNavigation url) {
        return instrumented(Navigate.class, url);
    }
}
